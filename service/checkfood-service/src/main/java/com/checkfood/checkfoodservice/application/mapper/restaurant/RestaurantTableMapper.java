package com.checkfood.checkfoodservice.application.mapper.restaurant;

import com.checkfood.checkfoodservice.application.dto.response.restaurant.RestaurantTableResponseDto;
import com.checkfood.checkfoodservice.application.entity.restaurant.RestaurantTable;

import org.mapstruct.Mapper;

/**
 * Mapper pro RestaurantTable (child entity).
 *
 * Používá se pouze pro read operace.
 */
@Mapper(componentModel = "spring")
public interface RestaurantTableMapper {

    // TODO: RestaurantTable -> RestaurantTableResponseDto
    RestaurantTableResponseDto toResponse(RestaurantTable table);
}
