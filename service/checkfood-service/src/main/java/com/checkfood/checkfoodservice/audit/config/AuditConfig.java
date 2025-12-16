package com.checkfood.checkfoodservice.audit.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.scheduling.annotation.EnableAsync;

/**
 * Globální konfigurace auditního subsystému.
 *
 * - zapíná async zpracování auditů
 * - definuje technické chování auditu (ne business logiku)
 */
@Configuration
@EnableAsync
public class AuditConfig {

    // TODO:
    // - případně definovat vlastní Executor pro audit (oddělený od scheduleru)
    // - řídit zapnutí/vypnutí auditu podle profilu nebo properties

}
