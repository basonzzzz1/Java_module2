package PACKAGE_NAME;

import java.util.Scanner;

public class bai_05 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("nhập vào cân nặng:");
        double kg = sc.nextDouble();
        System.out.println("nhập vào chiều cao:");
        double met = sc.nextDouble();
        double bmi = kg/Math.pow(met,2);
        if(bmi>=18.5 && bmi<25.0){
            System.out.println("chỉ số bmi của bạn là : "+bmi+" cân đối.");
        }else if(bmi<18.5){
            System.out.println("chỉ số bmi của bạn là : "+bmi+" thiếu cân.");
        }else if(bmi>=25.0 && bmi <30.0){
            System.out.println("chỉ số bmi của bạn là : "+bmi+" thừa cân.");
        }else{
            System.out.println("chỉ số bmi của bạn là : "+bmi+" béo phì.");
        }
    }
}
