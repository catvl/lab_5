package org.sibadi.staff;

import java.util.ArrayList;
import java.util.List;

public class Administrator extends Staff {

    private static final List<Administrator> administratorList = new ArrayList<>();

    public Administrator(String name, int age, String phone) {
        super(name, age, phone);
        administratorList.add(this);
    }

    public static List<Administrator> getAdministratorList() {
        return administratorList;
    }
}