package com.checkfood.checkfoodservice.security.handler;

import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import org.springframework.security.access.AccessDeniedException;
import org.springframework.security.web.access.AccessDeniedHandler;

import java.io.IOException;

/**
 * Handler pro situace, kdy je uživatel autentizovaný,
 * ale nemá dostatečné oprávnění.
 *
 * Zodpovědnosti:
 * - vrací HTTP 403
 * - bezpečná odpověď bez interních detailů
 */
public class AccessDeniedHandlerImpl implements AccessDeniedHandler {

    @Override
    public void handle(
            HttpServletRequest request,
            HttpServletResponse response,
            AccessDeniedException accessDeniedException
    ) throws IOException {

        // TODO:
        // - nastavit status 403
        // - JSON error body
        response.setStatus(HttpServletResponse.SC_FORBIDDEN);
    }
}
