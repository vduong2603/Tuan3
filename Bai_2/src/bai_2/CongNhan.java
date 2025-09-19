/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bai_2;

/**
 *
 * @author vduon
 */
public class CongNhan extends CanBo {
    private int bac;

    public CongNhan(String hoTen, String ngaySinh, String gioiTinh, String diaChi, int bac) {
        super(hoTen, ngaySinh, gioiTinh, diaChi);
        this.bac = bac;
    }

    public int getBac() { return bac; }
    public void setBac(int bac) { this.bac = bac; }

    @Override
    public void hienThiThongTin() {
        super.hienThiThongTin();
        System.out.println("Bac: " + bac + "/7");
    }
}

