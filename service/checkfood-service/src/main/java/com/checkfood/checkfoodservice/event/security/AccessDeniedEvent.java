package com.checkfood.checkfoodservice.event.security;

import com.checkfood.checkfoodservice.event.base.DomainEvent;

/**
 * Událost vyvolaná při zamítnutí přístupu.
 */
public class AccessDeniedEvent extends DomainEvent {

    private final String username;
    private final String resource;

    public AccessDeniedEvent(String username, String resource) {
        this.username = username;
        this.resource = resource;
    }

    public String getUsername() {
        return username;
    }

    public String getResource() {
        return resource;
    }
}
