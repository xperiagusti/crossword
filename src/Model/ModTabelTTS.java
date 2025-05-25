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
public class ModTabelTTS extends AbstractTableModel {

    
    List<ModTTS> lmb;

    public ModTabelTTS(List<ModTTS> lmb) {
        this.lmb = lmb;
    }
    @Override
    public int getRowCount() {
         return lmb.size();
    }

    @Override
    public int getColumnCount() {
       return 3;
    }

    @Override
    public Object getValueAt(int row, int column) {
        switch(column){
            case 0:
                return lmb.get(row).getNo();
            case 1:
                return lmb.get(row).getSoal();
            case 2:
                return lmb.get(row).getBentuk();
           
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
                return "Petunjuk";
            case 2:
                return "Jenis";
            
            default:
                return null;
        }
       
    }
    
    
}
