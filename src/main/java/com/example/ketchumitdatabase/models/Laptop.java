package com.example.ketchumitdatabase.models;

import java.time.LocalDate;

public class Laptop
{
    private int laptopId;
    private String userName;
    private String tag;
    private String serialNumber;
    private String model;
    private LocalDate endOfLife;
    private String office;
    private String comments;
    private boolean oldDevice;

    public int getLaptopId() {
        return laptopId;
    }

    public void setLaptopId(int laptopId) {
        this.laptopId = laptopId;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getTag() {
        return tag;
    }

    public void setTag(String tag) {
        this.tag = tag;
    }

    public String getSerialNumber() {
        return serialNumber;
    }

    public void setSerialNumber(String serialNumber) {
        this.serialNumber = serialNumber;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public LocalDate getEndOfLife() {
        return endOfLife;
    }

    public void setEndOfLife(LocalDate endOfLife) {
        this.endOfLife = endOfLife;
    }

    public String getOffice() {
        return office;
    }

    public void setOffice(String office) {
        this.office = office;
    }

    public String getComments() {
        return comments;
    }

    public void setComments(String comments) {
        this.comments = comments;
    }

    public boolean isOldDevice() {
        return oldDevice;
    }

    public void setOldDevice(boolean oldDevice) {
        this.oldDevice = oldDevice;
    }
}
