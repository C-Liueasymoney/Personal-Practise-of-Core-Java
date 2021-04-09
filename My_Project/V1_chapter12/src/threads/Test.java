package threads;

public class Test {
    private static int STEP = 0;
    public static void main(String[] args) {
        var test = new Test();
        for (int i = 0; i < 7; i++){
            STEP++;
            test.method();
        }
        System.out.println("还在么");

    }

    public void method(){
        if (STEP >= 2) return;
        System.out.println("输出");
    }
}
