package com.checkfood.checkfoodservice.listener.security;

import com.checkfood.checkfoodservice.event.security.LoginFailureEvent;
import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Component;

/**
 * Reaguje na neúspěšné přihlášení.
 */
@Component
public class AuthenticationFailureListener {

    @EventListener
    public void onAuthenticationFailure(LoginFailureEvent event) {

        // TODO:
        // - audit neúspěšného loginu
        // - bezpečnostní metriky
    }
}
