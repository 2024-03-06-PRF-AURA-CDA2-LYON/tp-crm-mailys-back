package com.crmtp.crmtp.Entities;

import jakarta.persistence.*;
import lombok.Data;
import org.hibernate.query.sqm.tree.expression.NumericTypeCategory;

import java.math.BigDecimal;

@Entity
@Table(name = "orders")
@Data
public class Order {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(nullable = false)
    private Integer id;

    @Column(name="service_type",length=100 ,nullable = false)
    private String service_type;

    @Column(name="tva",columnDefinition = "Numeric",nullable = false)
    private BigDecimal tva;

    @Column(name="nb_days",nullable = false)
    private int nb_day;

    @Column(name="total_exclude_tax", columnDefinition = "Numeric", nullable = false)
    private BigDecimal total_exclude_tax;

    @Column(name="state")
    private int state;

    @Column(name="comment", columnDefinition = "TEXT")
    private String comment;

    @ManyToOne
    @JoinColumn(name="client_id", referencedColumnName = "id")
    private Customer customer;



}
