package com.checkfood.checkfoodservice.ratelimit.policy;

import com.checkfood.checkfoodservice.ratelimit.model.RateLimitContext;
import com.checkfood.checkfoodservice.ratelimit.model.RateLimitDecision;

/**
 * Sliding window rate limiting.
 *
 * Přesnější než fixed window.
 */
public class SlidingWindowPolicy implements RateLimitPolicy {

    @Override
    public RateLimitDecision evaluate(RateLimitContext context) {
        // TODO:
        return RateLimitDecision.ALLOWED;
    }
}
