package com.example.chamudika.models;

import jakarta.persistence.*;
import java.util.Objects;

@Entity
@Table(name = "bookings")
public class Booking {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @ManyToOne
    @JoinColumn(name = "user_id", nullable = false)
    private User user;

    @ManyToOne
    @JoinColumn(name = "table_id", nullable = false)
    private DiningTable diningTable;

    @Column(name = "code", nullable = false, unique = true)
    private String code;

    // Default Constructor
    public Booking() {
    }

    // Parameterized Constructor
    public Booking(int id, User user, DiningTable diningTable, String code) {
        this.id = id;
        this.user = user;
        this.diningTable = diningTable;
        this.code = code;
    }

    // Getters and Setters
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public DiningTable getDiningTable() {
        return diningTable;
    }

    public void setDiningTable(DiningTable diningTable) {
        this.diningTable = diningTable;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    // Override equals and hashCode for proper comparison
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Booking booking = (Booking) o;
        return id == booking.id &&
                Objects.equals(user, booking.user) &&
                Objects.equals(diningTable, booking.diningTable) &&
                Objects.equals(code, booking.code);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, user, diningTable, code);
    }
}
