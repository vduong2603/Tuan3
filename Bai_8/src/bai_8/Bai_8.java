/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package bai_8;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author vduon
 */
public class Bai_8 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ArrayList<CBGV> danhSachCBGV_307 = new ArrayList<>();
        Scanner sc_307 = new Scanner(System.in);

        System.out.print("Nhap so luong can bo giao vien: ");
        int soLuong_307 = sc_307.nextInt();
        sc_307.nextLine(); // bo dong thua

        for (int i_307 = 0; i_307 < soLuong_307; i_307++) {
            System.out.println("\nNhap thong tin can bo giao vien thu " + (i_307 + 1));
            CBGV cbgv_307 = new CBGV();
            cbgv_307.nhapThongTinCBGV();
            danhSachCBGV_307.add(cbgv_307);
        }

        System.out.println("\nDanh sach can bo co luong thuc linh >= 8 trieu:");
        for (CBGV cbgv_307 : danhSachCBGV_307) {
            if (cbgv_307.tinhLuongThucLinh() >= 8000000) {
                cbgv_307.hienThiThongTinCBGV();
                System.out.println("------------------------");
            }
        }
    }
    
}
