/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bai_8;

import java.util.Scanner;

public class CBGV extends Nguoi {
    private double luongCung;
    private double thuong;
    private double phat;

    public void nhapThongTinCBGV() {
        super.nhapThongTin();
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập lương cứng: ");
        luongCung = sc.nextDouble();
        System.out.print("Nhập tiền thưởng: ");
        thuong = sc.nextDouble();
        System.out.print("Nhập tiền phạt: ");
        phat = sc.nextDouble();
    }

    public double tinhLuongThucLinh() {
        return luongCung + thuong - phat;
    }

    public void hienThiThongTinCBGV() {
        super.hienThiThongTin();
        System.out.println("Lương cứng: " + luongCung);
        System.out.println("Thưởng: " + thuong);
        System.out.println("Phạt: " + phat);
        System.out.println("Lương thực lĩnh: " + tinhLuongThucLinh());
    }
}
