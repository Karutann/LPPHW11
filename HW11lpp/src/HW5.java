import java.util.Scanner;

public class HW5 {
    public static void main(String[] args) {
        Scanner ll =new Scanner(System.in);
        int n = ll.nextInt();
        int multiply = ll.nextInt();
        System.out.println(mul(n,multiply));
    }

    public static int mul(int n, int multi)  {
        int result = 0;
        if (multi==0){
            return 0;
        } else {
            result+=n+mul(n,multi-1);
        }return result;
    }
}