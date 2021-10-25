package com.example.ketchumitdatabase.controller;

import com.example.ketchumitdatabase.dao.LaptopDaoImpl;
import com.example.ketchumitdatabase.models.Laptop;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@Component
@RequestMapping("/api")
public class LaptopController
{
    @Autowired
    private LaptopDaoImpl laptopDaoImpl;

    @GetMapping("/laptops")
    public List<Laptop> getAllLaptops()
    {
        List<Laptop> laptops = laptopDaoImpl.getAllLaptops();
        return laptops;
    }
}
