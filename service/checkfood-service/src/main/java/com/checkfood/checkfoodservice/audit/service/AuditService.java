package com.checkfood.checkfoodservice.audit.service;

import com.checkfood.checkfoodservice.audit.event.AuditEvent;

/**
 * Veřejné API auditního subsystému.
 */
public interface AuditService {

    /**
     * Zpracuje auditní událost.
     */
    void handle(AuditEvent event);
}
