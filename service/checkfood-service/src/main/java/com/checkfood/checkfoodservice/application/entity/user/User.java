package com.checkfood.checkfoodservice.application.entity.user;

/**
 * Doménová entita reprezentující uživatele systému.
 *
 * User je agregátní kořen pro oblast identity:
 * - autentizace (email, heslo)
 * - autorizace (role)
 * - vazba na objednávky a rezervace
 *
 *   Entity neví nic o:
 * - REST
 * - DTO
 * - security filtrech
 *
 * Použití v jiných vrstvách:
 * - application/service (UserService)
 * - security (UserDetailsServiceImpl – pouze čtení)
 * - audit (zaznamenání změn stavu)
 */
public class User {

    // TODO: @Id
    private Long id;

    // TODO: unikátní email (login identita)
    private String email;

    // TODO: hash hesla (nikdy plaintext)
    private String passwordHash;

    // TODO: stav účtu (ACTIVE, BLOCKED, DELETED)
    private UserStatus status;

    // TODO: role uživatele (M:N nebo enum)
    // private Set<Role> roles;

    // TODO: timestamps (createdAt, updatedAt)

    // === Doménové metody ===

    // TODO:
    // - activate()
    // - block()
    // - changePassword()

    // === Cross-cutting poznámky ===
    // - změna stavu → audit event (UserAuditEvent)
    // - změna hesla → audit + security
}
