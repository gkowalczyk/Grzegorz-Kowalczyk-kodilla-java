package com.kodilla.good.patterns.challenges.orderApp;

import com.kodilla.good.patterns.SOLID.RentRequest;

import java.time.LocalDateTime;

public class OrderProcessor {

    private InformationServiceInterface informationService;
    private OrderServiceInterface orderService;
    private OrderRepositoryInterface orderRepository;

    public OrderProcessor(final InformationServiceInterface informationService, final OrderServiceInterface orderService, final OrderRepositoryInterface orderRepository) {
        this.informationService = informationService;
        this.orderService = orderService;
        this.orderRepository = orderRepository;
    }

    public OrderDto process(final OrderRequest orderRequest) {
        boolean isOrder = orderService.order(orderRequest.getUser(), orderRequest.getDataOrder(), orderRequest.getDateDelivery(), orderRequest.getProduct());
        if (isOrder) {
            informationService.inform(orderRequest.getUser());
            orderRepository.createOrder(orderRequest.getUser(), orderRequest.getDataOrder(), orderRequest.getDateDelivery(), orderRequest.getProduct());
            return new OrderDto(orderRequest.getUser(), true);
        } else {
            return new OrderDto(orderRequest.getUser(), false);
        }
    }
}
