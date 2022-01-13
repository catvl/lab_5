package org.sibadi.product;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class Paste extends Product {

    private final static List<Paste> pasteList = new ArrayList<>();

    public Paste(String name, String composition, BigDecimal price) {
        super(name, composition, price);
        pasteList.add(this);
    }

    public static List<Paste> getPasteList() {
        return pasteList;
    }
}