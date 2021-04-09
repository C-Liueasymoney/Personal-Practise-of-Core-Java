package map;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class MapTest {
    public static void main(String[] args) {
        var staff = new HashMap<String, Employee>();
        staff.put("144-25-3433", new Employee("Amy Lee"));
        staff.put("233-12-4323", new Employee("Harry Hacker"));
        staff.put("124-32-4233", new Employee("Gary Cooper"));
        staff.put("234-32-2454", new Employee("Francesca Cruz"));

        System.out.println(staff);

        Employee remove1 = staff.remove("233-12-4323");
        System.out.println(staff);
        System.out.println(remove1);

        staff.put("433-23-4523", new Employee("Francesca Miller"));
        System.out.println(staff);

        System.out.println(staff.get("144-25-3433"));

        staff.forEach((k, v) -> System.out.println("Key = " + k + ", value = " + v));

        Set<String> keys = staff.keySet();
        for (String key : keys)
            System.out.println(key);

        for (Map.Entry<String, Employee> entry : staff.entrySet()){
            String key = entry.getKey();
            Employee value = entry.getValue();
            System.out.println(key);
            System.out.println(value);
        }
    }
}
