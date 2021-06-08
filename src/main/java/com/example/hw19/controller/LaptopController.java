package com.example.hw19.controller;

import com.example.hw19.model.Laptop;
import com.example.hw19.service.LaptopService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

@Controller
public class LaptopController {

    private final LaptopService laptopService;

    @Autowired
    public LaptopController(LaptopService laptopService) {
        this.laptopService = laptopService;
    }

    @GetMapping("/laptops")
    public ResponseEntity<List<Laptop>> getAllLaptop() {
        return ResponseEntity.ok(laptopService.findAllLaptops());
    }

    @GetMapping(value = "/laptops", params = {"minSizeMemory"})
    public ResponseEntity<List<Laptop>> getAllLaptopsWithMemoryMore(
            @RequestParam(value = "minSizeMemory", defaultValue = "16") int memory) {
        return ResponseEntity.ok(laptopService.findAllLaptopsWithMemoryMore(memory));
    }

    @GetMapping(value = "/laptops", params = {"used"})
    public ResponseEntity<List<Laptop>> getAllLaptopsWithUsedEquals(
            @RequestParam(value = "used", defaultValue = "true") boolean isUsed) {
        return ResponseEntity.ok(laptopService.findAllLaptopsWithUsedEquals(isUsed));
    }

    @GetMapping(value = "/laptops/sorted")
    public ResponseEntity<List<Laptop>> getLaptopsSortedByProducer() {
        return ResponseEntity.ok(laptopService.findAllLaptopsSortedByProducer());
    }
}
