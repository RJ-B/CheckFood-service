package com.checkfood.checkfoodservice.security.filter;

import jakarta.servlet.FilterChain;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import org.springframework.web.filter.OncePerRequestFilter;

import java.io.IOException;

/**
 * Filtr pro zachycení výjimek vzniklých v JWT řetězci.
 *
 * Zodpovědnosti:
 * - sjednotí chybovou odpověď (401/403)
 * - zabrání "leakování" interních chyb klientovi
 *
 * Typicky běží před/po JwtAuthenticationFilter podle chain order.
 */
public class JwtExceptionFilter extends OncePerRequestFilter {

    @Override
    protected void doFilterInternal(
            HttpServletRequest request,
            HttpServletResponse response,
            FilterChain filterChain
    ) throws ServletException, IOException {

        try {
            filterChain.doFilter(request, response);
        } catch (RuntimeException ex) {
            // TODO:
            // - mapovat na 401/403
            // - napsat bezpečnou odpověď
            throw ex;
        }
    }
}
