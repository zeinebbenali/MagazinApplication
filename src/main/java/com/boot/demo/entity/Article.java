package com.boot.demo.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.Id;
import java.math.BigDecimal;

@Data
@Builder
@Entity

@NoArgsConstructor
@AllArgsConstructor
public class Article {
    @Id
    Long id;
    String name;
    BigDecimal amount;
    String providerName;
}
