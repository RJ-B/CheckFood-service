package com.checkfood.checkfoodservice.application.mapper.restaurant;

import com.checkfood.checkfoodservice.application.dto.request.restaurant.RestaurantCreateRequestDto;
import com.checkfood.checkfoodservice.application.dto.response.restaurant.RestaurantResponseDto;
import com.checkfood.checkfoodservice.application.entity.restaurant.Restaurant;

import org.mapstruct.Mapper;

/**
 * Mapper pro Restaurant agregát.
 *
 * Používá se v:
 * - RestaurantService
 * - RestaurantController
 */
@Mapper(componentModel = "spring")
public interface RestaurantMapper {

    // TODO: Restaurant <- RestaurantCreateRequestDto
    Restaurant toEntity(RestaurantCreateRequestDto dto);

    // TODO: Restaurant -> RestaurantResponseDto
    RestaurantResponseDto toResponse(Restaurant restaurant);
}
