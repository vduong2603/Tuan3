/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package bai_4;

/**
 *
 * @author vduon
 */
public class Bai_4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        TuyenSinh tuyenSinh307 = new TuyenSinh();

        ThiSinh tsA307 = new ThiSinhKhoiA("A001", "Nguyen Van A", "Da Nang", "KV1");
        ThiSinh tsB307 = new ThiSinhKhoiB("B001", "Tran Thi B", "Hue", "KV2");
        ThiSinh tsC307 = new ThiSinhKhoiC("C001", "Le Van C", "Quang Nam", "KV3");

        tuyenSinh307.themThiSinh(tsA307);
        tuyenSinh307.themThiSinh(tsB307);
        tuyenSinh307.themThiSinh(tsC307);

        System.out.println("Danh sach thi sinh:");
        tuyenSinh307.hienThiTatCaThiSinh();

        System.out.println("\nTim theo SBD 'B001':");
        tuyenSinh307.timTheoSBD("B001");
    }
    
}
