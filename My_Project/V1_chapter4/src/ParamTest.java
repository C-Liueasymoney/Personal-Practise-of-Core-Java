import java.time.LocalDate;

public class ParamTest {
    public static void main(String[] args){
//        test1
        System.out.println("Testing tripleValue");
        double percent = 10;
        System.out.println("Before: percent=" + percent);
        tripleValue(percent);
        System.out.println("After: percent=" + percent);

//        test2
        System.out.println("\nTesting tripleSalary:");
        var harry = new Employee2("Harry", 50000);
        System.out.println("Before: salary=" + harry.getSalary());
        tripleSalary(harry);
        System.out.println("After: salary=" + harry.getSalary());

//        test3
        System.out.println("\nTesting swap:");
        var a = new Employee2("Alice", 70000);
        var b = new Employee2("Bob", 60000);
        System.out.println("Before: a=" + a.getName());
        System.out.println("Before: b=" + b.getName());
        swap(a, b);
        System.out.println("After: a=" + a.getName());
        System.out.println("After: b=" + b.getName());
    }

    public static void tripleValue(double x){
        x = 3 * x;
        System.out.println("End of method: x=" + x);
    }

    public static void tripleSalary(Employee2 x){
        x.raiseSalary(200);
        System.out.println("End of method: salary=" + x.getSalary());
    }

    public static void swap(Employee2 x, Employee2 y){
        Employee2 temp = x;
        x = y;
        y = temp;
        System.out.println("End of method: x=" + x.getName());
        System.out.println("End of method: y=" + y.getName());
    }
}

class Employee2 {
    private final String name;      // 因为没改变name，所以可以设为final
    private  double salary;

    private static int nextId = 1;
    private int id;

    public static final double PI = 3.14;

    public Employee2(String n, double s){
        name = n;
        salary = s;
    }

    public String getName(){
        return name;
    }

    public double getSalary(){
        return salary;
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
