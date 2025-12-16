package com.checkfood.checkfoodservice.application.service.reservation;

import com.checkfood.checkfoodservice.application.entity.reservation.Reservation;

/**
 * Service pro práci s rezervacemi.
 *
 * Zodpovědnosti:
 * - vytvoření rezervace
 * - potvrzení / zrušení
 * - expirování rezervací
 *
 * Používá:
 * - ReservationRepository
 *
 * Cross-cutting:
 * - scheduler (expiration job)
 * - audit
 * - event (ReservationCreatedEvent, ReservationExpiredEvent)
 */
public interface ReservationService {

    // TODO:
    // - createReservation(...)
    // - confirmReservation(...)
    // - cancelReservation(...)
    // - expireReservation(...)
}
