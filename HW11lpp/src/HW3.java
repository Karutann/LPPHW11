import java.util.Scanner;

public class HW3 {
    public static void main(String[] args) {
        Scanner ll = new Scanner(System.in);
        int n = ll.nextInt();
        int[] credit = new int[n];
        double[] grade = new double[n];
        for (int i = 0; i < n; i++) {
            String name = ll.next();
            credit[i] = ll.nextInt();
            grade[i] = ll.nextDouble();
        }
        double gpa = calGPA(credit,grade,n);
        System.out.printf("%.2f",gpa);
    }

    public static double calGPA(int[] c, double[] g,int n) {
        double allPlus = 0;
        int divide = 0;
        for (int i = 0; i < n; i++) {
            allPlus+=c[i]*g[i];
            divide+=c[i];
        }
        double result = allPlus/divide;
        return result;
    }
}
