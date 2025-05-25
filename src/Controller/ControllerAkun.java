/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import DAO.DAOAkun;
import DAO.ImpelementAkun;
import Model.ModAkun;
import Model.ModTabelAkun;
import View.FormInput;
import View.Leaderboard;
import View.Level_Easy;
import java.util.List;
import javax.swing.JOptionPane;

/**
 *
 * @author ASUS
 */
public class ControllerAkun {
    FormInput frame;
     Leaderboard frame2;
     Level_Easy frame3;
    ImpelementAkun implAkun;
    List <ModAkun> lma;

    public ControllerAkun(Leaderboard frame) 
    {
        this.frame2 = frame;
        implAkun = new DAOAkun();
        lma = implAkun.getAll();
    }
    
     public ControllerAkun(FormInput frame) 
    {
        this.frame = frame;
        implAkun = new DAOAkun();
        lma = implAkun.getAll();
    }
     
    
    public void isiTable ()
    {
        lma = implAkun.getAll();
        ModTabelAkun mta = new ModTabelAkun (lma);
        frame2.getTbl_Skor().setModel(mta);
    }
    
    public void insert ()
    {
        if(!frame.getTf_nama().getText().trim().isEmpty()& !frame.getTf_nama().getText().trim().isEmpty()){
            ModAkun mb = new ModAkun();
            mb.setNama(frame.getTf_nama().getText());
            implAkun.insert(mb);
            JOptionPane.showMessageDialog(null,"User Saved");   
        }
        else
        {
             JOptionPane.showMessageDialog(null,"User Unsaved");
        }
    }
    
    
    public void Nama ()
    { 
        frame.getJl_user().setText (frame.getTf_nama().getText());
    }
}
    
    

