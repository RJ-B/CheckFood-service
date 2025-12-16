package com.checkfood.checkfoodservice.security.jwt;

import org.springframework.boot.context.properties.ConfigurationProperties;

/**
 * Konfigurační vlastnosti JWT.
 *
 * Obsahuje:
 * - secret / key
 * - issuer
 * - expirace access/refresh tokenu
 *
 * Poznámka:
 * - secret je v prod řešen přes vault/secret manager
 */
@ConfigurationProperties(prefix = "security.jwt")
public class JwtProperties {

    private String issuer;
    private String secret;
    private long accessTokenTtlSeconds;
    private long refreshTokenTtlSeconds;

    // getters / setters
}
