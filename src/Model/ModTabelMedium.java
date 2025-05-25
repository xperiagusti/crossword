package Model;

import java.util.List;
import javax.swing.table.AbstractTableModel;

public class ModTabelMedium extends AbstractTableModel{

    List<ModMedium> lmm;

    public ModTabelMedium(List<ModMedium> lmm) {
        this.lmm = lmm;
    }
    @Override
    public int getRowCount() {
         return lmm.size();
    }

    @Override
    public int getColumnCount() {
       return 3;
    }

    @Override
    public Object getValueAt(int row, int column) {
        switch(column){
            case 0:
                return lmm.get(row).getNo();
            case 1:
                return lmm.get(row).getSoal();
            case 2:
                return lmm.get(row).getBentuk();
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
