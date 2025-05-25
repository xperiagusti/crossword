package Controller;

import DAO.DAOHard;
import DAO.ImplementHard;
import Model.ModHard;
import Model.ModTblHard;
import View.Level_Hard;
import java.util.List;
import javax.swing.JOptionPane;

public class ControllerHard {
    Level_Hard frame;
    ImplementHard implhard;
    List <ModHard> lmh;

    public ControllerHard(Level_Hard frame) {
        this.frame = frame;
        implhard = new DAOHard();
        lmh = implhard.getAll();
    }
    public void check_jawab()
    {
        boolean Jawab1 = frame.getHard1_1().getText().trim().isEmpty();
        ulang:
        if(!Jawab1 & !Jawab1)
            {
               ModHard mh = new   ModHard();
               ModHard mh2 = new  ModHard();
               ModHard mh3 = new  ModHard();
               ModHard mh4 = new  ModHard();
               ModHard mh5 = new  ModHard();
                             
               ///Ambil Inputan Text Field Untuk No 1
               mh.setJawab_1(frame.getHard1_1().getText());
               mh.setJawab_2(frame.getHard1_2().getText());
               mh.setJawab_3(frame.getHard1_3().getText());
               mh.setJawab_4(frame.getHard1_4().getText());
               mh.setJawab_5(frame.getHard1_5().getText());
               mh.setJawab_6(frame.getHard1_6().getText());
               mh.setJawab_7(frame.getHard1_7().getText());
               mh.setJawab_8(frame.getHard2_1().getText());
                              
               
               ///Amhil Inputan Text Field Untuk No 2
               mh2.setJawab_1(frame.getHard2_1().getText());
               mh2.setJawab_2(frame.getHard2_2().getText());
               mh2.setJawab_3(frame.getHard2_3().getText());
               mh2.setJawab_4(frame.getHard2_4().getText());
               mh2.setJawab_5(frame.getHard3_1().getText());
               
               
               ///Amhil Inputan Text Field Untuk No 3
               mh3.setJawab_1(frame.getHard3_1().getText());
               mh3.setJawab_2(frame.getHard3_2().getText());
               mh3.setJawab_3(frame.getHard3_3().getText());
               mh3.setJawab_4(frame.getHard3_4().getText());
               mh3.setJawab_5(frame.getHard3_5().getText());
               mh3.setJawab_6(frame.getHard3_6().getText());
               mh3.setJawab_7(frame.getHard3_7().getText());
               mh3.setJawab_8(frame.getHard3_8().getText());
               mh3.setJawab_9(frame.getHard5_1().getText());
               
               ///Ambil Inputan Text Field Untuk No 4
               mh4.setJawab_1(frame.getHard4_1().getText());
               mh4.setJawab_2(frame.getHard4_2().getText());
               mh4.setJawab_3(frame.getHard3_6().getText());
               mh4.setJawab_4(frame.getHard4_3().getText());
               mh4.setJawab_5(frame.getHard4_4().getText());
               
               ///Ambil Inputan Text Field Untuk No 5
               mh5.setJawab_1(frame.getHard5_1().getText());
               mh5.setJawab_2(frame.getHard5_2().getText());
               mh5.setJawab_3(frame.getHard5_3().getText());
                         
               
               String Jawaban1= implhard.check8(mh);
               String Jawaban2= implhard.check5(mh2);
               String Jawaban3= implhard.check9(mh3);
               String Jawaban4= implhard.check5(mh4);
               String Jawaban5= implhard.check3(mh5);
               
               
               if(Jawaban1.equals("A") && 
                  Jawaban2.equals("A") && 
                  Jawaban3.equals("A") && 
                  Jawaban4.equals("A") && 
                  Jawaban5.equals("A") 
                 )
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
        lmh =  implhard.getAll();
        ModTblHard mth = new ModTblHard(lmh);
        frame.getTbl_hard().setModel(mth);
     }
    public void Bantuan (int row)
    {
        if(row==0) //Isi field soal no 1 
        {
        frame.getHard1_1().setText(String.valueOf(lmh.get(row).getJawab_1()));
        frame.getHard1_4().setText(String.valueOf(lmh.get(row).getJawab_4()));
        frame.getHard1_6().setText(String.valueOf(lmh.get(row).getJawab_6()));
        frame.getHard1_7().setText(String.valueOf(lmh.get(row).getJawab_7()));
        }
        else if(row==1) //Isi field soal no 2
        {
        frame.getHard2_3().setText(String.valueOf(lmh.get(row).getJawab_3()));
        frame.getHard2_4().setText(String.valueOf(lmh.get(row).getJawab_4()));
        
        }
        else if(row==2) //Isi field soal no 1 
        {
        frame.getHard3_3().setText(String.valueOf(lmh.get(row).getJawab_3()));
        frame.getHard3_6().setText(String.valueOf(lmh.get(row).getJawab_6()));
        frame.getHard3_7().setText(String.valueOf(lmh.get(row).getJawab_7()));
        }
        else if(row==3) //Isi field soal no 1 
        {
        frame.getHard4_3().setText(String.valueOf(lmh.get(row).getJawab_4()));
        frame.getHard4_1().setText(String.valueOf(lmh.get(row).getJawab_1()));
        }
        if(row==4) //Isi field soal no 1 
        {
         JOptionPane.showMessageDialog(null, "Tidak Ada Clue Untuk Jawaban ini Eaaaa");
        }
    }
    public void reset()
    {
      frame.getHard1_1().setText("");
      frame.getHard1_2().setText("");
      frame.getHard1_3().setText("");
      frame.getHard1_4().setText("");
      frame.getHard1_5().setText("");
      frame.getHard1_6().setText("");
      frame.getHard1_7().setText("");
      
      frame.getHard2_1().setText("");
      frame.getHard2_2().setText("");
      frame.getHard2_3().setText("");
      frame.getHard2_4().setText("");
      
      frame.getHard3_1().setText("");
      frame.getHard3_2().setText("");
      frame.getHard3_3().setText("");
      frame.getHard3_4().setText("");
      frame.getHard3_5().setText("");
      frame.getHard3_6().setText("");
      frame.getHard3_7().setText("");
      frame.getHard3_8().setText("");
      
      frame.getHard4_1().setText("");
      frame.getHard4_2().setText("");
      frame.getHard4_3().setText("");
      frame.getHard4_4().setText("");
      
      frame.getHard5_1().setText("");
      frame.getHard5_2().setText("");
      frame.getHard5_3().setText("");
    }
    
}
