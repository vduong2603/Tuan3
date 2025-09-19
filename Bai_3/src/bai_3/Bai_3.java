/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package bai_3;

import java.util.ArrayList;

/**
 *
 * @author vduon
 */
public class Bai_3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        QuanLySach quanLy307 = new QuanLySach();

        Sach sach307 = new Sach("S001", "NXB Tre", 100, "Nguyen Nhat Anh", 250);
        TapChi tapChi307 = new TapChi("T001", "NXB Khoa hoc", 50, 12, 9);
        Bao bao307 = new Bao("B001", "NXB Lao Dong", 200, "19/09/2025");

        quanLy307.themTaiLieu(sach307);
        quanLy307.themTaiLieu(tapChi307);
        quanLy307.themTaiLieu(bao307);

        System.out.println(" Tim theo loai 'sach':");
        quanLy307.timTheoLoai("sach");

        System.out.println("Tim theo ma 'B001':");
        quanLy307.timTheoMa("B001");

    }
}

