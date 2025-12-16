package com.checkfood.checkfoodservice.ratelimit.service;

/**
 * Resolving klíče pro rate limiting.
 *
 * Např.:
 * - userId
 * - IP adresa
 * - kombinace obojího
 */
public interface RateLimitKeyResolver {

    String resolveKey();
}
