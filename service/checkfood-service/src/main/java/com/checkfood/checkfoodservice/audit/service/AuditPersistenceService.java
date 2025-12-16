package com.checkfood.checkfoodservice.audit.service;

import com.checkfood.checkfoodservice.audit.model.AuditRecord;
import org.springframework.stereotype.Service;

/**
 * Zajišťuje uložení auditu do persistence.
 */
@Service
public class AuditPersistenceService {

    // TODO:
    // - napojení na repository
    // - transakční uložení

    public void persist(AuditRecord record) {
        // TODO implementace
    }
}
