package com.example.ketchumitdatabase.dao;

import com.example.ketchumitdatabase.models.Laptop;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;

import java.util.List;

public class LaptopDaoImpl implements LaptopDao
{
    @Autowired
    JdbcTemplate jdbc;

    @Override
    public List<Laptop> getAllLaptops()
    {
        final String SELECT_ALL_LAPTOPS = "SELECT * FROM Laptops";
        return jdbc.query(SELECT_ALL_LAPTOPS, new LaptopMapper());
    }
}
