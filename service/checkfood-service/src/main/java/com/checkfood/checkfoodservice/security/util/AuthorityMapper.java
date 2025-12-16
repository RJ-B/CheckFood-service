package com.checkfood.checkfoodservice.security.util;

import com.checkfood.checkfoodservice.security.model.UserRole;
import org.springframework.security.core.authority.SimpleGrantedAuthority;

import java.util.List;

/**
 * Mapuje interní role na Spring Security GrantedAuthority.
 *
 * Zabraňuje duplikaci mapování po celé aplikaci.
 */
public final class AuthorityMapper {

    private AuthorityMapper() {}

    public static List<SimpleGrantedAuthority> mapRoles(List<UserRole> roles) {
        // TODO:
        // - map enum na "ROLE_..." authorities
        return List.of();
    }
}
