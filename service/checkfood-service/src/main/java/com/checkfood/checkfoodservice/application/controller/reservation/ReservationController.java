package com.checkfood.checkfoodservice.application.controller.reservation;

/**
 * REST controller pro práci s rezervacemi.
 *
 * Zodpovědnosti:
 * - vytvoření rezervace
 * - potvrzení / zrušení
 * - zobrazení rezervací uživatele
 *
 * Používá:
 * - ReservationService
 *
 * Cross-cutting:
 * - security (USER)
 * - rate-limit (vytváření rezervací)
 * - audit
 */
public class ReservationController {

    // TODO: inject ReservationService

    // TODO: POST /reservations
    // - vytvoření rezervace

    // TODO: PUT /reservations/{id}/confirm
    // - potvrzení rezervace

    // TODO: PUT /reservations/{id}/cancel
    // - zrušení rezervace

    // TODO: GET /reservations/me
    // - rezervace aktuálního uživatele
}
