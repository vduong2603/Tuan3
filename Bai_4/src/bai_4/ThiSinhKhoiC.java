/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bai_4;

/**
 *
 * @author vduon
 */
public class ThiSinhKhoiC extends ThiSinh {
    public ThiSinhKhoiC(String sbd, String hoTen, String diaChi, String uuTien) {
        super(sbd, hoTen, diaChi, uuTien);
    }

    @Override
    public void hienThiThongTin() {
        super.hienThiThongTin();
        System.out.println("Khoi thi: C (Van, Su, Dia)");
    }
}

