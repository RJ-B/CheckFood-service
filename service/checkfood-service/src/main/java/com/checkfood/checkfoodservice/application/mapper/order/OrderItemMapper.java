package com.checkfood.checkfoodservice.application.mapper.order;

import com.checkfood.checkfoodservice.application.dto.request.order.OrderItemRequestDto;
import com.checkfood.checkfoodservice.application.dto.response.order.OrderItemResponseDto;
import com.checkfood.checkfoodservice.application.entity.order.OrderItem;

import org.mapstruct.Mapper;

/**
 * Mapper pro OrderItem (child entity).
 */
@Mapper(componentModel = "spring")
public interface OrderItemMapper {

    // TODO: OrderItem <- OrderItemRequestDto
    OrderItem toEntity(OrderItemRequestDto dto);

    // TODO: OrderItem -> OrderItemResponseDto
    OrderItemResponseDto toResponse(OrderItem item);
}
