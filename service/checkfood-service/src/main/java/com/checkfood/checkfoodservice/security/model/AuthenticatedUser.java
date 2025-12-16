package com.checkfood.checkfoodservice.security.model;

/**
 * Jednodušší reprezentace autentizovaného uživatele
 * pro použití mimo Spring Security API.
 *
 * Používá se:
 * - v application/service jako "current user"
 * - pro audit/monitoring kontext
 */
public class AuthenticatedUser {

    private Long userId;
    private String email;

    // getters / setters
}
