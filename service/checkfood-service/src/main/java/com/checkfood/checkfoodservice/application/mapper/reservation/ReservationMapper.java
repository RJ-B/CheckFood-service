package com.checkfood.checkfoodservice.application.mapper.reservation;

import com.checkfood.checkfoodservice.application.dto.request.reservation.ReservationCreateRequestDto;
import com.checkfood.checkfoodservice.application.dto.response.reservation.ReservationResponseDto;
import com.checkfood.checkfoodservice.application.entity.reservation.Reservation;

import org.mapstruct.Mapper;

/**
 * Mapper pro Reservation agregát.
 *
 * Používá se v:
 * - ReservationService
 * - ReservationController
 */
@Mapper(componentModel = "spring")
public interface ReservationMapper {

    // TODO: Reservation <- ReservationCreateRequestDto
    Reservation toEntity(ReservationCreateRequestDto dto);

    // TODO: Reservation -> ReservationResponseDto
    ReservationResponseDto toResponse(Reservation reservation);
}
