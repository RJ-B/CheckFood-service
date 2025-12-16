package com.checkfood.checkfoodservice.ratelimit.config;

import org.springframework.boot.context.properties.ConfigurationProperties;

/**
 * Konfigurační vlastnosti rate limitingu.
 *
 * Mapuje se z application-*.properties.
 */
@ConfigurationProperties(prefix = "ratelimit")
public class RateLimitProperties {

    /**
     * Globální zapnutí rate limitingu.
     */
    private boolean enabled = true;

    /**
     * Maximální počet požadavků.
     */
    private int limit;

    /**
     * Délka časového okna v sekundách.
     */
    private long windowSeconds;

    // getters / setters
}
