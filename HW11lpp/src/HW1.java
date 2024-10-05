import java.util.Scanner;

public class HW1 {
    public static void main(String[] args) {
        Scanner ll = new Scanner(System.in);
        int n = ll.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = ll.nextInt();
        }
        printOnlyGreaterValue(arr,average(arr));
    }

    public static double average(int[] arr) {
        double result = 0;
        for (int i = 0; i < arr.length; i++) {
            result += arr[i];
        }
        result = result/arr.length;
        return result;
    }

    public static void printOnlyGreaterValue(int[] arr, double value) {
        for (int i = 0; i < arr.length;i++){
            if (arr[i]>value){
                System.out.print(arr[i]+" ");
            }
        }
    }
}