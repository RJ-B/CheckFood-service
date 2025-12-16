package com.checkfood.checkfoodservice.application.repository.reservation;

import com.checkfood.checkfoodservice.application.entity.reservation.Reservation;

import java.time.LocalDateTime;
import java.util.List;
import java.util.Optional;

/**
 * Repository pro Reservation agregát.
 *
 * Používá se v:
 * - ReservationService
 * - Scheduler (expirace)
 *
 * Cross-cutting:
 * - scheduler
 * - audit
 */
public interface ReservationRepository {

    // TODO: uložit rezervaci
    Reservation save(Reservation reservation);

    // TODO: najít rezervaci podle ID
    Optional<Reservation> findById(Long id);

    // TODO: najít rezervace uživatele
    List<Reservation> findByUserId(Long userId);

    // TODO: najít expirované rezervace (scheduler)
    List<Reservation> findExpired(LocalDateTime now);
}
