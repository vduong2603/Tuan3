/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bai_2;

/**
 *
 * @author vduon
 */
import java.util.ArrayList;
import java.util.Scanner;

public class QLCB {
    private ArrayList<CanBo> danhSach = new ArrayList<>();
    private Scanner scanner = new Scanner(System.in);

    public void nhapCanBoMoi() {
        System.out.println("Chon loai can bo: 1-Cong nhan, 2-Ky su, 3-Nhan vien");
        int loai = Integer.parseInt(scanner.nextLine());

        System.out.print("Ho ten: ");
        String hoTen = scanner.nextLine();
        System.out.print("Ngay sinh: ");
        String ngaySinh = scanner.nextLine();
        System.out.print("Gioi tinh: ");
        String gioiTinh = scanner.nextLine();
        System.out.print("Dia chi: ");
        String diaChi = scanner.nextLine();

        switch (loai) {
            case 1:
                System.out.print("Bac (1-7): ");
                int bac = Integer.parseInt(scanner.nextLine());
                danhSach.add(new CongNhan(hoTen, ngaySinh, gioiTinh, diaChi, bac));
                break;
            case 2:
                System.out.print("Nganh dao tao: ");
                String nganh = scanner.nextLine();
                danhSach.add(new KySu(hoTen, ngaySinh, gioiTinh, diaChi, nganh));
                break;
            case 3:
                System.out.print("Cong viec: ");
                String congViec = scanner.nextLine();
                danhSach.add(new NhanVien(hoTen, ngaySinh, gioiTinh, diaChi, congViec));
                break;
            default:
                System.out.println("Lua chon khong hop le.");
        }
    }

    public void timKiemTheoTen(String ten) {
        boolean timThay = false;
        for (CanBo cb : danhSach) {
            if (cb.getHoTen().equalsIgnoreCase(ten)) {
                cb.hienThiThongTin();
                timThay = true;
            }
        }
        if (!timThay) {
            System.out.println("Khong tim thay can bo co ten: " + ten);
        }
    }
}

