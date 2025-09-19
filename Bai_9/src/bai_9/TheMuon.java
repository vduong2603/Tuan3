/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bai_9;

import java.time.LocalDate;

public class TheMuon {
    private String soPhieuMuon;
    private LocalDate ngayMuon;
    private LocalDate hanTra;
    private String soHieuSach;
    private SinhVien sinhVien;

    public void nhapThongTin(java.util.Scanner scanner) {
        sinhVien = new SinhVien();
        sinhVien.nhapThongTin(scanner);

        System.out.print("So phieu muon: ");
        soPhieuMuon = scanner.nextLine();

        System.out.print("Ngay muon (yyyy-MM-dd): ");
        ngayMuon = LocalDate.parse(scanner.nextLine());

        System.out.print("Han tra (yyyy-MM-dd): ");
        hanTra = LocalDate.parse(scanner.nextLine());

        System.out.print("So hieu sach: ");
        soHieuSach = scanner.nextLine();
    }

    public void hienThiThongTin() {
        sinhVien.hienThiThongTin();
        System.out.println("So phieu muon: " + soPhieuMuon);
        System.out.println("Ngay muon: " + ngayMuon);
        System.out.println("Han tra: " + hanTra);
        System.out.println("So hieu sach: " + soHieuSach);
    }

    public boolean canTraCuoiThang() {
        return hanTra.getDayOfMonth() == hanTra.lengthOfMonth();
    }

    public String getTenSinhVien() {
        return sinhVien.getHoTen();
    }

    public String getSoHieuSach() {
        return soHieuSach;
    }
}
