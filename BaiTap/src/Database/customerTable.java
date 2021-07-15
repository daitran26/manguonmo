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
public class customerTable extends AbstractTableModel{
    private String name[] = {"Mã loại SP", "Tên loai SP"};
    private Class classes[] = {String.class,String.class};
    private ArrayList<LoaiSP> list = new ArrayList<LoaiSP>();

    public customerTable(ArrayList<LoaiSP> list) {
        ///throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        this.list = list;
    }

    
    @Override
    public int getRowCount() {
       // throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
       return list.size();
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
             case 0: return list.get(rowIndex).getMaLoaiSP();
             case 1: return list.get(rowIndex).getTenLoaiSP();
             default:return null;
        }
    }
    
}
