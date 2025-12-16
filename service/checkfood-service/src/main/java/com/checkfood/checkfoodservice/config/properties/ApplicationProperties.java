package com.checkfood.checkfoodservice.config.properties;

import org.springframework.boot.context.properties.ConfigurationProperties;

/**
 * Globální aplikační vlastnosti.
 *
 * Obsahuje:
 * - název aplikace
 * - prostředí
 * - obecná nastavení
 *
 * Nemá žádnou business logiku.
 */
@ConfigurationProperties(prefix = "app")
public class ApplicationProperties {

    private String name;
    private String environment;

    // getters / setters
}
