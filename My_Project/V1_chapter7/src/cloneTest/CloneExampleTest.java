package cloneTest;

public class CloneExampleTest {
    public static void main(String[] args) {
        var e1 = new CloneExample();
        System.out.println(e1.getValue(3));
        e1.setValue(3, 222);
        System.out.println(e1.getValue(3));
        var e2 = new CloneExample(e1);
        System.out.println(e2.getValue(3));
        e2.setValue(3, 1222);
        System.out.println(e1.getValue(3) + "   " + e2.getValue(3));
    }
}

class CloneExample{
    private int[] arr;
    public CloneExample(){
        arr = new int[10];
        for (int i = 0; i < arr.length; i++)
            arr[i] = i;
    }

    public CloneExample(CloneExample original) {
        arr = new int[original.arr.length];
        for (int i = 0; i < original.arr.length; i++)
            arr[i] = original.arr[i];
    }

    public void setValue(int index, int value){
        arr[index] = value;
    }

    public int getValue(int index){
        return arr[index];
    }
}