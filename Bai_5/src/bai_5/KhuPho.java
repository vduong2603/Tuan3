/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bai_5;

import java.util.*;

public class KhuPho {
    private List<HoGiaDinh> danhSachHo;

    public KhuPho() {
        danhSachHo = new ArrayList<>();
    }

    public void nhapDuLieu() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhap so ho dan: ");
        int n = Integer.parseInt(scanner.nextLine());

        for (int i = 0; i < n; i++) {
            System.out.println("Nhap thong tin ho dan thu " + (i + 1));
            System.out.print("So nha: ");
            int soNha = Integer.parseInt(scanner.nextLine());
            HoGiaDinh ho = new HoGiaDinh(soNha);

            System.out.print("So thanh vien: ");
            int soTV = Integer.parseInt(scanner.nextLine());

            for (int j = 0; j < soTV; j++) {
                System.out.println("Nhap thong tin nguoi thu " + (j + 1));
                System.out.print("Ho ten: ");
                String hoTen = scanner.nextLine();
                System.out.print("Ngay sinh (dd/MM/yyyy): ");
                String ngaySinh = scanner.nextLine();
                System.out.print("Nghe nghiep: ");
                String nghe = scanner.nextLine();

                ho.themNguoi(new Nguoi(hoTen, ngaySinh, nghe));
            }

            danhSachHo.add(ho);
        }
    }

    public void hienThiHoThuongTho() {
        System.out.println("\nCac ho co nguoi mung thuong tho (80 tuoi tro len):");
        for (HoGiaDinh ho : danhSachHo) {
            if (ho.coNguoiThuongTho()) {
                ho.hienThiThongTin();
                System.out.println("-----");
            }
        }
    }
    public void themHoGiaDinh(HoGiaDinh ho) {
        this.danhSachHo.add(ho);
    }
}
