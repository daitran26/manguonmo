/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Database;

/**
 *
 * @author Admin
 */
public class Table {
    static ConnectDB con = new ConnectDB();
    public static void LoaiSP(){
        String sql = "CREATE TABLE LoaiSanPham(MaLoaiSP char(4) PRIMARY KEY,TenLoaiSP varchar(30) NOT NULL)";
        con.excuteSQL(sql);
    }
    public static void SanPham(){
        String sql = "CREATE TABLE SanPham(MaSP char(4) PRIMARY KEY,"
                                        +"TenSP varchar(30) NOT NULL,"
                                        + "NhaSX varchar(20),"
                                        + "MaLoaiSP char(4),"
                                        + "CONSTRAINT fk_MaLoaiSP " 
                                        + "FOREIGN KEY (MaLoaiSP)" 
                                        + "REFERENCES LoaiSanPham(MaLoaiSP))";
        con.excuteSQL(sql);
    }
    public static void themLoaiSP(){
        String sql = "INSERT INTO LoaiSanPham VALUES ('L01', 'Tiêu dùng'\n)";
        String sql1 = "INSERT INTO LoaiSanPham VALUES ('L02', 'Xuất khẩu'\n)";
        String sql2 = "INSERT INTO LoaiSanPham VALUES ('L03', 'Hàng hóa'\n)";
        con.excuteSQL(sql);
        con.excuteSQL(sql1);
        con.excuteSQL(sql2);
    }
    public static void themSP(){
        String sql = "INSERT INTO SanPham VALUES ('SP01', 'Bánh kẹo', 'Hải Hà', 'L01'\n)";
        String sql1 = "INSERT INTO SanPham VALUES ('SP02', 'Bánh kẹo1', 'Hải Hà1', 'L02'\n)";
        String sql2 = "INSERT INTO SanPham VALUES ('SP03', 'Bánh kẹo2', 'Hải Hà2', 'L03'\n)";
        con.excuteSQL(sql);
        con.excuteSQL(sql1);
        con.excuteSQL(sql2);
    }
    //bai02
    public static void NhanVien(){
        String sql = "CREATE TABLE NhanVien(MaNV char(4) PRIMARY KEY,Hoten varchar(30),Ngaysinh char(20), diachi varchar(30), sodt char(12) ,gioitinh char(4))";
        con.excuteSQL(sql);
    }
    public static void themNV(){
        String sql = "INSERT INTO NhanVien VALUES ('NV01', 'Huy', '2020/01/01','Hà Nội','123','Nam'\n)";
        String sql1 = "INSERT INTO NhanVien VALUES ('NV02', 'Huy1', '2020/01/01','Hà Nội','1223','Nam'\n)";
        String sql2 = "INSERT INTO NhanVien VALUES ('NV03', 'Huy2', '2020/01/01','Hà Nội','12223','Nam'\n)";
        con.excuteSQL(sql);
        con.excuteSQL(sql1);
        con.excuteSQL(sql2);
    }
    public static void sanpham1(){
        String sql = "CREATE TABLE Sanpham1(MaSP char(4) PRIMARY KEY,TenSP varchar(30),DvTinh char(20), gia int)";
        con.excuteSQL(sql);
    }
    public static void hoadon(){
        String sql = "CREATE TABLE hoadon(MaHD char(4) PRIMARY KEY,MaNV char(4),LoaiHD varchar(20), ngayLap char(12), ngayGiaoNhan char(12),CONSTRAINT fk_MaNV " 
                                        + "FOREIGN KEY (MaNV)" 
                                        + "REFERENCES NhanVien(MaNV))";
        con.excuteSQL(sql);
    }
     public static void themHoaDon(){
        String sql = "INSERT INTO HoaDon VALUES ('HD01', 'NV01', 'Xuất', '2020/01/01','2020/01/04'\n)";
        String sql1 = "INSERT INTO HoaDon VALUES ('HD02', 'NV02', 'Nhập', '2020/01/01','2020/01/04'\n)";
        String sql2 = "INSERT INTO HoaDon VALUES ('HD03', 'NV03', 'Xuất', '2020/01/01','2020/01/04'\n)";
        con.excuteSQL(sql);
        con.excuteSQL(sql1);
        con.excuteSQL(sql2);
    }
     public static void chitiethoadon(){
        String sql = "CREATE TABLE Chitiethoadon(MaSP char(4) PRIMARY KEY,hinhthuc varchar(20),SL int, dongia int,CONSTRAINT fk_MaSP " 
                                        + "FOREIGN KEY (MaSP)" 
                                        + "REFERENCES SanPham1(MaSP))";
        con.excuteSQL(sql);
    }
     //Bai 03
     public static void TacGia(){
        String sql = "CREATE TABLE TacGia(MaTG varchar(14) PRIMARY KEY,TenTG varchar(34),Diachi varchar(30))";
        con.excuteSQL(sql);
    }
      public static void Sach(){
        String sql = "CREATE TABLE Sach(MaSach varchar(14) PRIMARY KEY,TuaSach varchar(34),SoTrang int,MaTG varchar(14),NamXB int, TuKhoa varchar(20),NXB varchar(20),CONSTRAINT fk_MaTG " 
                                        + "FOREIGN KEY (MaTG)" 
                                        + "REFERENCES TacGia(MaTG))";
        con.excuteSQL(sql);
    }
      public static void ChiTietSach(){
        String sql = "CREATE TABLE ChiTietSach(MaCaBiet varchar(14) PRIMARY KEY,MaSach varchar(14),tinhtrangSach int, tinhtrangphucvu int,CONSTRAINT fk_Masach " 
                                        + "FOREIGN KEY (MaSach)" 
                                        + "REFERENCES Sach(MaSach))";
        con.excuteSQL(sql);
    }
       public static void SachTG(){
        String sql = "CREATE TABLE SachTG(MaSach varchar(14) PRIMARY KEY,MaTG varchar(14),CONSTRAINT fk_MaTG " 
                                        + "FOREIGN KEY (MaTG)" 
                                        + "REFERENCES TacGia(MaTG))";
        con.excuteSQL(sql);
       }
       public static void DocGia(){
        String sql = "CREATE TABLE DocGia(SoThe varchar(14) PRIMARY KEY,Hoten varchar(14),DVCT varchar(20))";
        con.excuteSQL(sql);
       }
        public static void SachMuon(){
        String sql = "CREATE TABLE SachMuon(SoThe varchar(14) PRIMARY KEY,MaCaBiet varchar(14),ngaymuon datetime, ngayphaitra datetime, ngaytra datetime)";
        con.excuteSQL(sql);
       }
    public static void main(String[] args) {
        try {
            //LoaiSP();
//            SanPham();
//            themLoaiSP();
//            themSP();
//                NhanVien();
//                sanpham1();
//                hoadon();
//                chitiethoadon();
//themNV();
//themHoaDon();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
