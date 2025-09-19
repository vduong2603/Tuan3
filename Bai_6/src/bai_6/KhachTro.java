/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bai_6;

public class KhachTro {
    private Nguoi nguoi;
    private int soNgayTro;
    private String loaiPhong;
    private double giaPhong;

    public KhachTro(Nguoi nguoi, int soNgayTro, String loaiPhong, double giaPhong) {
        this.nguoi = nguoi;
        this.soNgayTro = soNgayTro;
        this.loaiPhong = loaiPhong;
        this.giaPhong = giaPhong;
    }

    public String getSoCMND() {
        return nguoi.getSoCMND();
    }

    public double tinhTien() {
        return soNgayTro * giaPhong;
    }

    public void hienThiThongTin() {
        nguoi.hienThiThongTin();
        System.out.println("So ngay tro: " + soNgayTro + ", Loai phong: " + loaiPhong + ", Gia phong: " + giaPhong);
    }
}

