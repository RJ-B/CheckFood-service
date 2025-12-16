package com.checkfood.checkfoodservice.audit.listener;

import com.checkfood.checkfoodservice.audit.event.SecurityAuditEvent;
import com.checkfood.checkfoodservice.audit.service.AuditService;
import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Component;

/**
 * Specializovaný listener pro security audit.
 */
@Component
public class SecurityAuditListener {

    private final AuditService auditService;

    public SecurityAuditListener(AuditService auditService) {
        this.auditService = auditService;
    }

    @EventListener
    public void onSecurityAudit(SecurityAuditEvent event) {
        auditService.handle(event);
    }
}
