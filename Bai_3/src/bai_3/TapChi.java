/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bai_3;

public class TapChi extends TaiLieu {
    private int soPhatHanh;
    private int thangPhatHanh;

    public TapChi(String maTL, String nxb, int soBan, int soPH, int thangPH) {
        super(maTL, nxb, soBan);
        this.soPhatHanh = soPH;
        this.thangPhatHanh = thangPH;
    }

    @Override
    public void hienThiThongTin() {
        super.hienThiThongTin();
        System.out.println("Số PH: " + soPhatHanh + ", Tháng PH: " + thangPhatHanh);
    }
}

