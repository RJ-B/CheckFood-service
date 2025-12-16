package com.checkfood.checkfoodservice.application.service.payment;

import com.checkfood.checkfoodservice.application.entity.payment.Payment;

/**
 * Service pro zpracování plateb.
 *
 * Zodpovědnosti:
 * - inicializace platby
 * - zpracování výsledku platby
 *
 * Používá:
 * - PaymentRepository
 * - OrderRepository
 * - externí payment client (Stripe)
 *
 * Cross-cutting:
 * - audit
 * - monitoring (úspěšnost plateb)
 * - event (PaymentSucceededEvent, PaymentFailedEvent)
 */
public interface PaymentService {

    // TODO:
    // - initiatePayment(...)
    // - handlePaymentSuccess(...)
    // - handlePaymentFailure(...)
}
