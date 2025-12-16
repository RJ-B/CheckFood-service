package com.checkfood.checkfoodservice.application.service.restaurant;

import com.checkfood.checkfoodservice.application.entity.restaurant.Restaurant;

/**
 * Service pro správu restaurací.
 *
 * Zodpovědnosti:
 * - vytvoření restaurace
 * - změna stavu (open/close)
 *
 * Používá:
 * - RestaurantRepository
 *
 * Cross-cutting:
 * - audit
 * - cache (list restaurací)
 */
public interface RestaurantService {

    // TODO:
    // - createRestaurant(...)
    // - closeRestaurant(...)
    // - reopenRestaurant(...)
}
