package pair2;

import pair1.PairTest1;

import java.time.LocalDate;

public class PairTest2 {
    public static void main(String[] args) {
        LocalDate[] birthday = {
                LocalDate.of(1996, 12, 9),
                LocalDate.of(1815, 12, 10),
                LocalDate.of(1903, 12, 3),
                LocalDate.of(1910, 6, 22)
        };
        Pair<LocalDate> mn = ArrayAlg.minmax(birthday);
        System.out.println("min = " + mn.getFirst());
        System.out.println("max = " + mn.getSecond());
    }
}

class ArrayAlg{
    public static <T extends Comparable> Pair<T> minmax(T[] a){
        if (a == null || a.length == 0)
            return null;
        T min = a[0];
        T max = a[0];
        for (int i = 1; i < a.length; i++){
            if (min.compareTo(a[i]) > 0)
                min = a[i];
            if (max.compareTo(a[i]) < 0)
                max = a[i];
        }
        return new Pair<>(min, max);
    }
}
