package Controller;

import DAO.DAOMed;
import DAO.ImplementMed;
import Model.ModMedium;
import Model.ModTabelMedium;
import View.Level_Medium;
import java.util.List;
import javax.swing.JOptionPane;

public class ControllerMed {
    Level_Medium frame;
    ImplementMed implmed;
    List <ModMedium> lmm;

    public ControllerMed(Level_Medium frame) {
        this.frame = frame;
        implmed = new DAOMed();
        lmm = implmed.getAll();
    }
    public void check_jawab()
    {
        boolean Jawab1 = frame.getMed1_1().getText().trim().isEmpty();
        ulang:
        if(!Jawab1 & !Jawab1)
            {
               ModMedium mm = new   ModMedium();
               ModMedium mm2 = new  ModMedium();
               ModMedium mm3 = new  ModMedium();
               ModMedium mm4 = new   ModMedium();
               ModMedium mm5 = new  ModMedium();
               ModMedium mm6 = new  ModMedium();
               ModMedium mm7 = new  ModMedium();
               
               ///Ammil Inputan Text Field Untuk No 1
               mm.setJawab_1(frame.getMed1_1().getText());
               mm.setJawab_2(frame.getMed1_2().getText());
               mm.setJawab_3(frame.getMed1_3().getText());
               mm.setJawab_4(frame.getMed1_4().getText());
               mm.setJawab_5(frame.getMed1_5().getText());
               mm.setJawab_6(frame.getMed1_6().getText());
               mm.setJawab_7(frame.getMed1_7().getText());
               mm.setJawab_8(frame.getMed1_8().getText());
               mm.setJawab_9(frame.getMed1_9().getText());
               mm.setJawab_10(frame.getMed1_10().getText());
               
               
               ///Ammil Inputan Text Field Untuk No 2
               mm2.setJawab_1(frame.getMed2_1().getText());
               mm2.setJawab_2(frame.getMed1_2().getText());
               mm2.setJawab_3(frame.getMed2_2().getText());
               mm2.setJawab_4(frame.getMed2_3().getText());
               mm2.setJawab_5(frame.getMed3_1().getText());
               
               
               ///Ammil Inputan Text Field Untuk No 3
               mm3.setJawab_1(frame.getMed3_1().getText());
               mm3.setJawab_2(frame.getMed3_2().getText());
               mm3.setJawab_3(frame.getMed3_3().getText());
               mm3.setJawab_4(frame.getMed3_4().getText());
               mm3.setJawab_5(frame.getMed3_5().getText());
               
               ///Ambil Inputan Text Field Untuk No 4
               mm4.setJawab_1(frame.getMed1_10().getText());
               mm4.setJawab_2(frame.getMed4_1().getText());
               mm4.setJawab_3(frame.getMed4_2().getText());
               mm4.setJawab_4(frame.getMed4_3().getText());
               mm4.setJawab_5(frame.getMed4_4().getText());
               
               ///Ambil Inputan Text Field Untuk No 5
               mm5.setJawab_1(frame.getMed5_1().getText());
               mm5.setJawab_2(frame.getMed4_1().getText());
               mm5.setJawab_3(frame.getMed5_2().getText());
               mm5.setJawab_4(frame.getMed5_3().getText());
               mm5.setJawab_5(frame.getMed5_4().getText());
               
               ///Ambil Inputan Text Field Untuk No 6
               mm6.setJawab_1(frame.getMed5_2().getText());
               mm6.setJawab_2(frame.getMed6_1().getText());
               mm6.setJawab_3(frame.getMed6_2().getText());
               mm6.setJawab_4(frame.getMed6_3().getText());
               mm6.setJawab_5(frame.getMed6_4().getText());
               mm6.setJawab_6(frame.getMed6_5().getText());
               
               ///Ambil Inputan Text Field Untuk No 7
               mm7.setJawab_1(frame.getMed7_1().getText());
               mm7.setJawab_2(frame.getMed4_3().getText());
               mm7.setJawab_3(frame.getMed6_2().getText());
               mm7.setJawab_4(frame.getMed7_2().getText());
               mm7.setJawab_5(frame.getMed7_3().getText());
               mm7.setJawab_6(frame.getMed7_4().getText());
               mm7.setJawab_7(frame.getMed7_5().getText());
               mm7.setJawab_8(frame.getMed7_6().getText());
               
               
               String Jawaban1= implmed.check(mm);
               String Jawaban2= implmed.check5(mm2);
               String Jawaban3= implmed.check5(mm3);
               String Jawaban4= implmed.check5(mm4);
               String Jawaban5= implmed.check5(mm5);
               String Jawaban6= implmed.check6(mm6);
               String Jawaban7= implmed.check8(mm7);
               
               if(Jawaban1.equals("A") && 
                  Jawaban2.equals("A") && 
                  Jawaban3.equals("A") && 
                  Jawaban4.equals("A") && 
                  Jawaban5.equals("A") && 
                  Jawaban6.equals("A") && 
                  Jawaban7.equals("A"))
               {
                   JOptionPane.showMessageDialog(null,"SUCCESS"+"\n+10 POIN"); 
               }
               else
                {
                    JOptionPane.showMessageDialog(null,"WRONG ANSWER");
                    
                }
            }
         else
            {
                JOptionPane.showMessageDialog(null,"UNFINISHED"); 
            } 
    }
    public void isiTable ()
     {
        lmm =  implmed.getAll();
        ModTabelMedium mtm = new ModTabelMedium(lmm);
        frame.getTbl_medium().setModel(mtm);
     }
    public void Bantuan (int row)
    {
         if(row==0) //Isi field soal no 1 
         {
        frame.getMed1_1().setText(String.valueOf(lmm.get(row).getJawab_1()));
        frame.getMed1_4().setText(String.valueOf(lmm.get(row).getJawab_4()));
        frame.getMed1_6().setText(String.valueOf(lmm.get(row).getJawab_6()));
        frame.getMed1_8().setText(String.valueOf(lmm.get(row).getJawab_8()));
        frame.getMed1_10().setText(String.valueOf(lmm.get(row).getJawab_10()));
         }
         
         else if(row==1) //Isi field soal no 2 
         {
        frame.getMed2_3().setText(String.valueOf(lmm.get(row).getJawab_4()));
        frame.getMed2_2().setText(String.valueOf(lmm.get(row).getJawab_3()));
         }
         
         else if(row == 2)//Isi field soal no 3 
         {
        frame.getMed3_5().setText(String.valueOf(lmm.get(row).getJawab_5()));
        frame.getMed3_3().setText(String.valueOf(lmm.get(row).getJawab_3()));
         }
         else if(row == 3)//Isi field soal no 3 
         {
        frame.getMed4_2().setText(String.valueOf(lmm.get(row).getJawab_3()));
        frame.getMed4_3().setText(String.valueOf(lmm.get(row).getJawab_4()));
         }
         else if(row == 4)//Isi field soal no 3 
         {
        frame.getMed5_1().setText(String.valueOf(lmm.get(row).getJawab_1()));
        frame.getMed5_4().setText(String.valueOf(lmm.get(row).getJawab_5()));
         }
         else if(row == 5)//Isi field soal no 3 
         {
        frame.getMed6_1().setText(String.valueOf(lmm.get(row).getJawab_2()));
        frame.getMed6_4().setText(String.valueOf(lmm.get(row).getJawab_5()));
         }
         else if(row == 6)//Isi field soal no 3 
         {
        frame.getMed7_1().setText(String.valueOf(lmm.get(row).getJawab_1()));
        frame.getMed7_2().setText(String.valueOf(lmm.get(row).getJawab_4()));
        frame.getMed7_5().setText(String.valueOf(lmm.get(row).getJawab_7()));
         }
    }
    public void reset()
    {
      frame.getMed1_1().setText("");
      frame.getMed1_2().setText("");
      frame.getMed1_3().setText("");
      frame.getMed1_4().setText("");
      frame.getMed1_5().setText("");
      frame.getMed1_6().setText("");
      frame.getMed1_7().setText("");
      frame.getMed1_8().setText("");
      frame.getMed1_9().setText("");
      frame.getMed1_10().setText("");
     
      frame.getMed2_1().setText("");
      frame.getMed2_2().setText("");
      frame.getMed2_3().setText("");
      
      frame.getMed3_1().setText("");
      frame.getMed3_2().setText("");
      frame.getMed3_3().setText("");
      frame.getMed3_4().setText("");
      frame.getMed3_5().setText("");
      
      frame.getMed4_1().setText("");
      frame.getMed4_2().setText("");
      frame.getMed4_3().setText("");
      frame.getMed4_4().setText("");
      
      frame.getMed5_1().setText("");
      frame.getMed5_2().setText("");
      frame.getMed5_3().setText("");
      frame.getMed5_4().setText("");
      
      frame.getMed6_1().setText("");
      frame.getMed6_2().setText("");
      frame.getMed6_3().setText("");
      frame.getMed6_4().setText("");
      frame.getMed6_5().setText("");
      
      frame.getMed7_1().setText("");
      frame.getMed7_2().setText("");
      frame.getMed7_3().setText("");
      frame.getMed7_4().setText("");
      frame.getMed7_5().setText("");
      frame.getMed7_6().setText("");
    }
}
     