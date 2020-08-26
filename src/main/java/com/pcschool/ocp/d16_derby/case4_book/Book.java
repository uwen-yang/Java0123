package com.pcschool.ocp.d16_derby.case4_book;

import java.sql.Timestamp;

public class Book {
    private int id;
    private String bename;
    private int price;
    private Timestamp ts;
    
    public Book() {
        
    }
    public Book(int id, String bname, int price, Timestamp ts) {
        this.id = id;
        this.bename = bname;
        this.price = price;
        this.ts = ts;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getBname() {
        return bename;
    }

    public void setBname(String bname) {
        this.bename = bname;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public Timestamp getTs() {
        return ts;
    }

    public void setTs(Timestamp ts) {
        this.ts = ts;
    }

    @Override
    public String toString() {
        return "Book{" + "id=" + id + ", bename=" + bename + ", price=" + price + ", ts=" + ts + '}';
    }

    void add(Book book) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
