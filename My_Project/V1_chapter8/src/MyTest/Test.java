package MyTest;

import java.util.ArrayList;
import java.util.Random;

public class Test {
    public static void main(String[] args) {
        ArrayList<String> arrayList = new ArrayList<>();
//        arrayList.add(123);
        arrayList.add("abc");

        for (String s : arrayList){
            String item = s;
            System.out.println(item);
        }

        var generic = new Generic<String>("123");
        String num = generic.getKey();
        System.out.println(num);

        Fruit fruit = new Fruit();
        fruit.next();


    }
}

class Fruit implements TestInterface<String>{
    private String[] fruits = new String[] {"apple", "banana", "orange"};
    @Override
    public String next(){
        Random random = new Random();
        return fruits[random.nextInt(3)];
    }
}
