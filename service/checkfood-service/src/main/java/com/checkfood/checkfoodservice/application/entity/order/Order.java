package com.checkfood.checkfoodservice.application.entity.order;

/**
 * Doménová entita reprezentující objednávku.
 *
 * Order je agregátní kořen:
 * - vzniká z rezervace nebo přímo
 * - obsahuje položky
 * - má vazbu na platbu
 *
 * Cross-cutting:
 * - vytvoření → OrderCreatedEvent
 * - zaplacení → OrderPaidEvent
 * - změny → audit
 * - cache (read-heavy)
 */
public class Order {

    // TODO: @Id
    private Long id;

    // TODO: stav objednávky
    private OrderStatus status;

    // TODO: celková cena
    // private BigDecimal totalPrice;

    // TODO: vazba na User
    // TODO: vazba na Reservation

    // TODO: položky objednávky
    // private List<OrderItem> items;

    // === Doménové metody ===
    // TODO:
    // - markAsPaid()
    // - cancel()
}
