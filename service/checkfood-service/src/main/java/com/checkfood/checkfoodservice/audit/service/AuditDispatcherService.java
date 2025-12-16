package com.checkfood.checkfoodservice.audit.service;

import com.checkfood.checkfoodservice.audit.event.AuditEvent;
import org.springframework.stereotype.Service;

/**
 * Rozhoduje, kam auditní záznam pošle.
 */
@Service
public class AuditDispatcherService {

    // TODO:
    // - rozhodnout: DB / log / externí systém
    // - respektovat AuditProperties

    public void dispatch(AuditEvent event) {
        // TODO implementace
    }
}
