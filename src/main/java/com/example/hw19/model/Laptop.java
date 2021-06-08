package com.example.hw19.model;

import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.stereotype.Component;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.math.BigDecimal;
import java.time.LocalDate;

@Component
@Entity
@Data
@NoArgsConstructor
public class Laptop {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;
    private String model;
    private String producer;
    private String processor;
    private int memory;
    private boolean used;
    private String laptop_case;
    private BigDecimal price;
    private LocalDate date_release;

    public Laptop(String model, String producer,
                  String processor, int memory,
                  boolean used, String laptop_case,
                  BigDecimal price, LocalDate date_release) {
        this.model = model;
        this.producer = producer;
        this.processor = processor;
        this.memory = memory;
        this.used = used;
        this.laptop_case = laptop_case;
        this.price = price;
        this.date_release = date_release;
    }
}
