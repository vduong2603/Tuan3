/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bai_10;

public class BienLai {
    private KhachHang khachHang;
    private int chiSoCu;
    private int chiSoMoi;

    public void nhapThongTin(java.util.Scanner scanner) {
        khachHang = new KhachHang();
        khachHang.nhapThongTin(scanner);

        System.out.print("Chi so cu: ");
        chiSoCu = Integer.parseInt(scanner.nextLine());
        System.out.print("Chi so moi: ");
        chiSoMoi = Integer.parseInt(scanner.nextLine());
    }

    public void hienThiThongTin() {
        khachHang.hienThiThongTin();
        System.out.println("Chi so cu: " + chiSoCu);
        System.out.println("Chi so moi: " + chiSoMoi);
        System.out.println("Tien phai tra: " + tinhTienDien() + " VND");
    }

    public int tinhTienDien() {
        return (chiSoMoi - chiSoCu) * 750;
    }
}
