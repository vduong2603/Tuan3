/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bai_3;

public class Sach extends TaiLieu {
    private String tenTacGia;
    private int soTrang;

    public Sach(String maTL, String nxb, int soBan, String tacGia, int trang) {
        super(maTL, nxb, soBan);
        this.tenTacGia = tacGia;
        this.soTrang = trang;
    }

    @Override
    public void hienThiThongTin() {
        super.hienThiThongTin();
        System.out.println("Tác giả: " + tenTacGia + ", Số trang: " + soTrang);
    }
}

