package com.kodilla.good.patterns.SOLID;

import java.time.LocalDateTime;

public interface RentalService {


    boolean rent(User user, LocalDateTime from, LocalDateTime to);
}
