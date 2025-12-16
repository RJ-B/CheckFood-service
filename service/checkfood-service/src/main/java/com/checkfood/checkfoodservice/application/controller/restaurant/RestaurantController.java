package com.checkfood.checkfoodservice.application.controller.restaurant;

/**
 * REST controller pro správu restaurací.
 *
 * Zodpovědnosti:
 * - vytvoření restaurace
 * - změna stavu restaurace
 * - zobrazení restaurací
 *
 * Používá:
 * - RestaurantService
 *
 * Cross-cutting:
 * - security (ADMIN / OWNER)
 * - cache (list restaurací)
 * - audit
 */
public class RestaurantController {

    // TODO: inject RestaurantService

    // TODO: POST /restaurants
    // - vytvoření restaurace

    // TODO: GET /restaurants
    // - seznam restaurací (cachované)

    // TODO: PUT /restaurants/{id}/close
    // - uzavření restaurace
}
