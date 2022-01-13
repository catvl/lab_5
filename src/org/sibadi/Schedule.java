package org.sibadi;

import org.sibadi.staff.Staff;

import java.io.Serial;
import java.io.Serializable;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public record Schedule(LocalDate date, Staff staff, int hours) implements Serializable {

    @Serial
    private static final long serialVersionUID = 1L;

    private static final List<Schedule> scheduleLine = new ArrayList<>();

    public Schedule {
        scheduleLine.add(this);
    }

    public static List<Schedule> getScheduleLine() {
        return scheduleLine;
    }

    public LocalDate getDate() {
        return date;
    }

    public Staff getStaff() {
        return staff;
    }

    public int getHours() {
        return hours;
    }

    @Override
    public String toString(){
        return staff + " " + date + " " + hours;
    }
}