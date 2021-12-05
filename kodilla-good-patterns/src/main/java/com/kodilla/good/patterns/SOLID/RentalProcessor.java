package com.kodilla.good.patterns.SOLID;

import java.time.LocalDateTime;

public class RentalProcessor {

    private InformationService informationService;
    private RentalService rentalService;
    private RentalRepository rentalRepository;

    public RentalProcessor(InformationService informationService, RentalService rentalService, RentalRepository rentalRepository) {
        this.informationService = informationService;
        this.rentalService = rentalService;
        this.rentalRepository = rentalRepository;
    }

    public RentalProcessor(MailService mailService, CarRentalService carRentalService, CarRentalRepository carRentalRepository) {
    }

    public RentalDto process(final User user, final LocalDateTime from, final LocalDateTime to) {
        boolean isRented = rentalService.rent(user, from, to);
        if (isRented) {
            informationService.inform(user);
            rentalRepository.createRental(user, from, to);
            return new RentalDto(user, true);
        } else {
            return new RentalDto(user, false);
        }
    }
}
