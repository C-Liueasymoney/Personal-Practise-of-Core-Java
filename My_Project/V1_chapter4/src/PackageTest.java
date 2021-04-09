import com.horstmann.corejava.*;
import com.horstmann.corejava.Employee;

import static java.lang.System.*;
public class PackageTest {
    public static void main(String[] args){
        var harry = new Employee("Harry Hacker", 50000, 1998, 6, 1);

        harry.raiseSalary(5);

        out.println("name=" + harry.getName() + ", salary=" + harry.getSalary());
    }
}
