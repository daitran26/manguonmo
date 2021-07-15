/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Database;

/**
 *
 * @author Trần Văn Đại
 */
public class HoaDon1 {
    private String MaHD, MaNV, LoaiHD,NgayLap, NgayNhan;

    public HoaDon1() {
    }

    public HoaDon1(String MaHD, String MaNV, String LoaiHD, String NgayLap, String NgayNhan) {
        this.MaHD = MaHD;
        this.MaNV = MaNV;
        this.LoaiHD = LoaiHD;
        this.NgayLap = NgayLap;
        this.NgayNhan = NgayNhan;
    }

    public String getMaHD() {
        return MaHD;
    }

    public void setMaHD(String MaHD) {
        this.MaHD = MaHD;
    }

    public String getMaNV() {
        return MaNV;
    }

    public void setMaNV(String MaNV) {
        this.MaNV = MaNV;
    }

    public String getLoaiHD() {
        return LoaiHD;
    }

    public void setLoaiHD(String LoaiHD) {
        this.LoaiHD = LoaiHD;
    }

    public String getNgayLap() {
        return NgayLap;
    }

    public void setNgayLap(String NgayLap) {
        this.NgayLap = NgayLap;
    }

    public String getNgayNhan() {
        return NgayNhan;
    }

    public void setNgayNhan(String NgayNhan) {
        this.NgayNhan = NgayNhan;
    }
    
}
