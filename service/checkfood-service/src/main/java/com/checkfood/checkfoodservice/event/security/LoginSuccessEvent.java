package com.checkfood.checkfoodservice.event.security;

import com.checkfood.checkfoodservice.event.base.DomainEvent;

/**
 * Událost vyvolaná po úspěšném přihlášení.
 */
public class LoginSuccessEvent extends DomainEvent {

    private final String username;

    public LoginSuccessEvent(String username) {
        this.username = username;
    }

    public String getUsername() {
        return username;
    }
}
