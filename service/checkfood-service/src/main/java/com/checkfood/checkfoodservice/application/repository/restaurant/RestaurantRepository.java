package com.checkfood.checkfoodservice.application.repository.restaurant;

import com.checkfood.checkfoodservice.application.entity.restaurant.Restaurant;

import java.util.List;
import java.util.Optional;

/**
 * Repository pro Restaurant agregát.
 *
 * Zodpovědnosti:
 * - práce s restauracemi
 *
 * Cross-cutting:
 * - čtení → cache
 * - změny → audit
 */
public interface RestaurantRepository {

    // TODO: uložit restauraci
    Restaurant save(Restaurant restaurant);

    // TODO: najít restauraci podle ID
    Optional<Restaurant> findById(Long id);

    // TODO: najít všechny aktivní restaurace
    List<Restaurant> findAllActive();
}
