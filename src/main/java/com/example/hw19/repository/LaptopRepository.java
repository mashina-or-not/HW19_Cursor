package com.example.hw19.repository;

import com.example.hw19.model.Laptop;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface LaptopRepository extends JpaRepository<Laptop, Long> {

    List<Laptop> findAllByMemoryIsGreaterThanEqual(int memory);

    List<Laptop> findAllByUsedEquals(boolean used);

    List<Laptop> findAllByOrderByProducerDesc();

}
