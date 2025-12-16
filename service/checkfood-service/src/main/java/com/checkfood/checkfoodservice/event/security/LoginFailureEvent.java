package com.checkfood.checkfoodservice.event.security;

import com.checkfood.checkfoodservice.event.base.DomainEvent;

/**
 * Událost vyvolaná při neúspěšném přihlášení.
 */
public class LoginFailureEvent extends DomainEvent {

    private final String username;

    public LoginFailureEvent(String username) {
        this.username = username;
    }

    public String getUsername() {
        return username;
    }
}
