package com.example.chamudika.models;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;

@Entity

public class Booking {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY) 
    private int id;
   
    private int user_id;
    private int table_id;
    private String code;

    @ManyToOne
    @JoinColumn(name = "user_id", referencedColumnName = "id")
    private User user;

    public Booking (){

    }
    
    public Booking(int id, int user_id, int table_id, String code)
    {
        this.id=id;
        this.user_id=user_id;
        this.table_id=table_id;
        this.code=code;
    }

    public int getId() {
        return id;
    }
    
    public void setId(int id) {
        this.id = id;
    }
    
    public int getCustomer_id() {
        return user_id;
    }
    
    public void setCustomer_id(int user_id) {
        this.user_id = user_id;
    }
    
    public int getTable_id() {
        return table_id;
    }
    
    public void setTable_id(int table_id) {
        this.table_id = table_id;
    }
    
    public String getCode() {
        return code;
    }
    
    public void setCode(String code) {
        this.code = code;
    }

    
    
}
