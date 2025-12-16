package com.checkfood.checkfoodservice.application.entity.user;

/**
 * Role uživatele v systému.
 *
 * Slouží jako:
 * - doménová reprezentace oprávnění
 *
 * Poznámka:
 * - mapuje se na security UserRole
 */
public class Role {

    // TODO: @Id
    private Long id;

    // TODO: název role (USER, ADMIN)
    private String name;

}
