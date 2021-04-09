import java.util.*;
public class BreakLabel {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        exception:
        do {
            int n = in.nextInt();
            if (n > 10)
                break exception;
            System.out.println("once again");
        }
        while (true);
    }
}
