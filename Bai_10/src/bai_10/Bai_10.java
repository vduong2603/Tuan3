/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package bai_10;

import java.util.Scanner;

/**
 *
 * @author vduon
 */
public class Bai_10 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scanner307 = new Scanner(System.in);
        System.out.print("Nhap so ho su dung dien: ");
        int n = Integer.parseInt(scanner307.nextLine());

        BienLai[] danhSachBienLai307 = new BienLai[n];

        for (int i = 0; i < n; i++) {
            System.out.println("\nNhap thong tin ho thu " + (i + 1));
            danhSachBienLai307[i] = new BienLai();
            danhSachBienLai307[i].nhapThongTin(scanner307);
        }

        System.out.println("\nDanh sach bien lai da nhap:");
        for (BienLai bl : danhSachBienLai307) {
            System.out.println("-----------------------------");
            bl.hienThiThongTin();
        }

        scanner307.close();

    }
    
}
