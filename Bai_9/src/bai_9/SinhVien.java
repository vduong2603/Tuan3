/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bai_9;

public class SinhVien {
    private String hoTen;
    private String maSV;
    private String ngaySinh;
    private String lop;

    public void nhapThongTin(java.util.Scanner scanner) {
        System.out.print("Ho ten: ");
        hoTen = scanner.nextLine();
        System.out.print("Ma sinh vien: ");
        maSV = scanner.nextLine();
        System.out.print("Ngay sinh: ");
        ngaySinh = scanner.nextLine();
        System.out.print("Lop: ");
        lop = scanner.nextLine();
    }

    public void hienThiThongTin() {
        System.out.println("Ho ten: " + hoTen);
        System.out.println("Ma SV: " + maSV);
        System.out.println("Ngay sinh: " + ngaySinh);
        System.out.println("Lop: " + lop);
    }

    public String getHoTen() {
        return hoTen;
    }
}
