package com.checkfood.checkfoodservice.listener.security;

import com.checkfood.checkfoodservice.event.security.LoginSuccessEvent;
import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Component;

/**
 * Reaguje na úspěšné přihlášení.
 */
@Component
public class AuthenticationSuccessListener {

    @EventListener
    public void onAuthenticationSuccess(LoginSuccessEvent event) {

        // TODO:
        // - audit přihlášení
        // - metriky (počty loginů)
    }
}
