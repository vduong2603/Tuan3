/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bai_3;

import java.util.*;

public class QuanLySach {
    private List<TaiLieu> danhSach307 = new ArrayList<>();

    public void themTaiLieu(TaiLieu tl307) {
        danhSach307.add(tl307);
    }

    public void timTheoLoai(String loai307) {
        for (TaiLieu tl307 : danhSach307) {
            if ((loai307.equalsIgnoreCase("sach") && tl307 instanceof Sach) ||
                (loai307.equalsIgnoreCase("tapchi") && tl307 instanceof TapChi) ||
                (loai307.equalsIgnoreCase("bao") && tl307 instanceof Bao)) {
                tl307.hienThiThongTin();
                System.out.println("-----");
            }
        }
    }

    public void timTheoMa(String ma307) {
        for (TaiLieu tl307 : danhSach307) {
            if (tl307.getMaTaiLieu().equalsIgnoreCase(ma307)) {
                tl307.hienThiThongTin();
                return;
            }
        }
        System.out.println("Không tìm thấy tài liệu với mã: " + ma307);
    }
}