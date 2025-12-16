package com.checkfood.checkfoodservice.security.config;

import org.springframework.context.annotation.Configuration;

/**
 * Konfigurace bezpečnostních HTTP hlaviček.
 *
 * Typicky:
 * - HSTS
 * - X-Content-Type-Options
 * - X-Frame-Options
 * - Content-Security-Policy (dle potřeby)
 */
@Configuration
public class SecurityHeaderConfig {

    // TODO:
    // - konfigurace security headers přes HttpSecurity
}
