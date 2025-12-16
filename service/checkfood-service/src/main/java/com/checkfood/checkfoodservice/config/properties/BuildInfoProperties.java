package com.checkfood.checkfoodservice.config.properties;

import org.springframework.boot.context.properties.ConfigurationProperties;

/**
 * Informace o buildu aplikace.
 *
 * Používá se pro:
 * - monitoring
 * - logging
 * - actuator
 */
@ConfigurationProperties(prefix = "build")
public class BuildInfoProperties {

    private String version;
    private String commitHash;
    private String buildTime;

    // getters / setters
}
