package com.example.ketchumitdatabase.dao;

import com.example.ketchumitdatabase.models.Laptop;
import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.time.LocalDate;

public class LaptopMapper implements RowMapper<Laptop> {

    @Override
    public Laptop mapRow(ResultSet rs, int rowNum) throws SQLException {
        Laptop laptop = new Laptop();
        laptop.setLaptopId(rs.getInt("laptop_Id"));
        laptop.setUserName(rs.getString("UserName"));
        laptop.setTag(rs.getString("Tag"));
        laptop.setModel(rs.getString("Model"));
        if(rs.getDate("EndOfLife") != null)
        {
            LocalDate EoL = rs.getDate("EndOfLife").toLocalDate();
            laptop.setEndOfLife(EoL);
        }
        else
        {
            laptop.setEndOfLife(null);
        }
        laptop.setOffice(rs.getString("Office"));
        laptop.setComments(rs.getString("Comments"));
        laptop.setOldDevice(rs.getBoolean("OldDevice"));

//        System.out.println(laptop.getLaptopId());
//        System.out.println(laptop.getUserName());
//        System.out.println(laptop.getTag());
//        System.out.println(laptop.getModel());
//        System.out.println(laptop.getEndOfLife());
//        System.out.println(laptop.getOffice());
//        System.out.println(laptop.getComments());
//        System.out.println(laptop.isOldDevice());
        return laptop;
    }
}
