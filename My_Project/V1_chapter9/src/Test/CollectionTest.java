package Test;

import java.util.*;

public class CollectionTest {
    public static void main(String[] args) {
        test4();
    }

    public static void test1(){
        Collection<String> c = new ArrayList<>();
        c.add("AA");
        c.add("BB");
        c.add("CC");

        Iterator<String> iter = c.iterator();
//        iter.next();
//        iter.remove();
        while(iter.hasNext()){
            String str = iter.next();
            System.out.print(str);
        }

        for (String str : c){
            System.out.print(str);
        }

        System.out.print(c);
    }

    public static <E> boolean contains(Collection<E> c, Object obj){
        for (E element : c)
            if (element.equals(obj))
                return true;
            return false;
    }

    public static void test2(){
        ArrayList<Integer> list = new ArrayList<>();
        list.add(0);
        list.add(1);
        Integer num = list.get(1);
        System.out.print(num);
    }

    public static void test3(){
        var staff = new LinkedList<String>();
        staff.add("Amy");
        staff.add("Bob");
        boolean test = staff.add("Carl");
        System.out.println(staff);
        System.out.println(test);

        Iterator<String> iter = staff.iterator();
        String first = iter.next();
        String second = iter.next();
        iter.remove();


        System.out.println(staff);
    }

    public static void test4(){
        var staff = new LinkedList<String>();
        staff.add("Amy");
        staff.add("Bob");
        staff.add("Carl");

        ListIterator<String> list1 = staff.listIterator();
        ListIterator<String> list2 = staff.listIterator();
//        list1.next();
//        list1.remove();
//        list2.next();

        System.out.println(list1.nextIndex());
        list1.next();
        System.out.println(list1.nextIndex());
    }
}
