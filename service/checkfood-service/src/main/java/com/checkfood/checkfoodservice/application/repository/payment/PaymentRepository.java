package com.checkfood.checkfoodservice.application.repository.payment;

import com.checkfood.checkfoodservice.application.entity.payment.Payment;

import java.util.Optional;

/**
 * Repository pro Payment agregát.
 *
 * Používá se v:
 * - PaymentService
 *
 * Cross-cutting:
 * - audit
 * - monitoring
 */
public interface PaymentRepository {

    // TODO: uložit platbu
    Payment save(Payment payment);

    // TODO: najít platbu podle ID
    Optional<Payment> findById(Long id);

    // TODO: najít platbu podle externího payment ID
    Optional<Payment> findByExternalPaymentId(String externalPaymentId);
}
