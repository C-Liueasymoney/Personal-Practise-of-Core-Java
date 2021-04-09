package abstractClasses;

import javax.imageio.plugins.jpeg.JPEGImageReadParam;

public class PersonTest {
    public static void main(String[] args){
        var people = new Person[2];

        people[0] = new Employee("Harry Hacker", 50000, 1998, 6, 1);
        people[1] = new Student("Maria Morris", "computer science");

        for (Person p : people)
            System.out.println(p.getName() + ", " + p.getDescription());


        Employee a = new Employee("HEY", 5000, 3442, 2, 1);
        Employee b = a;
        System.out.println(a.equals(b));
        System.out.println(a.equals(people[0]));
        System.out.println(a.equals(people[1]));
    }
}
