package com.checkfood.checkfoodservice.ratelimit.policy;

import com.checkfood.checkfoodservice.ratelimit.model.RateLimitContext;
import com.checkfood.checkfoodservice.ratelimit.model.RateLimitDecision;

/**
 * Jednoduchý fixed window rate limiting.
 */
public class FixedWindowPolicy implements RateLimitPolicy {

    @Override
    public RateLimitDecision evaluate(RateLimitContext context) {
        // TODO:
        // - jednoduché počítadlo v časovém okně
        return RateLimitDecision.ALLOWED;
    }
}
