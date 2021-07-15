/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Database;

import java.util.ArrayList;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author Trần Văn Đại
 */
public class TableHoaDon extends AbstractTableModel{
    private String name[] = {"Mã HD", "Mã NV","Loại HD", "NgayLap","NgayGiaoNhan"};
    private Class classes[] = {String.class,String.class,String.class,String.class,String.class};
    private ArrayList<HoaDon1> listHD = new ArrayList<HoaDon1>();

    public TableHoaDon(ArrayList<HoaDon1> listHD) {
       // throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
       this.listHD = listHD;
    }
    
    @Override
    public int getRowCount() {
       // throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
       return listHD.size();
    }

    @Override
    public int getColumnCount() {
       // throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
       return name.length;
    }

    @Override
    public Class getColumnClass(int columnIndex) {
        return classes[columnIndex]; //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public String getColumnName(int column) {
        return name[column]; //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        switch(columnIndex){
             case 0: return listHD.get(rowIndex).getMaHD();
             case 1: return listHD.get(rowIndex).getMaNV();
             case 2: return listHD.get(rowIndex).getLoaiHD();
             case 3: return listHD.get(rowIndex).getNgayLap();
             case 4: return listHD.get(rowIndex).getNgayNhan();
             default:return null;
        }
    }
    
}
