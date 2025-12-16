package com.checkfood.checkfoodservice.ratelimit.filter;

import com.checkfood.checkfoodservice.ratelimit.service.RateLimitService;
import jakarta.servlet.Filter;
import jakarta.servlet.FilterChain;
import jakarta.servlet.ServletException;
import jakarta.servlet.ServletRequest;
import jakarta.servlet.ServletResponse;

import java.io.IOException;

/**
 * Servlet filter pro aplikaci rate limitingu.
 *
 * Aplikuje se:
 * - před vstupem do controlleru
 * - globálně na HTTP requesty
 *
 *   Neobsahuje business logiku
 */
public class RateLimitFilter implements Filter {

    private final RateLimitService rateLimitService;

    public RateLimitFilter(RateLimitService rateLimitService) {
        this.rateLimitService = rateLimitService;
    }

    @Override
    public void doFilter(
            ServletRequest request,
            ServletResponse response,
            FilterChain chain
    ) throws IOException, ServletException {

        // TODO:
        // - resolve rate limit key
        // - vyhodnocení policy
        // - případné odmítnutí requestu

        chain.doFilter(request, response);
    }
}
