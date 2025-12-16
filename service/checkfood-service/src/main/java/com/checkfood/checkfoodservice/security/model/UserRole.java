package com.checkfood.checkfoodservice.security.model;

/**
 * Role používané pro autorizaci.
 *
 * Poznámka:
 * - může být mapováno z entity Role
 * - nebo být čistě security enum
 */
public enum UserRole {
    USER,
    ADMIN
}
