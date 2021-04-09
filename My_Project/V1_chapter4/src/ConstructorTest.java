import java.util.*;
public class ConstructorTest {
    public static void main(String[] args){
        var staff = new Employee3[3];

        staff[0] = new Employee3("Harry", 40000);
        staff[1] = new Employee3(60000);
        staff[2] = new Employee3();

        for (Employee3 e : staff)
            System.out.println("name=" + e.getName() + ", id=" + e.getId() + ", salary=" + e.getSalary());
    }
}

class Employee3{
    private static int nextId;

    private int id;
    private String name = "";
    private double salary;

    static {
        var generator = new Random();
        nextId = generator.nextInt(1000);
    }

    {
        id = nextId;
        nextId++;
    }

    public Employee3(String n, double s){
        name = n;
        salary = s;
    }

    public Employee3(double s){
        this("Employee #" + nextId, s);
    }

    public Employee3(){}

    public String getName(){
        return name;
    }

    public double getSalary(){
        return salary;
    }

    public int getId(){
        return id;
    }
}
