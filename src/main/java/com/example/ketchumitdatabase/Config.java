package com.example.ketchumitdatabase;

import com.example.ketchumitdatabase.controller.LaptopController;
import com.example.ketchumitdatabase.dao.LaptopDao;
import com.example.ketchumitdatabase.dao.LaptopDaoImpl;
import com.example.ketchumitdatabase.models.Laptop;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.FilterType;

import java.util.List;

@Configuration
//@ComponentScan(excludeFilters = @ComponentScan.Filter(type = FilterType.ASSIGNABLE_TYPE, value = CommandLineRunner.class))
@ComponentScan(basePackageClasses = LaptopController.class)
@EnableAutoConfiguration
public class Config
{
    @Bean
    public LaptopDaoImpl getAllLaptops() {
        return new LaptopDaoImpl();
    }
}
