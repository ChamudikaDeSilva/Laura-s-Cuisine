package com.example.chamudika.models;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;


@Entity
@jakarta.persistence.Table (name="tables")
public class Table {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY) 
    private int id;

    @Column(name = "name", nullable = false)
    private String name;

    @Column(name = "user_count", nullable = false)
    private int user_count;

    @ManyToOne
    @JoinColumn(name = "table_id", referencedColumnName = "id")
    private Booking booking;

    public Table()
    {

    }
    public Table(int id, String name, int user_count)
    {
        this.id=id;
        this.name=name;
        this.user_count=user_count;
    }

    public int getId() {
        return id;
    }
    
    public void setId(int id){
        this.id=id;
    }

    public String getName(){
        return name;    
    }

    public void setName(String name){
        this.name=name;
    }
    
    public int getUserCount(){
        return user_count;
    }
    
    public void setUserCount(int user_count){
        this.user_count=user_count;
    }
    
}
