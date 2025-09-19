/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bai_7;

public class HSHocSinh {
    private Nguoi nguoi;
    private String lop;
    private String khoaHoc;
    private String kyHoc;

    public HSHocSinh(Nguoi nguoi, String lop, String khoaHoc, String kyHoc) {
        this.nguoi = nguoi;
        this.lop = lop;
        this.khoaHoc = khoaHoc;
        this.kyHoc = kyHoc;
    }

    public String getLop() {
        return lop;
    }

    public boolean sinhNam1985VaQueThaiNguyen() {
        return nguoi.getNgaySinh().endsWith("1985") &&
               nguoi.getQueQuan().equalsIgnoreCase("Thai Nguyen");
    }

    public void hienThiThongTin() {
        nguoi.hienThiThongTin();
        System.out.println("Lop: " + lop);
        System.out.println("Khoa hoc: " + khoaHoc);
        System.out.println("Ky hoc: " + kyHoc);
    }
}
