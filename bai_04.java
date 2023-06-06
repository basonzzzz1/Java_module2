package PACKAGE_NAME;

import java.util.Scanner;

public class bai_04 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("nhập vào năm : ");
        double year = sc.nextDouble();
        if(year%100 == 0 && year%400 ==0 || year%4==0){
                System.out.println("năm : "+year+" là năm nhuận.");
        }else{
            System.out.println("năm : "+year+" không phải năm nhuận.");
        }
    }
}
