package com.checkfood.checkfoodservice.ratelimit.policy;

import com.checkfood.checkfoodservice.ratelimit.model.RateLimitContext;
import com.checkfood.checkfoodservice.ratelimit.model.RateLimitDecision;

/**
 * Kontrakt pro rate limiting strategii.
 *
 * Implementace:
 * - Fixed window
 * - Sliding window
 * - Token bucket
 */
public interface RateLimitPolicy {

    RateLimitDecision evaluate(RateLimitContext context);
}
