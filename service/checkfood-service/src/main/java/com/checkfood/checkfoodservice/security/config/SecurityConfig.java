package com.checkfood.checkfoodservice.security.config;

import org.springframework.context.annotation.Configuration;

/**
 * Hlavní bezpečnostní konfigurace aplikace.
 *
 * Zodpovědnosti:
 * - definuje security chain (filtry, povolené endpointy)
 * - nastavuje autentizaci/autorizaci
 * - integruje JWT filtry a handlery
 *
 *   Neobsahuje business logiku
 *   Neprovádí načítání uživatele z DB (to dělá UserDetailsServiceImpl)
 *
 * Poznámka:
 * - skutečné nastavení HttpSecurity bude doplněno dle endpointů (controllerů)
 */
@Configuration
public class SecurityConfig {

    // TODO:
    // - @Bean SecurityFilterChain securityFilterChain(HttpSecurity http)
    // - session stateless
    // - povolit /auth/**, /actuator/health
    // - přidat JwtAuthenticationFilter + JwtExceptionFilter
    // - nastavit AuthenticationEntryPointImpl + AccessDeniedHandlerImpl
}
