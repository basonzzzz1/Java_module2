package PACKAGE_NAME;

import java.util.Scanner;

public class bai_02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //ax+b =c
        System.out.println("giải phương trình bậc nhất");
        System.out.println("a*x+b=c");
        System.out.println("nhập vào a : ");
        double a = sc.nextDouble();
        System.out.println("nhập vào b : ");
        double b = sc.nextDouble();
        System.out.println("nhập vào c : ");
        double c = sc.nextDouble();
        if (a != 0) {
            double answer = (c-b)/a;
            System.out.println("phương trình có nghiệm x = "+answer);
        }else{
            if(b==c){
                System.out.println("phương trình vô số nghiệm !");
            }else{
                System.out.println("phương trình vô nghiệm !");
            }
        }
    }
}