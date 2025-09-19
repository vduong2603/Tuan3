/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bai_5;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Nguoi {
    private String hoTen;
    private String ngaySinh; // dd/MM/yyyy
    private String ngheNghiep;

    public Nguoi(String hoTen, String ngaySinh, String ngheNghiep) {
        this.hoTen = hoTen;
        this.ngaySinh = ngaySinh;
        this.ngheNghiep = ngheNghiep;
    }

    public int tinhTuoi() {
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        LocalDate birthDate = LocalDate.parse(ngaySinh, dtf);
        return LocalDate.now().getYear() - birthDate.getYear();
    }

    public void hienThiThongTin() {
        System.out.println("Ho ten: " + hoTen + ", Ngay sinh: " + ngaySinh + ", Nghe nghiep: " + ngheNghiep);
    }

    public boolean laThuongTho() {
        return tinhTuoi() >= 80;
    }
}

