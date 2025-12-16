package com.checkfood.checkfoodservice.event.security;

import com.checkfood.checkfoodservice.event.base.DomainEvent;

/**
 * Událost vyvolaná při obnovení JWT tokenu.
 */
public class TokenRefreshedEvent extends DomainEvent {

    private final String username;

    public TokenRefreshedEvent(String username) {
        this.username = username;
    }

    public String getUsername() {
        return username;
    }
}
