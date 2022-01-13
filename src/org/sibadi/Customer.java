package org.sibadi;

import org.sibadi.product.Product;

import java.io.Serial;
import java.io.Serializable;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

public class Customer implements Serializable {

    @Serial
    private static final long serialVersionUID = 1L;

    private final static List<Customer> customerList = new ArrayList<>();

    private final String name;
    private final String id;
    private final int age;

    private BigDecimal money;

    public Customer(String name, int age){
        id = UUID.randomUUID().toString();
        money = new BigDecimal(0);
        this.name = name;
        this.age = age;

        customerList.add(this);
    }

    @Override
    protected void finalize() throws Throwable {
        customerList.remove(this);
    }

    public static List<Customer> getCustomerList() {
        return customerList;
    }

    public void buy(Product product){
        money = money.add(product.getPrice());
    }

    public BigDecimal getMoney() {
        return money;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getId() {
        return id;
    }

    @Override
    public String toString(){
        return name + " " + age + " " + money + " " + id;
    }
}