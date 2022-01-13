import org.sibadi.product.Soup;
import org.sibadi.staff.Administrator;
import org.sibadi.product.Paste;
import org.sibadi.staff.Waiter;
import org.sibadi.Customer;
import org.sibadi.Schedule;
import org.sibadi.Table;

import java.io.File;
import java.io.IOException;
import java.math.BigDecimal;
import java.time.LocalDate;

public class Main {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        final var path = "C:/Users/User/Desktop/save/";
        final var format = ".data";

        Schedule scheduleForAdministrator;
        Administrator administrator;
        Schedule scheduleForWaiter;
        Customer customer;
        Waiter waiter;
        Soup soup;
        Table table0;
        Table table1;

        File file;

        file = new File(path + "customer" + format);
        if (file.exists()) customer = Serializer.deserialization(file.getPath());
        else customer = new Customer("A", 20);
        System.out.println(customer + "\n");

        file = new File(path + "table0" + format);
        if (file.exists()) table0 = Serializer.deserialization(file.getPath());
        else table0 = new Table(LocalDate.now(), customer, 1, 5);
        System.out.println(table0 + "\n");

        file = new File(path + "table1" + format);
        if (file.exists()) table1 = Serializer.deserialization(file.getPath());
        else table1 = new Table(LocalDate.now(), customer, 2, 5);
        System.out.println(table1 + "\n");

        file = new File(path + "administrator" + format);
        if (file.exists()) administrator = Serializer.deserialization(file.getPath());
        else administrator = new Administrator("B", 20, "123");
        System.out.println(administrator + "\n");

        file = new File(path + "waiter" + format);
        if (file.exists()) waiter = Serializer.deserialization(file.getPath());
        else waiter = new Waiter("C", 20, "123");
        System.out.println(waiter + "\n");

        file = new File(path + "scheduleForWaiter" + format);
        if (file.exists()) scheduleForWaiter = Serializer.deserialization(file.getPath());
        else scheduleForWaiter = new Schedule(LocalDate.now(), waiter, 5);
        System.out.println(scheduleForWaiter + "\n");

        file = new File(path + "scheduleForAdministrator" + format);
        if (file.exists()) scheduleForAdministrator = Serializer.deserialization(file.getPath());
        else scheduleForAdministrator = new Schedule(LocalDate.now(), administrator, 5);
        System.out.println(scheduleForAdministrator + "\n");

        file = new File(path + "soup" + format);
        if (file.exists()) soup = Serializer.deserialization(file.getPath());
        else soup = new Soup("soup", "...", new BigDecimal(1000));
        System.out.println(soup + "\n");

        customer.buy(soup);

        System.out.println(customer + "\n");

        Serializer.serialization(scheduleForAdministrator, path + "scheduleForAdministrator" + format);
        Serializer.serialization(scheduleForWaiter, path + "scheduleForWaiter" + format);
        Serializer.serialization(administrator, path + "administrator" + format);
        Serializer.serialization(customer, path + "customer" + format);
        Serializer.serialization(table0, path + "table0" + format);
        Serializer.serialization(table1, path + "table1" + format);
        Serializer.serialization(waiter, path + "waiter" + format);
        Serializer.serialization(soup, path + "soup" + format);
    }
}