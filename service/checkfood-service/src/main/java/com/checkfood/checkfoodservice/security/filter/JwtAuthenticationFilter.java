package com.checkfood.checkfoodservice.security.filter;

import jakarta.servlet.FilterChain;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import org.springframework.web.filter.OncePerRequestFilter;

import java.io.IOException;

/**
 * JWT autentizační filtr.
 *
 * Zodpovědnosti:
 * - vytáhne token z Authorization headeru (Bearer)
 * - validuje token (signature, exp, claims)
 * - vytvoří Authentication a uloží do SecurityContextu
 *
 *   Neobsahuje business logiku
 *   Neřeší login endpoint (to dělá controller/service)
 */
public class JwtAuthenticationFilter extends OncePerRequestFilter {

    // TODO:
    // - inject JwtTokenParser + JwtTokenValidator + JwtClaimsExtractor
    // - inject UserDetailsServiceImpl (nebo Security user resolver)
    // - nastavit do SecurityContextHolder

    @Override
    protected void doFilterInternal(
            HttpServletRequest request,
            HttpServletResponse response,
            FilterChain filterChain
    ) throws ServletException, IOException {

        // TODO:
        // - parse token, validate, set auth
        filterChain.doFilter(request, response);
    }
}
