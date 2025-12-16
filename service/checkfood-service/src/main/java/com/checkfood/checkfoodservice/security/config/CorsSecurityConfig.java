package com.checkfood.checkfoodservice.security.config;

import org.springframework.context.annotation.Configuration;

/**
 * Konfigurace CORS pro REST API.
 *
 * Zodpovědnosti:
 * - povolené originy (dev/prod)
 * - povolené metody a hlavičky
 * - exposure některých hlaviček (např. correlation id)
 *
 *   Neobsahuje business logiku
 */
@Configuration
public class CorsSecurityConfig {

    // TODO:
    // - CorsConfigurationSource bean
}
