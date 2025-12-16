package com.checkfood.checkfoodservice.ratelimit.service;

import com.checkfood.checkfoodservice.ratelimit.model.RateLimitContext;
import com.checkfood.checkfoodservice.ratelimit.model.RateLimitDecision;

/**
 * Orchestrace rate limitingu.
 *
 * Slouží jako:
 * - vstupní bod pro filter
 * - jednotné API pro rate limit vyhodnocení
 */
public interface RateLimitService {

    RateLimitDecision check(RateLimitContext context);
}
