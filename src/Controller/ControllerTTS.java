/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import DAO.DAOTTS;
import DAO.ImpelementTTS;
import Model.ModTTS;
import Model.ModTabelTTS;
import View.Level_Easy;
import java.util.List;
import javax.swing.JOptionPane;

/**
 *
 * @author ASUS
 */
public class ControllerTTS {
    
    Level_Easy frame;
    ImpelementTTS implTTS;
    List <ModTTS> lmb;
    
    public ControllerTTS(Level_Easy frame) 
    {
        this.frame = frame;
        implTTS = new DAOTTS();
        lmb = implTTS.getAll(); 
    }
    
    public void check_jawab ()
    {
        boolean Jawab1 = frame.getJwb1_1().getText().trim().isEmpty();
         ulang:
         if(!Jawab1 & !Jawab1)
            {
               ModTTS mb = new   ModTTS();
               ModTTS mb2 = new  ModTTS();
               ModTTS mb3 = new  ModTTS();
               ///Ambil Inputan Text Field Untuk No 1
               mb.setJawab1(frame.getJwb1_1().getText());
               mb.setJawab2(frame.getJwb1_2().getText());
               mb.setJawab3(frame.getJwb1_3().getText());
               mb.setJawab4(frame.getJwb1_4().getText());
               mb.setJawab5(frame.getJwb1_5().getText());
               mb.setJawab6(frame.getJwb1_6().getText());
               
               ///Ambil Inputan Text Field Untuk No 2
               mb2.setJawab1(frame.getJwb2_1().getText());
               mb2.setJawab2(frame.getJwb2_2().getText());
               mb2.setJawab3(frame.getJwb1_5().getText());
               mb2.setJawab4(frame.getJwb2_4().getText());
               
               ///Ambil Inputan Text Field Untuk No 3
               mb3.setJawab1(frame.getJwb3_1().getText());
               mb3.setJawab2(frame.getJwb1_2().getText());
               mb3.setJawab3(frame.getJwb3_3().getText());
               mb3.setJawab4(frame.getJwb3_4().getText());
               mb3.setJawab5(frame.getJwb3_5().getText());
               mb3.setJawab6(frame.getJwb3_6().getText());  
                  
               String Jawaban1= implTTS.check(mb);
               String Jawaban2= implTTS.check2(mb2);
               String Jawaban3= implTTS.check(mb3);
               if(Jawaban1.equals("A") && Jawaban2.equals("A")&& Jawaban3.equals("A") )
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
        lmb =  implTTS.getAll();
        ModTabelTTS mtb = new ModTabelTTS (lmb);
        frame.getTbl_Soal().setModel(mtb);
     }
    

     public void Bantuan (int row)
    {
         if(row==0) //Isi field soal no 1 
         {
        frame.getJwb1_1().setText(String.valueOf(lmb.get(row).getJawab1()));
        //frame.getJwb1_2().setText(String.valueOf(lmb.get(row).getJawab2()));
        frame.getJwb1_3().setText(String.valueOf(lmb.get(row).getJawab3()));
        frame.getJwb1_4().setText(String.valueOf(lmb.get(row).getJawab4()));
        //frame.getJwb1_5().setText(String.valueOf(lmb.get(row).getJawab5()));
        frame.getJwb1_6().setText(String.valueOf(lmb.get(row).getJawab6()));
         }
         
         else if(row==1) //Isi field soal no 2 
         {
        frame.getJwb2_1().setText(String.valueOf(lmb.get(row).getJawab1()));
        frame.getJwb2_2().setText(String.valueOf(lmb.get(row).getJawab2()));
        //frame.getJwb1_5().setText(String.valueOf(lmb.get(row).getJawab3()));
        frame.getJwb2_4().setText(String.valueOf(lmb.get(row).getJawab4()));  
         }
         
         else //Isi field soal no 3 
         {
        frame.getJwb3_1().setText(String.valueOf(lmb.get(row).getJawab1()));
        //frame.getJwb1_2().setText(String.valueOf(lmb.get(row).getJawab2()));
        frame.getJwb3_3().setText(String.valueOf(lmb.get(row).getJawab3()));
        frame.getJwb3_4().setText(String.valueOf(lmb.get(row).getJawab4()));
        //frame.getJwb3_5().setText(String.valueOf(lmb.get(row).getJawab5()));
        frame.getJwb3_6().setText(String.valueOf(lmb.get(row).getJawab6())); 
         }
       
    }
     
    public void reset()
    {
      frame.getJwb1_1().setText("");
      frame.getJwb1_2().setText("");
      frame.getJwb1_3().setText("");
      frame.getJwb1_4().setText("");
      frame.getJwb1_5().setText("");
      frame.getJwb1_6().setText("");
      frame.getJwb2_1().setText("");
      frame.getJwb2_2().setText("");
      frame.getJwb2_4().setText("");
      frame.getJwb3_1().setText("");
      frame.getJwb3_3().setText("");
      frame.getJwb3_4().setText("");
      frame.getJwb3_5().setText("");
      frame.getJwb3_6().setText("");  
    }
     
     
}
