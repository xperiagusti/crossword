/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import Koneksi.KoneksiDB;
import Model.ModMedium;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author user
 */
public class DAOMed implements ImplementMed{
    Connection connection;
    
    final String select="SELECT * FROM lvl_medium";
    final String check="SELECT * FROM lvl_medium where jawab_1=? and jawab_2=? and jawab_3=? and jawab_4=? and jawab_5=? and jawab_6=? and jawab_7=? and jawab_8=? and jawab_9=? and jawab_10=?";
    final String check5="SELECT * FROM lvl_medium where jawab_1=? and jawab_2=? and jawab_3=? and jawab_4=? and jawab_5=?";
    final String check6="SELECT * FROM lvl_medium where jawab_1=? and jawab_2=? and jawab_3=? and jawab_4=? and jawab_5=? and jawab_6=?";
    final String check8="SELECT * FROM lvl_medium where jawab_1=? and jawab_2=? and jawab_3=? and jawab_4=? and jawab_5=? and jawab_6=? and jawab_7=? and jawab_8=?";
    
    
    public DAOMed() {
        connection = KoneksiDB.connection();
    }
    @Override
    public String check(ModMedium mm) {
        PreparedStatement statement= null;
        String Jawab1 = mm.getJawab_1();
        String Jawab2 = mm.getJawab_2();
        String Jawab3 = mm.getJawab_3();
        String Jawab4 = mm.getJawab_4();
        String Jawab5 = mm.getJawab_5();
        String Jawab6 = mm.getJawab_6();
        String Jawab7 = mm.getJawab_7();
        String Jawab8 = mm.getJawab_8();
        String Jawab9 = mm.getJawab_9();
        String Jawab10 = mm.getJawab_10();
        
        try {
            statement = connection.prepareStatement(check);
            statement.setString(1,Jawab1);
            statement.setString(2,Jawab2);
            statement.setString(3,Jawab3);
            statement.setString(4,Jawab4);
            statement.setString(5,Jawab5);
            statement.setString(6,Jawab6);
            statement.setString(7,Jawab7);
            statement.setString(8,Jawab8);
            statement.setString(9,Jawab9);
            statement.setString(10,Jawab10);
            ResultSet rs;
            rs= statement.executeQuery();
                if(rs.next())
                {
                    String dbjawab1=rs.getString("jawab_1");
                    String dbjawab2=rs.getString("jawab_2");
                    String dbjawab3=rs.getString("jawab_3");
                    String dbjawab4=rs.getString("jawab_4");
                    String dbjawab5=rs.getString("jawab_5");
                    String dbjawab6=rs.getString("jawab_6");
                    String dbjawab7=rs.getString("jawab_7");
                    String dbjawab8=rs.getString("jawab_8");
                    String dbjawab9=rs.getString("jawab_9");
                    String dbjawab10=rs.getString("jawab_10");
                    
                     if(Jawab1.equalsIgnoreCase(dbjawab1) &&
                        Jawab2.equalsIgnoreCase(dbjawab2) &&
                        Jawab3.equalsIgnoreCase(dbjawab3) &&  
                        Jawab4.equalsIgnoreCase(dbjawab4) && 
                        Jawab5.equalsIgnoreCase(dbjawab5) && 
                        Jawab6.equalsIgnoreCase(dbjawab6) && 
                        Jawab7.equalsIgnoreCase(dbjawab7) && 
                        Jawab8.equalsIgnoreCase(dbjawab8) && 
                        Jawab9.equalsIgnoreCase(dbjawab9) && 
                        Jawab10.equalsIgnoreCase(dbjawab10))
                     {
                         return "A"; 
                     }        
                }
            }
         catch (SQLException ex) {
            ex.printStackTrace();
        }
        return "B";
    }
    @Override
    public List<ModMedium> getAll() {
        List<ModMedium> lmm = null;
        try {
            lmm = new ArrayList<ModMedium>();
            Statement st = connection.createStatement();
            ResultSet rs = st.executeQuery(select);
            while(rs.next()){
                ModMedium mm = new ModMedium();
                mm.setNo(rs.getInt("no"));
                mm.setSoal(rs.getString("soal"));
                mm.setBentuk(rs.getString("bentuk"));
                mm.setJawab_1(rs.getString("jawab_1"));
                mm.setJawab_2(rs.getString("jawab_2"));
                mm.setJawab_3(rs.getString("jawab_3"));
                mm.setJawab_4(rs.getString("jawab_4"));
                mm.setJawab_5(rs.getString("jawab_5"));
                mm.setJawab_6(rs.getString("jawab_6"));
                mm.setJawab_7(rs.getString("jawab_7"));
                mm.setJawab_8(rs.getString("jawab_8"));
                mm.setJawab_9(rs.getString("jawab_9"));
                mm.setJawab_10(rs.getString("jawab_10"));
                lmm.add(mm);
            }
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
       return lmm;
    }    
    ///check 5
    @Override
    public String check5(ModMedium mm) {
        PreparedStatement statement= null;
        String Jawab1 = mm.getJawab_1();
        String Jawab2 = mm.getJawab_2();
        String Jawab3 = mm.getJawab_3();
        String Jawab4 = mm.getJawab_4();
        String Jawab5 = mm.getJawab_5();
        try {
            statement = connection.prepareStatement(check5);
            statement.setString(1,Jawab1);
            statement.setString(2,Jawab2);
            statement.setString(3,Jawab3);
            statement.setString(4,Jawab4);
            statement.setString(5,Jawab5);
            ResultSet rs;
             rs= statement.executeQuery();
                if(rs.next())
                {
                    String dbjawab1=rs.getString("jawab_1");
                    String dbjawab2=rs.getString("jawab_2");
                    String dbjawab3=rs.getString("jawab_3");
                    String dbjawab4=rs.getString("jawab_4");
                    String dbjawab5=rs.getString("jawab_5");
                    if(Jawab1.equalsIgnoreCase(dbjawab1) &&
                        Jawab2.equalsIgnoreCase(dbjawab2) &&
                        Jawab3.equalsIgnoreCase(dbjawab3) &&  
                        Jawab4.equalsIgnoreCase(dbjawab4) && 
                        Jawab5.equalsIgnoreCase(dbjawab5))
                    {
                        return "A"; 
                    }
                }
                }
         catch (SQLException ex) {
            ex.printStackTrace();
            }
            return "B";
    }
    ///check 6
    @Override
    public String check6(ModMedium mm) {
        PreparedStatement statement= null;
        String Jawab1 = mm.getJawab_1();
        String Jawab2 = mm.getJawab_2();
        String Jawab3 = mm.getJawab_3();
        String Jawab4 = mm.getJawab_4();
        String Jawab5 = mm.getJawab_5();
        String Jawab6 = mm.getJawab_6();
        try {
            statement = connection.prepareStatement(check6);
            statement.setString(1,Jawab1);
            statement.setString(2,Jawab2);
            statement.setString(3,Jawab3);
            statement.setString(4,Jawab4);
            statement.setString(5,Jawab5);
            statement.setString(6,Jawab6);
            ResultSet rs;
             rs= statement.executeQuery();
                if(rs.next())
                {
                    String dbjawab1=rs.getString("jawab_1");
                    String dbjawab2=rs.getString("jawab_2");
                    String dbjawab3=rs.getString("jawab_3");
                    String dbjawab4=rs.getString("jawab_4");
                    String dbjawab5=rs.getString("jawab_5");
                    String dbjawab6=rs.getString("jawab_6");
                    if(Jawab1.equalsIgnoreCase(dbjawab1) &&
                        Jawab2.equalsIgnoreCase(dbjawab2) &&
                        Jawab3.equalsIgnoreCase(dbjawab3) &&  
                        Jawab4.equalsIgnoreCase(dbjawab4) && 
                        Jawab5.equalsIgnoreCase(dbjawab5) &&
                        Jawab6.equalsIgnoreCase(dbjawab6)    )
                    {
                        return "A"; 
                    }
                }
                }
         catch (SQLException ex) {
            ex.printStackTrace();
            }
            return "B";
    }

    @Override
    public String check8(ModMedium mm) {
        PreparedStatement statement= null;
        String Jawab1 = mm.getJawab_1();
        String Jawab2 = mm.getJawab_2();
        String Jawab3 = mm.getJawab_3();
        String Jawab4 = mm.getJawab_4();
        String Jawab5 = mm.getJawab_5();
        String Jawab6 = mm.getJawab_6();
        String Jawab7 = mm.getJawab_7();
        String Jawab8 = mm.getJawab_8();
        try {
            statement = connection.prepareStatement(check8);
            statement.setString(1,Jawab1);
            statement.setString(2,Jawab2);
            statement.setString(3,Jawab3);
            statement.setString(4,Jawab4);
            statement.setString(5,Jawab5);
            statement.setString(6,Jawab6);
            statement.setString(7,Jawab7);
            statement.setString(8,Jawab8);
            ResultSet rs;
             rs= statement.executeQuery();
                if(rs.next())
                {
                    String dbjawab1=rs.getString("jawab_1");
                    String dbjawab2=rs.getString("jawab_2");
                    String dbjawab3=rs.getString("jawab_3");
                    String dbjawab4=rs.getString("jawab_4");
                    String dbjawab5=rs.getString("jawab_5");
                    String dbjawab6=rs.getString("jawab_6");
                    String dbjawab7=rs.getString("jawab_7");
                    String dbjawab8=rs.getString("jawab_8");
                    if(Jawab1.equalsIgnoreCase(dbjawab1) &&
                        Jawab2.equalsIgnoreCase(dbjawab2) &&
                        Jawab3.equalsIgnoreCase(dbjawab3) &&  
                        Jawab4.equalsIgnoreCase(dbjawab4) && 
                        Jawab5.equalsIgnoreCase(dbjawab5) &&
                        Jawab6.equalsIgnoreCase(dbjawab6) &&
                        Jawab7.equalsIgnoreCase(dbjawab7) &&
                        Jawab8.equalsIgnoreCase(dbjawab8))
                    {
                        return "A"; 
                    }
                }
                }
         catch (SQLException ex) {
            ex.printStackTrace();
            }
            return "B";
    }
}
