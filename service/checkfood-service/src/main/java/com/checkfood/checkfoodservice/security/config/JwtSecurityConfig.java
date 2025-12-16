package com.checkfood.checkfoodservice.security.config;

import org.springframework.context.annotation.Configuration;

/**
 * Konfigurace JWT části security.
 *
 * Typicky:
 * - registrace JwtProperties
 * - definice beanů pro token provider / validator / parser
 *
 * Slouží k oddělení JWT nastavení od obecného SecurityConfig.
 */
@Configuration
public class JwtSecurityConfig {

    // TODO:
    // - @EnableConfigurationProperties(JwtProperties.class)
    // - wiring JWT komponent
}
