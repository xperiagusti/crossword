/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import Koneksi.KoneksiDB;
import Model.ModTTS;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author ASUS
 */
public class DAOTTS implements ImpelementTTS{

    
    Connection connection;
    
    
    final String select ="SELECT * FROM mytts";
    final String check= "SELECT * FROM mytts where Jawab1=? and Jawab2=? and Jawab3=? and Jawab4=? and Jawab5=? and Jawab6=?";
    final String check2= "SELECT * FROM mytts where Jawab1=? and Jawab2=? and Jawab3=? and Jawab4=?";
    
    public DAOTTS() 
    {
        connection = KoneksiDB.connection(); 
    }
    
    @Override
    public String check(ModTTS mb)
    {
       
           PreparedStatement statement = null;
            String jawab1= mb.getJawab1();
            String jawab2= mb.getJawab2();
            String jawab3= mb.getJawab3();
            String jawab4= mb.getJawab4();
            String jawab5= mb.getJawab5();
            String jawab6= mb.getJawab6();
            
        try {
           
            statement = connection.prepareStatement(check);
            statement.setString(1,jawab1);
            statement.setString(2,jawab2);
            statement.setString(3,jawab3);
            statement.setString(4,jawab4);
            statement.setString(5,jawab5);
            statement.setString(6,jawab6);
            ResultSet rs;
             rs= statement.executeQuery();
            if (rs.next())
            {
                String dbjawab1=rs.getString("Jawab1");
                String dbjawab2=rs.getString("Jawab2");
                String dbjawab3=rs.getString("Jawab3");
                String dbjawab4=rs.getString("Jawab4");
                String dbjawab5=rs.getString("Jawab5");
                String dbjawab6=rs.getString("Jawab6");
                
                if(jawab1.equalsIgnoreCase(dbjawab1) &&
                   jawab2.equalsIgnoreCase(dbjawab2) &&
                   jawab3.equalsIgnoreCase(dbjawab3) &&  
                   jawab4.equalsIgnoreCase(dbjawab4) && 
                   jawab5.equalsIgnoreCase(dbjawab5) && 
                   jawab6.equalsIgnoreCase(dbjawab6))
                {
                    return "A"; 
                }        
            }
         
        } 
        catch (SQLException ex) 
        {
            ex.printStackTrace();
        } 
       return "B";
    }
    
    @Override
    public String check2(ModTTS mb)
    {
         PreparedStatement statement = null;
         String jawab1= mb.getJawab1();
         String jawab2= mb.getJawab2();
         String jawab3= mb.getJawab3();
         String jawab4= mb.getJawab4();
            
        try 
        {
            statement = connection.prepareStatement(check2);
            statement.setString(1,jawab1);
            statement.setString(2,jawab2);
            statement.setString(3,jawab3);
            statement.setString(4,jawab4);
            ResultSet rs= statement.executeQuery();
            
            if (rs.next())
            {
               String dbjawab1=rs.getString("Jawab1");
               String dbjawab2=rs.getString("Jawab2");
               String dbjawab3=rs.getString("Jawab3");
               String dbjawab4=rs.getString("Jawab4");
                
                if(jawab1.equalsIgnoreCase(dbjawab1) &&
                   jawab2.equalsIgnoreCase(dbjawab2) &&
                   jawab3.equalsIgnoreCase(dbjawab3) &&
                   jawab4.equalsIgnoreCase(dbjawab4) ) 
                   
                {
                    return "A"; 
                }          
            }
          
        } 
        catch (SQLException ex) 
        {
            ex.printStackTrace();
        } 
       return "B";      
    }
    
    
    @Override
    public List<ModTTS> getAll() {
         List<ModTTS> lmb = null;
       
        try {
            lmb = new ArrayList<ModTTS>();
            Statement st = connection.createStatement();
            ResultSet rs = st.executeQuery(select);
            while(rs.next()){
                ModTTS mb = new ModTTS();
                mb.setNo(rs.getInt("No"));
                mb.setSoal(rs.getString("Soal"));
                mb.setBentuk(rs.getString("Bentuk"));
                mb.setJawab1(rs.getString("Jawab1"));
                mb.setJawab2(rs.getString("Jawab2"));
                mb.setJawab3(rs.getString("Jawab3"));
                mb.setJawab4(rs.getString("Jawab4"));
                mb.setJawab5(rs.getString("Jawab5"));
                mb.setJawab6(rs.getString("Jawab6"));
                lmb.add(mb);
            }
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
       return lmb;
    }
}
