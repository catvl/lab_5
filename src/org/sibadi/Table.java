package org.sibadi;

import java.io.Serial;
import java.io.Serializable;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public record Table(LocalDate date, Customer customer, int id, int hours) implements Serializable {

    @Serial
    private static final long serialVersionUID = 1L;

    private final static List<Table> tableList = new ArrayList<>();

    public Table(LocalDate date, Customer customer, int id, int hours) {
        this.customer = customer;
        this.hours = hours;
        this.date = date;
        this.id = id;


        tableList.add(this);
    }

    public static List<Table> getTableList() {
        return tableList;
    }

    public Customer getCustomer() {
        return customer;
    }

    public LocalDate getDate() {
        return date;
    }

    public int getHours() {
        return hours;
    }

    public int getId() {
        return id;
    }

    @Override
    public String toString(){
        return id + " " + customer + " " + date + " " + hours;
    }
}