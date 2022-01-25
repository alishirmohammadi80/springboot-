
package com.example.demo;

import java.io.Serializable;



public class Items implements Serializable{
private int Id;
private String Name;
private double Price;
private int Qty;

    public Items(int Id, String Name, double Price, int Qty) {
        this.Id = Id;
        this.Name = Name;
        this.Price = Price;
        this.Qty = Qty;
    }

    public int getId() {
        return Id;
    }

    public void setId(int Id) {
        this.Id = Id;
    }

    public String getName() {
        return Name;
    }

    public void setName(String Name) {
        this.Name = Name;
    }

    public double getPrice() {
        return Price;
    }

    public void setPrice(double Price) {
        this.Price = Price;
    }

    public int getQty() {
        return Qty;
    }

    public void setQty(int Qty) {
        this.Qty = Qty;
    }

   
}

