package com.checkfood.checkfoodservice.listener.audit;

import com.checkfood.checkfoodservice.audit.event.AuditEvent;
import com.checkfood.checkfoodservice.audit.service.AuditService;
import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Component;

/**
 * Přijímá auditní eventy a deleguje je na audit service.
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
