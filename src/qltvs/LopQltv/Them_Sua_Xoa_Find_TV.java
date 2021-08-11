package LopQltv;



import LopQltv.MuonTra_ThuVien;
import LopQltv.Sach_ThuVien;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;


/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author JOS LINH NGUYEN
 */
public class Them_Sua_Xoa_Find_TV extends Sach_ThuVien{
    public static List<Sach_ThuVien> findSachAll() {// lấy ra ds các sinh viên 
        List<Sach_ThuVien> SSlist = new ArrayList<>();//quản lý dữ liệu đầu ra
        Connection con = null;
        Statement st = null;//lấy dữ liệu từ database đổ ra
        try {
            con = DriverManager.getConnection("jdbc:sqlserver://localhost:1433;databaseName=QLTV", "sa", "sa");

            String sql = "select*from SACH";
            st = con.createStatement();

            ResultSet rs = st.executeQuery(sql);//rs(con trỏ)//lấy dữ liệu trả về
            while (rs.next()) {//cho phép chuyển từng bản ghi trên dữ liệu đầu ra
                Sach_ThuVien std = new Sach_ThuVien(rs.getString("MASACH"), rs.getString("TENSACH"), rs.getInt("NAMXB"),rs.getString("NHAXB"),rs.getInt("GIA"),rs.getString("TINHTRANG"));
                SSlist.add(std);
            }
        } catch (Exception ex) {
            Logger.getLogger(Them_Sua_Xoa_Find_TV.class.getName()).log(Level.SEVERE, null, ex);
        }
        return SSlist;//trả về ds các sv lấy ra từ database
    }

    public static void insert(Sach_ThuVien stv) {
        Connection con ;
        PreparedStatement ps;
        try {
            con = DriverManager.getConnection("jdbc:sqlserver://localhost:1433;databaseName=QLTV", "sa", "sa");

            String sql = "insert into SACH (MASACH,TENSACH,NAMXB,NHAXB,GIA,TINHTRANG) values (?,?,?,?,?,?) ";
            ps = con.prepareCall(sql);//truyền dữ liệu vào

            ps.setString(1, stv.getMASACH());
            ps.setString(2, stv.getTENSACH());
            ps.setInt(3, stv.getNAMXB());
            ps.setString(4, stv.getNHAXB());
            ps.setInt(5, stv.getGIA());
            ps.setString(6, stv.getTINHTRANG());

            ps.execute();
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }
    public static void Update(Sach_ThuVien stv)  {
        Connection con = null;
       PreparedStatement ps = null;
        try {
            con = DriverManager.getConnection("jdbc:sqlserver://localhost:1433;databaseName=QLTV", "sa", "sa");

            String sql = "update SACH set TENSACH=?,NAMXB=?,NHAXB=?,GIA=?,TINHTRANG=? where MASACH=?";
            ps = con.prepareCall(sql);
            
            ps.setString(6, stv.getMASACH());
            ps.setString(1, stv.getTENSACH());
            ps.setInt(2, stv.getNAMXB());
            ps.setString(3, stv.getNHAXB());
            ps.setInt(4, stv.getGIA());
            ps.setString(5, stv.getTINHTRANG());
           

            ps.execute();
        } catch (Exception ex) {
            ex.printStackTrace();
       
        }
            
    }
    public static void DeleteSach(String MASACH)  {
       Connection con = null;
       PreparedStatement ps = null;
        try {
            con = DriverManager.getConnection("jdbc:sqlserver://localhost:1433;databaseName=QLTV", "sa", "sa");

            String sql = "delete from SACH where MASACH=?";
            ps = con.prepareCall(sql);
            ps.setString(1,MASACH);
            ps.execute();
            
        } catch (Exception ex) {
            ex.printStackTrace();
       
        }
            
    }

    public static List<Sach_ThuVien> findmasach(String MASACH) {
        List<Sach_ThuVien> SSlist = new ArrayList<>();
        Connection con = null;
        PreparedStatement ps = null;
        try {
            con = DriverManager.getConnection("jdbc:sqlserver://localhost:1433;databaseName=QLTV", "sa", "sa");

            String sql = "select*from SACH where MASACH like ?";
            ps = con.prepareCall(sql);
            ps.setString(1,"%"+MASACH+"%");
  
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                Sach_ThuVien std = new Sach_ThuVien(rs.getString("MASACH"), rs.getString("TENSACH"), rs.getInt("NAMXB"), rs.getString("NHAXB"),rs.getInt("GIA"),rs.getString("TINHTRANG"));
                SSlist.add(std);
            }
        } catch (Exception ex) {
                Logger.getLogger(Them_Sua_Xoa_Find_TV.class.getName()).log(Level.SEVERE, null, ex);
        }
        return SSlist;
    }
    
    
    
