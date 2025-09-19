/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package bai_7;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author vduon
 */
public class Bai_7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<HSHocSinh> danhSach = new ArrayList<>();

        System.out.print("Nhap so luong hoc sinh: ");
        int n = Integer.parseInt(scanner.nextLine());

        for (int i = 0; i < n; i++) {
            System.out.println("Nhap thong tin hoc sinh thu " + (i + 1));
            System.out.print("Ho ten: ");
            String hoTen = scanner.nextLine();
            System.out.print("Ngay sinh (dd/MM/yyyy): ");
            String ngaySinh = scanner.nextLine();
            System.out.print("Que quan: ");
            String queQuan = scanner.nextLine();

            System.out.print("Lop: ");
            String lop = scanner.nextLine();
            System.out.print("Khoa hoc: ");
            String khoaHoc = scanner.nextLine();
            System.out.print("Ky hoc: ");
            String kyHoc = scanner.nextLine();

            Nguoi nguoi = new Nguoi(hoTen, ngaySinh, queQuan);
            HSHocSinh hs = new HSHocSinh(nguoi, lop, khoaHoc, kyHoc);
            danhSach.add(hs);
        }

        System.out.println("\nHoc sinh sinh nam 1985 va que o Thai Nguyen:");
        for (HSHocSinh hs : danhSach) {
            if (hs.sinhNam1985VaQueThaiNguyen()) {
                hs.hienThiThongTin();
                System.out.println();
            }
        }

        System.out.println("Hoc sinh cua lop 10A1:");
        for (HSHocSinh hs : danhSach) {
            if (hs.getLop().equalsIgnoreCase("10A1")) {
                hs.hienThiThongTin();
                System.out.println();
            }
        }
    }
    
}
