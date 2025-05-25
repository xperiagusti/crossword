/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import java.util.List;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author ASUS
 */
public class ModTabelAkun extends AbstractTableModel{

    List<ModAkun> lma;

    public ModTabelAkun(List<ModAkun> lma) {
        this.lma = lma;
    }
    
    @Override
    public int getRowCount() {
       return lma.size();
    }

    @Override
    public int getColumnCount() {
         return 3;
    }

    @Override
    public Object getValueAt(int row, int column) {
        switch(column){
            case 0:
                return lma.get(row).getNo_akun();
            case 1:
                return lma.get(row).getNama();
            case 2:
                return lma.get(row).getPoin();
           
            default:
                return null;    
        }
    }
    
      @Override
    public String getColumnName(int column) {
        switch(column){
            case 0:
                return "No";
            case 1:
                return "Nama";
            case 2:
                return "Score";
            
            default:
                return null;
        }
       
    }
    
}
