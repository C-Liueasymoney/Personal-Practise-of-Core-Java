package interfaces;
import java.lang.reflect.Array;
import java.util.*;

public class EmployeeSortTest {
    public static void main(String[] args) {
        var staff = new Employee[3];

        staff[0] = new Employee("Harry Hacker", 35000);
        staff[1] = new Employee("Carl Cracker", 75000);
        staff[2] = new Employee("Tony Tester", 38000);

        Arrays.sort(staff);

        for (Employee e : staff)
            System.out.println("name=" + e.getName() + ",salary=" + e.getSalary());
        Comparable x;
        x = new Employee("abc", 4000);
        if (x instanceof Comparable)
            System.out.println("Yes");

    }
}
