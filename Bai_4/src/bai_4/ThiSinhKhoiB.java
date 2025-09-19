/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bai_4;

/**
 *
 * @author vduon
 */
public class ThiSinhKhoiB extends ThiSinh {
    public ThiSinhKhoiB(String sbd, String hoTen, String diaChi, String uuTien) {
        super(sbd, hoTen, diaChi, uuTien);
    }

    @Override
    public void hienThiThongTin() {
        super.hienThiThongTin();
        System.out.println("Khoi thi: B (Toan, Hoa, Sinh)");
    }
}

