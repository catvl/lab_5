package org.sibadi.product;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class Soup extends Product {

    private final static List<Soup> soupList = new ArrayList<>();

    public Soup(String name, String composition, BigDecimal price) {
        super(name, composition, price);
        soupList.add(this);
    }

    public static List<Soup> getSoupList() {
        return soupList;
    }
}