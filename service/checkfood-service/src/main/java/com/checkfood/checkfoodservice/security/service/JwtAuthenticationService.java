package com.checkfood.checkfoodservice.security.service;

/**
 * JWT implementace autentizačního flow.
 *
 * Zodpovědnosti:
 * - ověří přihlašovací údaje
 * - vytvoří access/refresh token
 *
 *   Neobsahuje business logiku (registrace uživatele je jinde)
 */
public class JwtAuthenticationService implements AuthenticationService {

    // TODO:
    // - inject AuthenticationManager
    // - inject JwtTokenProvider
}
