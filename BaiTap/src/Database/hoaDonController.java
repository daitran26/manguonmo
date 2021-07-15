/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Database;

import static Database.Hoadon.listHD;
import static Database.NewJFrame.list;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.JOptionPane;

/**
 *
 * @author Trần Văn Đại
 */
public class hoaDonController {
    ConnectDB con = new ConnectDB();
    public void getHoaDon(){
        listHD.clear();
        String sql = "SELECT * FROM HoaDon";
        try {
            PreparedStatement a = con.con.prepareStatement(sql);
            ResultSet re = a.executeQuery();
            while(re.next()){
                HoaDon1 m = new HoaDon1();
                m.setMaHD(re.getString("MaHD"));
                m.setMaNV(re.getString("MaNV"));
                m.setLoaiHD(re.getString("LoaiHD"));
                m.setNgayLap(re.getString("NgayLap"));
                m.setNgayNhan(re.getString("NgayGiaoNhan"));
                listHD.add(m);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    public void themHoaDon(String MaHD, String MaNV,String LoaiHD, String NgayLap, String NgayNhan){
        HoaDon1 h = new HoaDon1(MaHD, MaNV, LoaiHD, NgayLap, NgayNhan);
        String sql ="insert into HoaDon VALUES(?,?,?,?,?)";
        try {
            PreparedStatement ps = con.con.prepareStatement(sql);
            ps.setString(1,h.getMaHD().toString());
            ps.setString(2,MaNV);
            ps.setString(3,LoaiHD);
            ps.setString(4,NgayLap);
            ps.setString(5,NgayNhan);
            ps.executeUpdate();
            JOptionPane.showMessageDialog(null, "Thêm thành công");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Lỗi. Thêm thất bại");
            System.out.println(e);
        }
        this.getHoaDon();
    }
    public void suaHD(String MaHD, String MaNV,String LoaiHD, String NgayLap, String NgayNhan){
        String sql ="UPDATE HoaDon SET MaNV = ?,  LoaiHD = ?, NgayLap = ? ,NgayGiaoNhan = ? WHERE MaHD=? ";
        try {
            PreparedStatement ps = con.con.prepareStatement(sql);
            ps.setString(1,MaNV);
            ps.setString(2,LoaiHD);
            ps.setString(3,NgayLap);
            ps.setString(4,NgayNhan);
            ps.setString(5,MaHD);
            ps.executeUpdate();
            JOptionPane.showMessageDialog(null, "Sửa thành công");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Lỗi. Sửa thất bại");
            System.out.println(e);
        }
        this.getHoaDon();
    }
}