   ////////QUẢN LÍ MƯỢN TRẢ SÁCH THƯ VIỆN 
    
    public static List<MuonTra_ThuVien> HienThiAllMuonTra(){
        
        List<MuonTra_ThuVien> SSlist = new ArrayList<>();
        Connection con = null;
        Statement st = null;
        try {
            con = DriverManager.getConnection("jdbc:sqlserver://localhost:1433;databaseName=QLTV", "sa", "sa");

            String sql = "select*from MUONTRA";
            st = con.createStatement();

            ResultSet rs = st.executeQuery(sql);
            while (rs.next()) {
                MuonTra_ThuVien std = new MuonTra_ThuVien(rs.getString("MASV"),rs.getString("MASACH"),rs.getString("NGAYMUON"),rs.getString("NGAYTRA"),rs.getInt("SOLUONG"),rs.getString("QLTHUVIEN"));
                SSlist.add(std);
            }
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        return SSlist;
    }
    
    
    public static void InsertMuonTra(MuonTra_ThuVien stv){
        Connection con = null;
        PreparedStatement ps = null;
        try {
            con = DriverManager.getConnection("jdbc:sqlserver://localhost:1433;databaseName=QLTV", "sa", "sa");

            String sql = "insert into MUONTRA(MASV,MASACH,NGAYMUON,NGAYTRA,SOLUONG,QLTHUVIEN) values (?,?,?,?,?,?) ";
            ps = con.prepareCall(sql);

            ps.setString(1, stv.getMSV());
            ps.setString(2,stv.getMAsACH());
            ps.setString(3, stv.getNGAYMUON());
            ps.setString(4, stv.getNGAYTRA());
            ps.setInt(5, stv.getSOLUONG());
            ps.setString(6,stv.getQLTHUVIEN());

            ps.execute();
        } catch (Exception ex) {
            Logger.getLogger(Them_Sua_Xoa_Find_TV.class.getName()).log(Level.SEVERE, null, ex);
        } 
    }
    public static void DeleteMuontra(String MASV)  {
       Connection con = null;
       PreparedStatement ps = null;
        try {
            con = DriverManager.getConnection("jdbc:sqlserver://localhost:1433;databaseName=QLTV", "sa", "sa");

            String sql = "delete from MUONTRA where MASV=?";
            ps = con.prepareCall(sql);
            ps.setString(1,MASV);
            ps.execute();
        } catch (Exception ex) {
            ex.printStackTrace();
       
        }
            
    }
    public static List<MuonTra_ThuVien> findQLMT(String MASV) {
        List<MuonTra_ThuVien> Slist = new ArrayList<>();
        Connection con = null;
        PreparedStatement ps = null;
        try {
            con = DriverManager.getConnection("jdbc:sqlserver://localhost:1433;databaseName=QLTV", "sa", "sa");

            String sql = "select*from MUONTRA where MASV like ?";
            ps = con.prepareCall(sql);
            ps.setString(1,"%"+MASV+"%");
       
  
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                MuonTra_ThuVien std = new MuonTra_ThuVien(rs.getString("MASV"), rs.getString("MASACH"), rs.getString("NGAYMUON"), rs.getString("NGAYTRA"),rs.getInt("SOLUONG"),rs.getString("QLTHUVIEN"));
                Slist.add(std);
            }
        } catch (Exception ex) {
                Logger.getLogger(Them_Sua_Xoa_Find_TV.class.getName()).log(Level.SEVERE, null, ex);
        }
        return Slist;
    }
}



