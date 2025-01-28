package com.example.chamudika.models;

public class Table {
    private int id;
    private String name;
    private int user_count;

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
