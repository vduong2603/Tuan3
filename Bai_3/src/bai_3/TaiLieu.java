/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bai_3;

public class TaiLieu {
    protected String maTaiLieu;
    protected String tenNhaXuatBan;
    protected int soBanPhatHanh;

    public TaiLieu(String maTaiLieu, String tenNhaXuatBan, int soBanPhatHanh) {
        this.maTaiLieu = maTaiLieu;
        this.tenNhaXuatBan = tenNhaXuatBan;
        this.soBanPhatHanh = soBanPhatHanh;
    }

    public String getMaTaiLieu() {
        return maTaiLieu;
    }

    public void hienThiThongTin() {
        System.out.println("Mã TL: " + maTaiLieu + ", NXB: " + tenNhaXuatBan + ", Số bản: " + soBanPhatHanh);
    }
}

