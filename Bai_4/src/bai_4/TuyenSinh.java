/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bai_4;

/**
 *
 * @author vduon
 */
import java.util.*;

public class TuyenSinh {
    private List<ThiSinh> danhSachThiSinh307 = new ArrayList<>();

    public void themThiSinh(ThiSinh ts307) {
        danhSachThiSinh307.add(ts307);
    }

    public void hienThiTatCaThiSinh() {
        for (ThiSinh ts307 : danhSachThiSinh307) {
            ts307.hienThiThongTin();
            System.out.println("-----");
        }
    }

    public void timTheoSBD(String sbd307) {
        for (ThiSinh ts307 : danhSachThiSinh307) {
            if (ts307.getSoBaoDanh().equalsIgnoreCase(sbd307)) {
                ts307.hienThiThongTin();
                return;
            }
        }
        System.out.println("Khong tim thay thi sinh co SBD: " + sbd307);
    }
}


