package arrayList;

import equals.Employee;
import equals.Manager;

import java.util.*;
public class ArrayListTest {
    public static void main(String[] args){
        var staff = new ArrayList<Employee>();

        staff.add(new Employee("Carl Cracker", 75000, 1987, 12, 15));
        staff.add(new Employee("Harry Hacker", 50000, 1989, 10, 1));
        staff.add(new Employee("Tony Tester", 40000, 1990, 3, 15));

        for (Employee e : staff)
            e.raiseSalary(5);

        for (Employee e : staff)
            System.out.println(e.getName() + e.getSalary() + e.getHireDay());
        staff.add(new Manager("hei",4444, 3223, 2, 1));  // 存子类也行
        System.out.println(staff.get(3).getName());
    }
}
