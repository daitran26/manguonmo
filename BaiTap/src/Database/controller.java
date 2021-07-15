/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Database;


import static Database.NewJFrame.list;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.JOptionPane;

/**
 *
 * @author Trần Văn Đại
 */
public class controller {
     ConnectDB con = new ConnectDB();
    public void themLoaiSP(String MaLoaiSP, String TenLoaiSP){
        LoaiSP sp =new LoaiSP(MaLoaiSP, TenLoaiSP);
        String sql ="insert into LoaiSanPham VALUES(?,?)";
        try {
            PreparedStatement ps = con.con.prepareStatement(sql);
            ps.setString(1,sp.getMaLoaiSP().toString());
            ps.setString(2,TenLoaiSP);
            ps.executeUpdate();
            JOptionPane.showMessageDialog(null, "Thêm thành công");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Lỗi. Thêm thất bại");
            System.out.println(e);
        }
        this.getLoaiSP();
    }
    public void getLoaiSP(){
        list.clear();
        String sql = "SELECT * FROM LoaiSanPham";
        try {
            PreparedStatement a = con.con.prepareStatement(sql);
            ResultSet re = a.executeQuery();
            while(re.next()){
                LoaiSP m = new LoaiSP();
                m.setMaLoaiSP(re.getString("MaLoaiSP"));
                m.setTenLoaiSP(re.getString("TenLoaiSP"));
                list.add(m);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
