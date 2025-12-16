package com.checkfood.checkfoodservice.ratelimit.policy;

import com.checkfood.checkfoodservice.ratelimit.model.RateLimitContext;
import com.checkfood.checkfoodservice.ratelimit.model.RateLimitDecision;

/**
 * Token bucket algoritmus.
 *
 * Vhodný pro:
 * - burst traffic
 */
public class TokenBucketPolicy implements RateLimitPolicy {

    @Override
    public RateLimitDecision evaluate(RateLimitContext context) {
        // TODO:
        return RateLimitDecision.ALLOWED;
    }
}
