package br.com.natalio.api.model;

import lombok.Data;

import java.math.BigDecimal;

@Data
public class Product {
        private long id;
        private String name;
        private BigDecimal price;
        private ProductCategory category;
}
