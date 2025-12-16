package com.checkfood.checkfoodservice.application.entity.reservation;

/**
 * Doménová entita reprezentující rezervaci.
 *
 * Reservation je agregát:
 * - váže uživatele, restauraci a čas
 * - může vést k objednávce
 *
 * Cross-cutting:
 * - expirování → scheduler
 * - změna stavu → audit
 * - vytvoření → event (ReservationCreatedEvent)
 */
public class Reservation {

    // TODO: @Id
    private Long id;

    // TODO: čas rezervace (from, to)
    // private LocalDateTime from;
    // private LocalDateTime to;

    // TODO: stav rezervace
    private ReservationStatus status;

    // TODO: vazba na User
    // TODO: vazba na Restaurant
    // TODO: vazba na RestaurantTable

    // === Doménové metody ===
    // TODO:
    // - confirm()
    // - cancel()
    // - expire()
}
