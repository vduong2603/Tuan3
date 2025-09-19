/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package bai_2;

import java.util.Scanner;

/**
 *
 * @author vduon
 */
public class Bai_2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
         QLCB qlcb_307 = new QLCB(); // Bien duoc dat theo MSV: 307
        Scanner scanner = new Scanner(System.in);

        CongNhan cn_307 = new CongNhan("Nguyen Van A", "01/01/1990", "Nam", "Da Nang", 5);
        KySu ks_307 = new KySu("Tran Thi B", "12/12/1988", "Nu", "Hue", "Cong nghe thong tin");
        NhanVien nv_307 = new NhanVien("Le Van C", "05/05/1995", "Nam", "Quang Nam", "Van phong");
        
        while (true) {
            System.out.println("\n--- MENU ---");
            System.out.println("1. Nhap can bo moi");
            System.out.println("2. Tim kiem theo ho ten");
            System.out.println("3. Thoat");
            System.out.print("Chon: ");
            int chon = Integer.parseInt(scanner.nextLine());

            switch (chon) {
                case 1:
                    qlcb_307.nhapCanBoMoi();
                    break;
                case 2:
                    System.out.print("Nhap ten can tim: ");
                    String ten = scanner.nextLine();
                    qlcb_307.timKiemTheoTen(ten);
                    break;
                case 3:
                    System.out.println("Ket thuc chuong trinh.");
                    return;
                default:
                    System.out.println("Lua chon khong hop le.");
            }
        }
    }
    
}
