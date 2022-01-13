package org.sibadi.staff;

import java.util.ArrayList;
import java.util.List;

public class Waiter extends Staff {

    private static final List<Waiter> waiterList = new ArrayList<>();

    public Waiter(String name, int age, String phone) {
        super(name, age, phone);
        waiterList.add(this);
    }

    public static List<Waiter> getWaiterList() {
        return waiterList;
    }
}