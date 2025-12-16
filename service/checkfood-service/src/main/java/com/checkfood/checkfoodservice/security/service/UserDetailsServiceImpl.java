package com.checkfood.checkfoodservice.security.service;

import org.springframework.security.core.userdetails.UserDetailsService;

/**
 * Implementace načítání uživatele pro Spring Security.
 *
 * Zodpovědnosti:
 * - najít uživatele podle username/email
 * - sestavit UserPrincipal
 *
 *   Neřeší login flow (to je AuthenticationService)
 */
public class UserDetailsServiceImpl implements UserDetailsService {

    // TODO:
    // - inject UserRepository (application/repository)
    // - loadUserByUsername(...)
}
