package com.msb.test08;

import java.util.Objects;

/**
 * @Auther: Adam
 * @Date: 2023/6/28 - 15:22
 * @Description: com.msb.test08
 * @version: 1.0
 */
public class Phone {
    private String brand;
    private double price;
    private int year;

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    /*public boolean equals(Object obj){
        if(obj instanceof Phone){
            Phone other = (Phone)obj;
            if(this.brand==other.brand&&this.price==other.price&&this.year==other.year){
                return true;
            }
        }
        return false;
    }*/

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Phone phone = (Phone) o;
        return Double.compare(phone.price, price) == 0 &&
                year == phone.year &&
                Objects.equals(brand, phone.brand);
    }

    @Override
    public int hashCode() {
        return Objects.hash(brand, price, year);
    }

    public Phone() {
    }

    public Phone(String brand, double price, int year) {
        this.brand = brand;
        this.price = price;
        this.year = year;
    }
}
