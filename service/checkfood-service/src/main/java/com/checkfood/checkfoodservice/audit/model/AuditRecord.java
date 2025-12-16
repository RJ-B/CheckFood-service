package com.checkfood.checkfoodservice.audit.model;

import java.time.Instant;

/**
 * Persistovatelná podoba auditního záznamu.
 */
public class AuditRecord {

    private Instant timestamp;
    private AuditAction action;
    private AuditSource source;
    private String subject;
    private String details;

    // TODO:
    // - případně JPA @Entity
    // - mapování na DB tabulku audit_log

    // getters / setters
}
