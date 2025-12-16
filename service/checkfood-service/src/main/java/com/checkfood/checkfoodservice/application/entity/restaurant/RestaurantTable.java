package com.checkfood.checkfoodservice.application.entity.restaurant;

/**
 * Entita reprezentující fyzický stůl v restauraci.
 *
 * ❗ Neexistuje samostatně – vždy patří k Restaurant.
 *
 * Použití:
 * - Reservation
 */
public class RestaurantTable {

    // TODO: @Id
    private Long id;

    // TODO: označení stolu (např. "A1")
    private String label;

    // TODO: kapacita stolu
    private int capacity;

    // TODO: vazba na Restaurant
}
