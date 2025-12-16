package com.checkfood.checkfoodservice.audit.event;

/**
 * Auditní událost vzniklá v bezpečnostním kontextu.
 */
public class SecurityAuditEvent extends AuditEvent {

    private final String username;
    private final String action;
    private final boolean success;

    public SecurityAuditEvent(String username, String action, boolean success) {
        this.username = username;
        this.action = action;
        this.success = success;
    }

    public String getUsername() {
        return username;
    }

    public String getAction() {
        return action;
    }

    public boolean isSuccess() {
        return success;
    }
}
