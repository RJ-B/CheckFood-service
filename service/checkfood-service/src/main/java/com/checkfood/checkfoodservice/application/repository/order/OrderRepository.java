package com.checkfood.checkfoodservice.application.repository.order;

import com.checkfood.checkfoodservice.application.entity.order.Order;

import java.util.List;
import java.util.Optional;

/**
 * Repository pro Order agregát.
 *
 * Používá se v:
 * - OrderService
 *
 * Cross-cutting:
 * - časté čtení → cache
 * - změny stavu → audit + event
 */
public interface OrderRepository {

    // TODO: uložit objednávku
    Order save(Order order);

    // TODO: najít objednávku podle ID
    Optional<Order> findById(Long id);

    // TODO: najít objednávky uživatele
    List<Order> findByUserId(Long userId);
}
