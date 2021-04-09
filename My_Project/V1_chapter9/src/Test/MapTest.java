package Test;

import java.util.HashMap;

public class MapTest {
    public static void main(String[] args) {
        var staff = new HashMap<Integer, String>();
        staff.put(10, "liu");
        System.out.println(staff);
        System.out.println(staff.get(10));
    }
}
