package PACKAGE_NAME;

import java.util.Scanner;

public class bai_11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("nhập vào phần tử dài nhất của hình tam giác");
        int num = sc.nextInt();
        int n = num;
        for(int i = 0;i<=num;i++) {
            for (int j = 0; j < i; j++) {
                System.out.print("* ");
            }
            System.out.println("");
        }
        for(int i =0;i<=num;i++){
            for(int j =0;j<=n;j++){
                System.out.print("* ");
            }
            System.out.println("");
            n--;
        }
    }
}
