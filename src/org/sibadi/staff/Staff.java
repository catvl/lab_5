package org.sibadi.staff;

import java.io.Serial;
import java.io.Serializable;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

public abstract class Staff implements Serializable {

    @Serial
    private static final long serialVersionUID = 1L;

    private static final List<Staff> staffList = new ArrayList<>();

    private final LocalDate date;
    private final String id;

    private String phone;
    private String name;
    private int age;

    public Staff(String name, int age, String phone) {
        id = UUID.randomUUID().toString();
        date = LocalDate.now();
        setPhone(phone);
        setName(name);
        setAge(age);

        staffList.add(this);
    }

    public static List<Staff> getStaffList(){
        return staffList;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public LocalDate getDate() {
        return date;
    }

    public String getPhone() {
        return phone;
    }

    public String getName() {
        return name;
    }

    public String getId() {
        return id;
    }

    public int getAge() {
        return age;
    }

    @Override
    public String toString(){
        return name + " " + age + " " + phone + " " + date + " " + id;
    }
}