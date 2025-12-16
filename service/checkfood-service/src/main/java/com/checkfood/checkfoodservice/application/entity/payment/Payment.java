package com.checkfood.checkfoodservice.application.entity.payment;

/**
 * Doménová entita reprezentující platbu.
 *
 * Payment:
 * - je navázaná na Order
 * - komunikuje s externí platební bránou (client)
 *
 * Cross-cutting:
 * - externí client (Stripe)
 * - audit
 * - monitoring (úspěšnost plateb)
 */
public class Payment {

    // TODO: @Id
    private Long id;

    // TODO: částka
    // private BigDecimal amount;

    // TODO: stav platby
    private PaymentStatus status;

    // TODO: externí payment reference (např. Stripe ID)
    private String externalPaymentId;

    // TODO: vazba na Order

    // === Doménové metody ===
    // TODO:
    // - markSuccess()
    // - markFailed()
}
