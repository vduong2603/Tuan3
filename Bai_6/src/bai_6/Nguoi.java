/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bai_6;

public class Nguoi {
    private String hoTen;
    private String ngaySinh;
    private String soCMND;

    public Nguoi(String hoTen, String ngaySinh, String soCMND) {
        this.hoTen = hoTen;
        this.ngaySinh = ngaySinh;
        this.soCMND = soCMND;
    }

    public String getSoCMND() {
        return soCMND;
    }

    public void hienThiThongTin() {
        System.out.println("Ho ten: " + hoTen + ", Ngay sinh: " + ngaySinh + ", So CMND: " + soCMND);
    }
}

