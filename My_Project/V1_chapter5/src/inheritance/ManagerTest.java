package inheritance;
import java.security.spec.ECParameterSpec;
import java.time.temporal.Temporal;
import java.util.Objects;
import java.util.Random;
public class ManagerTest {
    public static void main(String[] args){
        var boss = new Manager("Carl Cracker", 80000, 1987, 6, 1);
        boss.setBonus(5000);

        var staff = new Employee[3];
        staff[0] = boss;
        staff[1] = new Employee("Harry Hacker", 50000, 1987, 3, 1);
        staff[2] = new Employee("Tommy Tester", 40000, 1990, 3, 4);

        for (Employee e : staff)
            System.out.println("name=" + e.getName() + ", salary=" + e.getSalary());
//        Manager b = new Employee("test", 40000, 4, 2, 1);         // 不可以
//        Employee c = new Manager("nam", 40000, 3, 2, 12);         // 可以
//        Manager d = (Manager) new Employee("test", 40000, 4, 2, 1);         // 可以
        Class a = staff[0].getClass();
        System.out.println(a);

        Class h = Random.class;
        System.out.println(h);

    }
}
