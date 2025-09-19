/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bai_4;

/**
 *
 * @author vduon
 */
public class ThiSinh {
    protected String soBaoDanh;
    protected String hoTen;
    protected String diaChi;
    protected String uuTien;

    public ThiSinh(String soBaoDanh, String hoTen, String diaChi, String uuTien) {
        this.soBaoDanh = soBaoDanh;
        this.hoTen = hoTen;
        this.diaChi = diaChi;
        this.uuTien = uuTien;
    }

    public String getSoBaoDanh() {
        return soBaoDanh;
    }

    public void hienThiThongTin() {
        System.out.println("SBD: " + soBaoDanh + ", Ho ten: " + hoTen + ", Dia chi: " + diaChi + ", Uu tien: " + uuTien);
    }
}

