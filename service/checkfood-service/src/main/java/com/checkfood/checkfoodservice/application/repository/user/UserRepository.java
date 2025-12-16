package com.checkfood.checkfoodservice.application.repository.user;

import com.checkfood.checkfoodservice.application.entity.user.User;

import java.util.Optional;

/**
 * Repository pro správu User agregátu.
 *
 * Zodpovědnosti:
 * - načítání a ukládání uživatelů
 * - základní vyhledávací dotazy
 *
 * Používá se v:
 * - UserService
 * - Security (UserDetailsServiceImpl – pouze read)
 *
 * Cross-cutting:
 * - čtení může být cachováno
 * - změny → audit
 */
public interface UserRepository {

    // TODO: uložit / aktualizovat uživatele
    User save(User user);

    // TODO: najít uživatele podle ID
    Optional<User> findById(Long id);

    // TODO: najít uživatele podle emailu (login)
    Optional<User> findByEmail(String email);

    // TODO: existence emailu (registrace)
    boolean existsByEmail(String email);
}
