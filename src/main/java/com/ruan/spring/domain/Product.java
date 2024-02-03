package com.ruan.spring.domain;

import jakarta.persistence.*;
import lombok.EqualsAndHashCode;

@Table(name="product")
@Entity(name="product")
@EqualsAndHashCode(of="id")

public class Product {
    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private Long id;

}
