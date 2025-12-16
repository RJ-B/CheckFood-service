package com.checkfood.checkfoodservice.ratelimit.config;

import org.springframework.context.annotation.Configuration;

/**
 * Konfigurace rate limiting subsystému.
 *
 * Zodpovědnosti:
 * - zapnutí / vypnutí rate limitingu
 * - wiring policy a service tříd
 *
 *   Neobsahuje business logiku
 *   Neřeší konkrétní limity
 */
@Configuration
public class RateLimitConfig {

    // TODO:
    // - registrace RateLimitService
    // - výběr výchozí RateLimitPolicy
}
