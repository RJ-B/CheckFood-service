package com.checkfood.checkfoodservice.listener.security;

import com.checkfood.checkfoodservice.event.security.AccessDeniedEvent;
import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Component;

/**
 * Reaguje na zamítnutí autorizace.
 */
@Component
public class AuthorizationFailureListener {

    @EventListener
    public void onAccessDenied(AccessDeniedEvent event) {

        // TODO:
        // - audit zamítnutého přístupu
        // - security metriky
    }
}
