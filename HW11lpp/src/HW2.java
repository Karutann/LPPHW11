import java.util.Scanner;

public class HW2 {
    public static void main(String[] args) {
        Scanner ll = new Scanner(System.in);
        int[] check = {1, 2, 3, 4, 1, 2, 3, 4, 1, 2};
        int n = ll.nextInt();
        int[][] test = new int[n][10];
        for (int i = 0; i < test.length; i++) {
            for (int j = 0; j < test[0].length; j++) {
                test[i][j] = ll.nextInt();
            }
        }
        point(test,check);
    }

    public static  void point(int[][] test,int[] check) {
        int result = 0;
        for (int i = 0; i < test.length; i++) {
            for (int j = 0; j < test[0].length; j++) {
                if (test[i][j]==check[j]){
                    result++;
                }
            }
            System.out.println(result);
            result = 0;
        }
    }
}
