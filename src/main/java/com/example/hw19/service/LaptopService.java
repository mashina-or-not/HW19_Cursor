package com.example.hw19.service;

import com.example.hw19.model.Laptop;
import com.example.hw19.repository.LaptopRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class LaptopService {

    private final LaptopRepository laptopRepository;

    @Autowired
    public LaptopService(LaptopRepository laptopRepository) {
        this.laptopRepository = laptopRepository;
    }

    public List<Laptop> findAllLaptops() {
        return laptopRepository.findAll();
    }

    public void saveAllLaptops(List<Laptop> laptopList) {
        laptopRepository.saveAll(laptopList);
    }

    public List<Laptop> findAllLaptopsWithMemoryMore(int memory) {
        return laptopRepository.findAllByMemoryIsGreaterThanEqual(memory);
    }

    public List<Laptop> findAllLaptopsWithUsedEquals(boolean used) {
        return laptopRepository.findAllByUsedEquals(used);
    }

    public List<Laptop> findAllLaptopsSortedByProducer() {
        return laptopRepository.findAllByOrderByProducerDesc();
    }

}
