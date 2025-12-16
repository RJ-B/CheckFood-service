package com.checkfood.checkfoodservice.audit.event;

import java.time.Instant;

/**
 * Základní auditní událost.
 * Reprezentuje fakt, že se něco stalo.
 */
public abstract class AuditEvent {

    private final Instant timestamp = Instant.now();

    public Instant getTimestamp() {
        return timestamp;
    }

    // TODO:
    // - případně correlationId / traceId
}
