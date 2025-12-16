package com.checkfood.checkfoodservice.application.mapper.order;

import com.checkfood.checkfoodservice.application.dto.request.order.OrderCreateRequestDto;
import com.checkfood.checkfoodservice.application.dto.response.order.OrderResponseDto;
import com.checkfood.checkfoodservice.application.entity.order.Order;

import org.mapstruct.Mapper;

/**
 * Mapper pro Order agregát.
 *
 * Používá se v:
 * - OrderService
 * - OrderController
 */
@Mapper(componentModel = "spring")
public interface OrderMapper {

    // TODO: Order <- OrderCreateRequestDto
    Order toEntity(OrderCreateRequestDto dto);

    // TODO: Order -> OrderResponseDto
    OrderResponseDto toResponse(Order order);
}
