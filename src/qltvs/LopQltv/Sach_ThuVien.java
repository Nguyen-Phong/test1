package LopQltv;





/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author JOS LINH NGUYEN
 */
// 
public class Sach_ThuVien {
    String MASACH,TENSACH;
    int NAMXB;
    String NHAXB;
    int GIA;
    String TINHTRANG;

    public Sach_ThuVien() {
    }

    public Sach_ThuVien(String MASACH, String TENSACH, int NAMXB, String NHAXB, int GIA, String TINHTRANG) {
        this.MASACH = MASACH;
        this.TENSACH = TENSACH;
        this.NAMXB = NAMXB;
        this.NHAXB = NHAXB;
        this.GIA = GIA;
        this.TINHTRANG = TINHTRANG;
    }

    public String getMASACH() {
        return MASACH;
    }

    public void setMASACH(String MASACH) {
        this.MASACH = MASACH;
    }

    public String getTENSACH() {
        return TENSACH;
    }

    public void setTENSACH(String TENSACH) {
        this.TENSACH = TENSACH;
    }

    public int getNAMXB() {
        return NAMXB;
    }

    public void setNAMXB(int NAMXB) {
        this.NAMXB = NAMXB;
    }

    public String getNHAXB() {
        return NHAXB;
    }

    public void setNHAXB(String NHAXB) {
        this.NHAXB = NHAXB;
    }

    public int getGIA() {
        return GIA;
    }

    public void setGIA(int GIA) {
        this.GIA = GIA;
    }

    public String getTINHTRANG() {
        return TINHTRANG;
    }

    public void setTINHTRANG(String TINHTRANG) {
        this.TINHTRANG = TINHTRANG;
    }

    
}
