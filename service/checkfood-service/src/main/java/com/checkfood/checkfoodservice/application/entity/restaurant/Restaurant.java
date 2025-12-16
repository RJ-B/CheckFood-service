package com.checkfood.checkfoodservice.application.entity.restaurant;

/**
 * Doménová entita reprezentující restauraci.
 *
 * Restaurant je agregátní kořen pro:
 * - stoly
 * - rezervace
 * - objednávky
 *
 * Použití:
 * - Reservation
 * - Order
 *
 * Cross-cutting:
 * - změna stavu → audit
 */
public class Restaurant {

    // TODO: @Id
    private Long id;

    // TODO: název restaurace
    private String name;

    // TODO: adresa (zatím string / později value object)
    private String address;

    // TODO: stav restaurace (ACTIVE / CLOSED)
    private RestaurantStatus status;

    // TODO: vlastník restaurace (User)
    // private User owner;

    // === Doménové metody ===
    // TODO:
    // - close()
    // - reopen()
}
