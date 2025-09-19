/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package bai_9;

import java.util.Scanner;

/**
 *
 * @author vduon
 */
public class Bai_9 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scanner307 = new Scanner(System.in);
        TheMuon[] danhSachMuon307 = new TheMuon[3];

        for (int i = 0; i < 3; i++) {
            System.out.println("\nNhap thong tin the muon thu " + (i + 1));
            danhSachMuon307[i] = new TheMuon();
            danhSachMuon307[i].nhapThongTin(scanner307);
        }

        System.out.println("\nDanh sach sinh vien can tra sach vao ngay cuoi thang:");
        for (TheMuon tm : danhSachMuon307) {
            if (tm.canTraCuoiThang()) {
                System.out.println("Sinh vien: " + tm.getTenSinhVien());
                System.out.println("Sach muon (so hieu): " + tm.getSoHieuSach());
                System.out.println("-----------------------------");
            }
        }

        scanner307.close();
    }
    
}
