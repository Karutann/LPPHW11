import java.util.Scanner;

public class HW4 {
    public static void main(String[] args) {
        Scanner ll = new Scanner(System.in);
        int m = ll.nextInt();
        int n = ll.nextInt();
        char[][] img = new char[m][n];
        for (int i = 0; i < img.length; i++) {
            for (int j = 0; j < img[0].length; j++) {
                img[i][j] = ll.next().charAt(0);
            }
        }
        int num = check(img);
        boolean boo = check2(m,n,num);
        if (boo){
            for (int i = 0; i < img.length; i++) {
                for (int j = 0; j < img[0].length; j++) {
                    if (i%2==0||j%2!=0){
                        img[i][j] = 'x';
                    }
                }
            }
        }else {
            for (int i = 0; i < img.length; i++) {
                for (int j = 0; j < img[0].length; j++) {
                    if (i==0||i==m-1||j==0||j==n-1){
                        img[i][j] = '+';
                    }
                }
            }
        }
        for (int i = 0; i < img.length; i++) {
            for (int j = 0; j < img[0].length; j++) {
                System.out.print(img[i][j]+" ");
            }
            System.out.println();
        }
    }

    public static int check(char[][] img) {
        int num = 0;
        for (int i = 0; i < img.length; i++) {
            for (int j = 0; j < img[0].length; j++) {
                if (img[i][j]=='$'){
                    num++;
                }
            }
        }
        return num;
    }

    public static boolean check2(int m,int n,int num) {
        boolean result = false;
        if (2*num>m*n) {
            result = true;
        }
        return result;
    }
}