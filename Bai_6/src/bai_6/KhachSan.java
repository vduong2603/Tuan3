/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bai_6;

import java.util.*;

public class KhachSan {
    private List<KhachTro> danhSachTro = new ArrayList<>();

    public void nhapDanhSach() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhap so luong khach tro: ");
        int n = Integer.parseInt(scanner.nextLine());

        for (int i = 0; i < n; i++) {
            System.out.println("Nhap thong tin khach tro thu " + (i + 1));
            System.out.print("Ho ten: ");
            String hoTen = scanner.nextLine();
            System.out.print("Ngay sinh (dd/MM/yyyy): ");
            String ngaySinh = scanner.nextLine();
            System.out.print("So CMND: ");
            String soCMND = scanner.nextLine();

            System.out.print("So ngay tro: ");
            int soNgay = Integer.parseInt(scanner.nextLine());
            System.out.print("Loai phong: ");
            String loaiPhong = scanner.nextLine();
            System.out.print("Gia phong: ");
            double giaPhong = Double.parseDouble(scanner.nextLine());

            Nguoi nguoi = new Nguoi(hoTen, ngaySinh, soCMND);
            KhachTro khach = new KhachTro(nguoi, soNgay, loaiPhong, giaPhong);
            danhSachTro.add(khach);
        }
    }

    public void hienThiTatCa() {
        System.out.println("\n📋 Danh sach khach dang tro:");
        for (KhachTro khach : danhSachTro) {
            khach.hienThiThongTin();
            System.out.println("-----");
        }
    }

    public void xoaKhachTheoCMND(String cmnd) {
        Iterator<KhachTro> iterator = danhSachTro.iterator();
        while (iterator.hasNext()) {
            if (iterator.next().getSoCMND().equalsIgnoreCase(cmnd)) {
                iterator.remove();
                System.out.println("✅ Da xoa khach co CMND: " + cmnd);
                return;
            }
        }
        System.out.println("Khong tim thay khach co CMND: " + cmnd);
    }

    public void tinhTienTheoCMND(String cmnd) {
        for (KhachTro khach : danhSachTro) {
            if (khach.getSoCMND().equalsIgnoreCase(cmnd)) {
                double tien = khach.tinhTien();
                System.out.println("💰 So tien phai tra: " + tien + " VND");
                return;
            }
        }
        System.out.println("❌ Khong tim thay khach co CMND: " + cmnd);
    }
}

