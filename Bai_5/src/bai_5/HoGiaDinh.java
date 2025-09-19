/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bai_5;

import java.util.*;

public class HoGiaDinh {
    private int soNha;
    private List<Nguoi> danhSachNguoi;

    public HoGiaDinh(int soNha) {
        this.soNha = soNha;
        this.danhSachNguoi = new ArrayList<>();
    }

    public void themNguoi(Nguoi nguoi) {
        danhSachNguoi.add(nguoi);
    }

    public boolean coNguoiThuongTho() {
        for (Nguoi nguoi : danhSachNguoi) {
            if (nguoi.laThuongTho()) {
                return true;
            }
        }
        return false;
    }

    public void hienThiThongTin() {
        System.out.println("So nha: " + soNha);
        for (Nguoi nguoi : danhSachNguoi) {
            nguoi.hienThiThongTin();
        }
    }
}

