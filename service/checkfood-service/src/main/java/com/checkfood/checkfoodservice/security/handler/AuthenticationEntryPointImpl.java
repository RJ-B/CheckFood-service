package com.checkfood.checkfoodservice.security.handler;

import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import org.springframework.security.core.AuthenticationException;
import org.springframework.security.web.AuthenticationEntryPoint;

import java.io.IOException;

/**
 * Entry point pro neautentizované požadavky.
 *
 * Zodpovědnosti:
 * - vrátí HTTP 401
 * - sjednocenou chybovou odpověď (ideálně ApiErrorResponse)
 */
public class AuthenticationEntryPointImpl implements AuthenticationEntryPoint {

    @Override
    public void commence(
            HttpServletRequest request,
            HttpServletResponse response,
            AuthenticationException authException
    ) throws IOException {

        // TODO:
        // - nastavit status 401
        // - JSON error body
        response.setStatus(HttpServletResponse.SC_UNAUTHORIZED);
    }
}
