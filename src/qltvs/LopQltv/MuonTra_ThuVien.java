package LopQltv;


import LopQltv.Sach_ThuVien;
import java.sql.Date;
import javax.xml.crypto.Data;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author JOS LINH NGUYEN
 */
public class MuonTra_ThuVien extends Sach_ThuVien{
    String MSV;
    String MAsACH;
    String NGAYMUON,NGAYTRA;
    int SOLUONG;
    String QLTHUVIEN;

    public MuonTra_ThuVien() {
    }

    public MuonTra_ThuVien(String MSV, String MAsACH, String NGAYMUON, String NGAYTRA, int SOLUONG, String QLTHUVIEN) {
        this.MSV = MSV;
        this.MAsACH = MAsACH;
        this.NGAYMUON = NGAYMUON;
        this.NGAYTRA = NGAYTRA;
        this.SOLUONG = SOLUONG;
        this.QLTHUVIEN = QLTHUVIEN;
    }

    public String getMSV() {
        return MSV;
    }

    public void setMSV(String MSV) {
        this.MSV = MSV;
    }

    public String getMAsACH() {
        return MAsACH;
    }

    public void setMAsACH(String MAsACH) {
        this.MAsACH = MAsACH;
    }

    public String getNGAYMUON() {
        return NGAYMUON;
    }

    public void setNGAYMUON(String NGAYMUON) {
        this.NGAYMUON = NGAYMUON;
    }

    public String getNGAYTRA() {
        return NGAYTRA;
    }

    public void setNGAYTRA(String NGAYTRA) {
        this.NGAYTRA = NGAYTRA;
    }

    public int getSOLUONG() {
        return SOLUONG;
    }

    public void setSOLUONG(int SOLUONG) {
        this.SOLUONG = SOLUONG;
    }

    public String getQLTHUVIEN() {
        return QLTHUVIEN;
    }

    public void setQLTHUVIEN(String QLTHUVIEN) {
        this.QLTHUVIEN = QLTHUVIEN;
    }

    
}

