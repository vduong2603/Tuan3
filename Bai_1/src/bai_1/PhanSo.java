/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bai_1;

/**
 *
 * @author vduon
 */
public class PhanSo {
    private int tuSo;
    private int mauSo;

    public PhanSo() {
        this.tuSo = 0;
        this.mauSo = 1;
    }

    public PhanSo(int tuSo, int mauSo) {
        if (mauSo == 0) {
            throw new IllegalArgumentException("Mẫu số không được bằng 0");
        }
        this.tuSo = tuSo;
        this.mauSo = mauSo;
        this.toiGian();
    }

    private int timUSCLN(int a, int b) {
        a = Math.abs(a);
        b = Math.abs(b);
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }

    public boolean laToiGian() {
        return timUSCLN(tuSo, mauSo) == 1;
    }

    public void toiGian() {
        int uscln = timUSCLN(tuSo, mauSo);
        tuSo /= uscln;
        mauSo /= uscln;
    }

    public PhanSo cong(PhanSo ps307) {
        int tu = this.tuSo * ps307.mauSo + ps307.tuSo * this.mauSo;
        int mau = this.mauSo * ps307.mauSo;
        return new PhanSo(tu, mau);
    }

    public PhanSo tru(PhanSo ps307) {
        int tu = this.tuSo * ps307.mauSo - ps307.tuSo * this.mauSo;
        int mau = this.mauSo * ps307.mauSo;
        return new PhanSo(tu, mau);
    }

    public PhanSo nhan(PhanSo ps307) {
        int tu = this.tuSo * ps307.tuSo;
        int mau = this.mauSo * ps307.mauSo;
        return new PhanSo(tu, mau);
    }

    public PhanSo chia(PhanSo ps307) {
        if (ps307.tuSo == 0) {
            throw new ArithmeticException("Không thể chia cho phân số có tử số bằng 0");
        }
        int tu = this.tuSo * ps307.mauSo;
        int mau = this.mauSo * ps307.tuSo;
        return new PhanSo(tu, mau);
    }

    public String toString() {
        return tuSo + "/" + mauSo;
    }
}

