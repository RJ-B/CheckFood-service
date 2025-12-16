package com.checkfood.checkfoodservice.security.jwt;

/**
 * Generuje JWT tokeny (access/refresh).
 *
 * Zodpovědnosti:
 * - sestavení claims
 * - podpis tokenu
 *
 *   Neověřuje token (to dělá validator)
 */
public class JwtTokenProvider {

    // TODO:
    // - inject JwtProperties
    // - createAccessToken(...)
    // - createRefreshToken(...)
}
