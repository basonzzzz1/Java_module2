package PACKAGE_NAME;

import java.util.Scanner;

public class bai_10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("nhập vào số nguyên thứ nhất :");
        int num = sc.nextInt();
        System.out.println("nhập vào số nguyên thứ hai : ");
        int num2 = sc.nextInt();
        int max = 0;
        int count = 0;
        for (int i = 1; i < num; i++) {
            if (num % i == 0 && num2 % i == 0 && i!=num2 && num !=0 && num2 !=0) {
             max = i;
             count ++;
            }
        }
        if(count>0){
            System.out.println("ước số lớn nhất của : " + num +" và "+num2+" là : " + max);
        }else{
            if(num==0 && num2==0) {
                System.out.println(num + " và " + num2 + " không có ước chung lớn nhất");
            }else if(num==0 && num2 !=0){
                System.out.println("ước số lớn nhất của : " + num +" và "+num2+" là : " +Math.abs(num2));
            }else if(num !=0 && num2 ==0){
                System.out.println("ước số lớn nhất của : " + num +" và "+num2+" là : " +Math.abs(num));
            }
        }
    }
}
