package com.checkfood.checkfoodservice.config;

import org.springframework.context.annotation.Configuration;

/**
 * Hlavní aplikační konfigurační třída.
 *
 * Slouží jako centrální místo pro:
 * - obecné beany použitelné napříč aplikací
 * - technické komponenty, které nelze logicky
 *   zařadit do konkrétního modulu (security, cache, atd.)
 *
 *   Neobsahuje business logiku
 *   Neřeší chování use-case
 */
@Configuration
public class AppConfig {

    // TODO:
    // - společné Executor beany (pokud nebudou specifické pro modul)
    // - obecné utility beany
}
