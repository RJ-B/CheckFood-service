package com.checkfood.checkfoodservice.security.filter;

import jakarta.servlet.FilterChain;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import org.springframework.web.filter.OncePerRequestFilter;

import java.io.IOException;

/**
 * Pomocný filtr pro práci se SecurityContextem.
 *
 * Použití:
 * - naplnění MDC (userId/role) z Authentication
 * - cleanup kontextu po requestu
 *
 *   Neprovádí autentizaci
 *   Nevaliduje token
 */
public class SecurityContextFilter extends OncePerRequestFilter {

    @Override
    protected void doFilterInternal(
            HttpServletRequest request,
            HttpServletResponse response,
            FilterChain filterChain
    ) throws ServletException, IOException {

        try {
            // TODO:
            // - enrich MDC z SecurityContext
            filterChain.doFilter(request, response);
        } finally {
            // TODO:
            // - cleanup
        }
    }
}
