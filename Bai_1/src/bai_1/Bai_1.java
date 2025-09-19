/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package bai_1;

/**
 *
 * @author vduon
 */
public class Bai_1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        PhanSo sp1_307 = new PhanSo(4, 8);
        PhanSo sp2_307 = new PhanSo(3, 6);

        System.out.println("Phan so 1: " + sp1_307);
        System.out.println("Phan so 2: " + sp2_307);

        PhanSo spTong_307 = sp1_307.cong(sp2_307);
        System.out.println("Tong: " + spTong_307);

        System.out.println("Hieu: " + sp1_307.tru(sp2_307));
        System.out.println("Tich: " + sp1_307.nhan(sp2_307));
        System.out.println("Thuong: " + sp1_307.chia(sp2_307));

        System.out.println("Phan so 1 co toi gian khong? " + sp1_307.laToiGian());
        System.out.println("Phan so 2 co toi gian khong? " + sp2_307.laToiGian());
    }
    
}
