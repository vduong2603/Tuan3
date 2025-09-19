/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package bai_6;

import java.util.Scanner;

/**
 *
 * @author vduon
 */
public class Bai_6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        KhachSan khachSan307 = new KhachSan();

        khachSan307.nhapDanhSach();
        khachSan307.hienThiTatCa();

        System.out.print("\nNhap CMND de tinh tien tra phong: ");
        String cmndTraPhong = scanner.nextLine();
        khachSan307.tinhTienTheoCMND(cmndTraPhong);

        System.out.print("\nNhap CMND de xoa khach tro: ");
        String cmndXoa = scanner.nextLine();
        khachSan307.xoaKhachTheoCMND(cmndXoa);

        System.out.println("\n📋 Danh sach sau khi xoa:");
        khachSan307.hienThiTatCa();
    }
    
}
