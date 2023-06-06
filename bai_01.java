package PACKAGE_NAME;

import java.util.Scanner;

public class bai_01 {
    public static void main(String[] args) {
        double width,height;
        Scanner sc = new Scanner(System.in);
        System.out.println("nhập vào chiều rộng : ");
        width = sc.nextDouble();
        System.out.println("nhập vào chiều dài : ");
        height = sc.nextDouble();
        double area = width*height;
        System.out.println("diện tích hình chữ nhật là : "+ area);
    }
}
