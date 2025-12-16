package com.checkfood.checkfoodservice.audit.config;

import org.springframework.boot.context.properties.ConfigurationProperties;

/**
 * Konfigurační vlastnosti auditu.
 * Mapuje se z application-*.properties.
 */
@ConfigurationProperties(prefix = "audit")
public class AuditProperties {

    /**
     * Zapnutí / vypnutí auditu jako celku.
     */
    private boolean enabled = true;

    /**
     * Zda má audit běžet asynchronně.
     */
    private boolean async = true;

    /**
     * Zda se mají auditní záznamy persistovat do databáze.
     */
    private boolean persist = true;

    // getters / setters

    public boolean isEnabled() {
        return enabled;
    }

    public void setEnabled(boolean enabled) {
        this.enabled = enabled;
    }

    public boolean isAsync() {
        return async;
    }

    public void setAsync(boolean async) {
        this.async = async;
    }

    public boolean isPersist() {
        return persist;
    }

    public void setPersist(boolean persist) {
        this.persist = persist;
    }
}
