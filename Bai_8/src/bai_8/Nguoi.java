/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bai_8;

import java.util.Scanner;

public class Nguoi {
    protected String hoTen;
    protected String ngaySinh;
    protected String queQuan;

    public void nhapThongTin() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập họ tên: ");
        hoTen = sc.nextLine();
        System.out.print("Nhập ngày sinh: ");
        ngaySinh = sc.nextLine();
        System.out.print("Nhập quê quán: ");
        queQuan = sc.nextLine();
    }

    public void hienThiThongTin() {
        System.out.println("Họ tên: " + hoTen);
        System.out.println("Ngày sinh: " + ngaySinh);
        System.out.println("Quê quán: " + queQuan);
    }
}

