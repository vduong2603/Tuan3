/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package bai_5;

/**
 *
 * @author vduon
 */
public class Bai_5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        KhuPho khuPho307 = new KhuPho();

        HoGiaDinh ho1 = new HoGiaDinh(101);
        ho1.themNguoi(new Nguoi("Nguyen Van A", "19/09/1945", "Nong dan")); // 80 tuổi
        ho1.themNguoi(new Nguoi("Nguyen Thi B", "01/01/1980", "Giao vien"));

        HoGiaDinh ho2 = new HoGiaDinh(102);
        ho2.themNguoi(new Nguoi("Tran Van C", "15/05/1990", "Ky su"));
        ho2.themNguoi(new Nguoi("Le Thi D", "10/10/2000", "Sinh vien"));

        HoGiaDinh ho3 = new HoGiaDinh(103);
        ho3.themNguoi(new Nguoi("Pham Van E", "20/03/1940", "Huu tri")); // 85 tuổi

        // Thêm vào khu phố
        khuPho307.themHoGiaDinh(ho1);
        khuPho307.themHoGiaDinh(ho2);
        khuPho307.themHoGiaDinh(ho3);

        // Hiển thị các hộ có người thượng thọ
        khuPho307.hienThiHoThuongTho();
    }
    
}
