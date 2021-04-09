import java.time.*;
public class EmployeeTest {
    public static void main(String[] args){
        Employee[] staff = new Employee[3];
        staff[0] = new Employee("Carl Cracker", 75000, 1987, 12, 15);
        staff[1] = new Employee("Harry Hacker", 50000, 1989, 10, 1);
        staff[2] = new Employee("Tony Tester", 40000, 1990, 3, 15);

        for (Employee e : staff)
            e.raiseSalary(5);

        for (Employee e : staff)
            System.out.println("Name=" + e.getName() + ", salary=" + e.getSalary() + ", hireDay=" + e.getHireDay());

        for (Employee e : staff) {
            e.setId();
            System.out.println(e.getId());
        }
        System.out.println(staff[0].PI);
        System.out.println(Employee.PI);
        System.out.println(Employee.getNextId());
    }
}

class Employee {
    private final String name;      // 因为没改变name，所以可以设为final
    private  double salary;
    private final LocalDate hireDay;

    private static int nextId = 1;
    private int id;

    public static final double PI = 3.14;

    public Employee(String n, double s, int year, int month, int day){
        name = n;
        salary = s;
        hireDay = LocalDate.of(year, month, day);
    }

    public String getName(){
        return name;
    }

    public double getSalary(){
        return salary;
    }

    public LocalDate getHireDay(){
        return hireDay;
    }

    public void raiseSalary(double byPercent){
//        double raise = salary * byPercent / 100;
//        salary += raise;
        this.salary += this.salary * byPercent / 100;
    }

    public void setId(){
        this.id = nextId;
        nextId++;
    }

    public int getId(){
        return id;
    }

    public static int getNextId(){
        return nextId;
    }
}
