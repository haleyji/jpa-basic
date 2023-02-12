package com.example.jpabasic.Order;

import lombok.Cleanup;
import lombok.Getter;

import javax.persistence.*;
import java.time.LocalDateTime;
import java.util.Date;
@Table(name = "orders")
@Getter
@Entity
public class Order {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "order_id")
    private Long id;

    private LocalDateTime orderDate;

    @Column(name = "member_id")
    private Long memberId;

    @Enumerated(EnumType.STRING)
    private OrderStatus status;
}
