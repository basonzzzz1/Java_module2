package PACKAGE_NAME;

import java.util.Scanner;

public class bai_03 {
    public static void main(String[] args) {
        int thang,nam;
        Scanner sc = new Scanner(System.in);

        System.out.println("nhap vao thang: ");
        thang = sc.nextInt();
        System.out.println("nhap vao nam ");
        nam = sc.nextInt();
        /*thang có 31 ngày là :1,3,5,7,8,10,12
         * thang có 30 ngày la :4,6,9,11
         * tháng có 28 hoặc 29 ngày : 2
         */
        switch (thang) {
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                System.out.println("có 31 ngày");
                break;
            case 4:
            case 6:
            case 9:
            case 11:
                System.out.println("có 30 ngày");
                break;
            case 2:
                if((nam % 4==0 && nam%100 !=0)||(nam%400==0)) {
                    System.out.println("có 29 ngày");
                }else {
                    System.out.println("có 28 ngày");
                }
                break;
            default:
                System.out.println("nhap du lieu sai");
                break;
        }
    }
}
