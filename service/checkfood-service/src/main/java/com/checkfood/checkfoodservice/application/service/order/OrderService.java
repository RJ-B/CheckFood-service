package com.checkfood.checkfoodservice.application.service.order;

import com.checkfood.checkfoodservice.application.entity.order.Order;

/**
 * Service pro práci s objednávkami.
 *
 * Zodpovědnosti:
 * - vytvoření objednávky
 * - změna stavu objednávky
 *
 * Používá:
 * - OrderRepository
 * - ReservationRepository
 *
 * Cross-cutting:
 * - cache (čtení objednávek)
 * - audit
 * - event (OrderCreatedEvent, OrderPaidEvent)
 */
public interface OrderService {

    // TODO:
    // - createOrder(...)
    // - markOrderAsPaid(...)
    // - cancelOrder(...)
}
