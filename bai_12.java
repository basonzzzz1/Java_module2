package PACKAGE_NAME;

import java.util.Scanner;

public class bai_12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("nhập vào các số nguyên tố đầu tiên muốn hiển thị");
        int num = sc.nextInt();
        int count =0;
        int count1 =0;
        for(int i = 0;i<= 1000000;i++){
            for(int j = 2;j<i;j++){
              if(i%j==0){
                  count++;
              }
            }
            if(count==0){
                if(count1==num){
                    break;
                }
                System.out.println(i);
                count1++;
            }
        }
    }
}
