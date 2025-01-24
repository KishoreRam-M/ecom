package com.Spring.Security.DB.Model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class ProductModel {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private String description;
    private Double price;
    private Integer quantity;
    private String category;
    private String brand;
    private String sku;
    private Double weight;
    private String dimensions;
    private Double discount;
    private String status;

    @ElementCollection
    private List<String> images;

    private String createdAt;
    private String updatedAt;

}
