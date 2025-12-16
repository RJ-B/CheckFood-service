package com.checkfood.checkfoodservice.audit.event;

/**
 * Auditní událost vztahující se k uživateli.
 */
public class UserAuditEvent extends AuditEvent {

    private final Long userId;
    private final String action;

    public UserAuditEvent(Long userId, String action) {
        this.userId = userId;
        this.action = action;
    }

    public Long getUserId() {
        return userId;
    }

    public String getAction() {
        return action;
    }
}
