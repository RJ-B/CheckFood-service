package com.checkfood.checkfoodservice.audit.listener;

import com.checkfood.checkfoodservice.audit.event.AuditEvent;
import com.checkfood.checkfoodservice.audit.service.AuditService;
import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Component;

/**
 * Centrální listener pro auditní události.
 */
@Component
public class AuditEventListener {

    private final AuditService auditService;

    public AuditEventListener(AuditService auditService) {
        this.auditService = auditService;
    }

    @EventListener
    public void onAuditEvent(AuditEvent event) {
        auditService.handle(event);
    }
}
