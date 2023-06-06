package PACKAGE_NAME;

import java.util.Scanner;

public class bai_09 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Nhập số lượng tiền cho vay: ");
        double soTienVay = scanner.nextDouble();

        System.out.print("Nhập tỉ lệ lãi suất theo tháng (%): ");
        double laiSuatThang = scanner.nextDouble();

        System.out.print("Nhập số tháng cho vay: ");
        int soThangChoVay = scanner.nextInt();

        double tongTien = tinhTongTien(soTienVay, laiSuatThang, soThangChoVay);
        System.out.println("Tổng số tiền có được khi hết thời hạn cho vay: " + tongTien);
    }

    public static double tinhTongTien(double soTienVay, double laiSuatThang, int soThangChoVay) {
        double laiSuatNam = laiSuatThang / 100 * 12;
        double tienLai = soTienVay * laiSuatNam * soThangChoVay;
        double tongTien = soTienVay + tienLai;
        return tongTien;
    }
}



