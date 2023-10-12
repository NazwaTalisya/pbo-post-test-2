package com.mycompany.Menu;
import java.text.DecimalFormat;

public final class Restoran {
    private final int id;
    private String name;
    private double price;

    public Restoran (int id, String name, double price) {
        this.id = id;
        this.name = name;
        this.price = price;
    }

    public int getId() {
        return id;
    }

    public String getName() { 
        return name;
    }

    public double getPrice() {
        return price;
    }

    public String toString() {
        DecimalFormat decimalFormat = new DecimalFormat("0.000"); // Format harga dengan dua desimal
        String formattedPrice = decimalFormat.format(price);
        return id + ". " + name + " - Rp " + decimalFormat.format(price);
    }

    public void setPrice(double harga) {
        this.price = harga;
    }
        
    void getName(String namaBaru) {
        throw new UnsupportedOperationException("Not supported yet. ");
    }
    
    void getId(int idBaru) {
        throw new UnsupportedOperationException("Not supported yet. ");
    }

    public void setName(String newName) {
        this.name = newName; 
    }
    
    
}