package com.example.hw19.configuration;

import com.example.hw19.model.Laptop;
import com.example.hw19.service.LaptopService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.List;

@Configuration
public class LaptopConfiguration {

    private final LaptopService laptopService;

    @Autowired
    public LaptopConfiguration(LaptopService laptopService) {
        this.laptopService = laptopService;
    }

    @Bean
    public void fillLaptopDatabase() {
        List<Laptop> laptops = List.of(
                new Laptop("Sony Vaio", "China", "Intel-core-i3", 16,
                        true, "steel", BigDecimal.valueOf(500), LocalDate.of(2020, 2, 5)),
                new Laptop("Acer", "China", "Intel-core-i5", 32,
                        false, "steel", BigDecimal.valueOf(600), LocalDate.of(2020, 5, 8)),
                new Laptop("MacBook Pro", "USA", "Apple-M1", 32,
                        false, "steel", BigDecimal.valueOf(750), LocalDate.of(2019, 3, 6)),
                new Laptop("Dell", "China", "Intel-core-i7", 64,
                        true, "steel", BigDecimal.valueOf(1000), LocalDate.of(2019, 1, 9)),
                new Laptop("Dell", "China", "Intel-core-i7", 64,
                        true, "plastic", BigDecimal.valueOf(950), LocalDate.of(2019, 3, 4)),
                new Laptop("Ascer Aspire 5", "USA", "Apple-M1", 8,
                        false, "steel", BigDecimal.valueOf(400), LocalDate.of(2019, 7, 6)),
                new Laptop("Apple MacBook Air", "China", "Intel-core-i3", 16,
                        true, "steel", BigDecimal.valueOf(500), LocalDate.of(2020, 1, 5)),
                new Laptop("Lenovo", "China", "AMD-Dual-core A4", 8,
                        false, "plastic", BigDecimal.valueOf(350), LocalDate.of(2019, 3, 2)),
                new Laptop("HP", "Taiwan", "AMD Ryzen 7", 16,
                        false, "steel", BigDecimal.valueOf(700), LocalDate.of(2019, 4, 4)),
                new Laptop("Acer Nitro", "Taiwan", "Intel-core-i5", 32,
                        false, "steel", BigDecimal.valueOf(800), LocalDate.of(2019, 1, 2)),
                new Laptop("Lenovo Idea Pad", "China", "AMD Ryzen 5", 16,
                        true, "steel", BigDecimal.valueOf(550), LocalDate.of(2019, 3, 3)),
                new Laptop("Asus VivoBook", "China", "Intel core-i5", 8,
                        false, "steel", BigDecimal.valueOf(400), LocalDate.of(2019, 1, 5)),
                new Laptop("Lenovo Idea Pad", "China", "AMD Ryzen 5", 16,
                        true, "steel", BigDecimal.valueOf(600), LocalDate.of(2019, 2, 3)),
                new Laptop("MacBook Pro", "USA", "Apple-M1", 32,
                        false, "steel", BigDecimal.valueOf(1300), LocalDate.of(2019, 8, 7)),
                new Laptop("Acer Nitro", "Taiwan", "Intel core-i5", 32,
                        false, "steel", BigDecimal.valueOf(700), LocalDate.of(2020, 1, 6)),
                new Laptop("Lenovo Idea Pad", "China", "AMD Ryzen 5", 16,
                        true, "steel", BigDecimal.valueOf(650), LocalDate.of(2019, 1, 5)),
                new Laptop("Asus VivoBook", "China", "Intel core-i5", 8,
                        false, "steel", BigDecimal.valueOf(400), LocalDate.of(2019, 2, 7)),
                new Laptop("Lenovo Idea Pad", "China", "AMD Ryzen 5", 16,
                        false, "steel", BigDecimal.valueOf(500), LocalDate.of(2019, 6, 6)),
                new Laptop("Asus VivoBook", "China", "Intel core-i5", 8,
                        false, "steel", BigDecimal.valueOf(500), LocalDate.of(2019, 9, 2)),
                new Laptop("MacBook Pro", "USA", "Apple-M1", 32,
                        true, "steel", BigDecimal.valueOf(1000), LocalDate.of(2019, 2, 6))
        );
        laptopService.saveAllLaptops(laptops);
    }
}
