package com.checkfood.checkfoodservice.security.service;

/**
 * Kontrakt autentizačních operací.
 *
 * Typicky:
 * - login
 * - refresh token
 * - logout (pokud existuje blacklist/refresh store)
 */
public interface AuthenticationService {

    // TODO:
    // - login(email, password)
    // - refresh(refreshToken)
}
