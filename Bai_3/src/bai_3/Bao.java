/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bai_3;

public class Bao extends TaiLieu {
    private String ngayPhatHanh;

    public Bao(String maTL, String nxb, int soBan, String ngayPH) {
        super(maTL, nxb, soBan);
        this.ngayPhatHanh = ngayPH;
    }

    @Override
    public void hienThiThongTin() {
        super.hienThiThongTin();
        System.out.println("Ngày PH: " + ngayPhatHanh);
    }
}

