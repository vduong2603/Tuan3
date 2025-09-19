/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bai_10;

public class KhachHang {
    private String hoTen;
    private String soNha;
    private String maCongTo;

    public void nhapThongTin(java.util.Scanner scanner) {
        System.out.print("Ho ten chu ho: ");
        hoTen = scanner.nextLine();
        System.out.print("So nha: ");
        soNha = scanner.nextLine();
        System.out.print("Ma cong to: ");
        maCongTo = scanner.nextLine();
    }

    public void hienThiThongTin() {
        System.out.println("Ho ten chu ho: " + hoTen);
        System.out.println("So nha: " + soNha);
        System.out.println("Ma cong to: " + maCongTo);
    }
}
