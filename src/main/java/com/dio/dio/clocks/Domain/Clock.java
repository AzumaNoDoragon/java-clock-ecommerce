package com.dio.dio.clocks.Domain;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class Clock {
    private Long id;
    private String name;
    private String picture;
    private double originalPrice;
    private double actualPrice;
    private int stock;

    public Clock(Long id, String name, String picture, double originalPrice, double actualPrice, int stock) {
        this.id = id;
        this.name = name;
        this.picture = picture;
        this.originalPrice = originalPrice;
        this.actualPrice = actualPrice;
        this.stock = stock;
    }

    public Long getId() {
        return this.id;
    }

}