package com.checkfood.checkfoodservice.security.model;

import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

import java.util.Collection;

/**
 * Security principal reprezentující přihlášeného uživatele.
 *
 * Zodpovědnosti:
 * - drží identitu uživatele (id, email)
 * - drží granted authorities (role)
 *
 * ❌ Neobsahuje business data (např. objednávky)
 */
public class UserPrincipal implements UserDetails {

    // TODO:
    // - fields: userId, email, passwordHash, authorities
    // - implement UserDetails methods

    @Override public Collection<? extends GrantedAuthority> getAuthorities() { return null; }
    @Override public String getPassword() { return null; }
    @Override public String getUsername() { return null; }
    @Override public boolean isAccountNonExpired() { return true; }
    @Override public boolean isAccountNonLocked() { return true; }
    @Override public boolean isCredentialsNonExpired() { return true; }
    @Override public boolean isEnabled() { return true; }
}
