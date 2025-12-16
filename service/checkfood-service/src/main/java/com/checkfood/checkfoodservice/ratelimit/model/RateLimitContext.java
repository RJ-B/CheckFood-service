package com.checkfood.checkfoodservice.ratelimit.model;

/**
 * Kontext rate limitingu pro jeden request.
 *
 * Obsahuje:
 * - identifikátor (userId / IP)
 * - endpoint
 * - časové informace
 */
public class RateLimitContext {

    private String key;
    private String endpoint;

    // getters / setters
}
