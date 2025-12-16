package com.checkfood.checkfoodservice.audit.event;

/**
 * Auditní událost vztahující se k objednávce.
 */
public class OrderAuditEvent extends AuditEvent {

    private final Long orderId;
    private final String action;

    public OrderAuditEvent(Long orderId, String action) {
        this.orderId = orderId;
        this.action = action;
    }

    public Long getOrderId() {
        return orderId;
    }

    public String getAction() {
        return action;
    }
}
