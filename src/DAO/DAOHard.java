package DAO;

import Koneksi.KoneksiDB;
import Model.ModHard;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class DAOHard implements ImplementHard {
    
    Connection connection;
    
    final String check3="SELECT * FROM lvl_hard WHERE jawab_1=? and jawab_2=? and jawab_3=?";
    final String check5="SELECT * FROM lvl_hard WHERE jawab_1=? and jawab_2=? and jawab_3=? and jawab_4=? and jawab_5=?";
    final String check8="SELECT * FROM lvl_hard WHERE jawab_1=? and jawab_2=? and jawab_3=? and jawab_4=? and jawab_5=? and jawab_6=? and jawab_7=? and jawab_8=?";
    final String check9="SELECT * FROM lvl_hard WHERE jawab_1=? and jawab_2=? and jawab_3=? and jawab_4=? and jawab_5=? and jawab_6=? and jawab_7=? and jawab_8=? and jawab_9 =?";
    final String select="SELECT * FROM lvl_hard";

    public DAOHard() {
        this.connection = KoneksiDB.connection();
    }
    @Override
    public String check3(ModHard mh) {
        PreparedStatement statement= null;
        String Jawab1 = mh.getJawab_1();
        String Jawab2 = mh.getJawab_2();
        String Jawab3 = mh.getJawab_3();
        
        try {
            statement = connection.prepareStatement(check3);
            statement.setString(1,Jawab1);
            statement.setString(2,Jawab2);
            statement.setString(3,Jawab3);
            ResultSet rs;
            rs= statement.executeQuery();
                if(rs.next())
                {
                    String dbjawab1=rs.getString("jawab_1");
                    String dbjawab2=rs.getString("jawab_2");
                    String dbjawab3=rs.getString("jawab_3");
                     if(Jawab1.equalsIgnoreCase(dbjawab1) &&
                        Jawab2.equalsIgnoreCase(dbjawab2) &&
                        Jawab3.equalsIgnoreCase(dbjawab3)  
                       )
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
    public String check5(ModHard mh) {
        PreparedStatement statement= null;
        String Jawab1 = mh.getJawab_1();
        String Jawab2 = mh.getJawab_2();
        String Jawab3 = mh.getJawab_3();
        String Jawab4 = mh.getJawab_4();
        String Jawab5 = mh.getJawab_5();
        
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
                        Jawab5.equalsIgnoreCase(dbjawab5) 
                       )
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
    public String check8(ModHard mh) {
        PreparedStatement statement= null;
        String Jawab1 = mh.getJawab_1();
        String Jawab2 = mh.getJawab_2();
        String Jawab3 = mh.getJawab_3();
        String Jawab4 = mh.getJawab_4();
        String Jawab5 = mh.getJawab_5();
        String Jawab6 = mh.getJawab_6();
        String Jawab7 = mh.getJawab_7();
        String Jawab8 = mh.getJawab_8();
        
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
                        Jawab8.equalsIgnoreCase(dbjawab8)
                        )
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
    public String check9(ModHard mh) {
        PreparedStatement statement= null;
        String Jawab1 = mh.getJawab_1();
        String Jawab2 = mh.getJawab_2();
        String Jawab3 = mh.getJawab_3();
        String Jawab4 = mh.getJawab_4();
        String Jawab5 = mh.getJawab_5();
        String Jawab6 = mh.getJawab_6();
        String Jawab7 = mh.getJawab_7();
        String Jawab8 = mh.getJawab_8();
        String Jawab9 = mh.getJawab_9();
                
        try {
            statement = connection.prepareStatement(check9);
            statement.setString(1,Jawab1);
            statement.setString(2,Jawab2);
            statement.setString(3,Jawab3);
            statement.setString(4,Jawab4);
            statement.setString(5,Jawab5);
            statement.setString(6,Jawab6);
            statement.setString(7,Jawab7);
            statement.setString(8,Jawab8);
            statement.setString(9,Jawab9);
            
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
                    
                    
                     if(Jawab1.equalsIgnoreCase(dbjawab1) &&
                        Jawab2.equalsIgnoreCase(dbjawab2) &&
                        Jawab3.equalsIgnoreCase(dbjawab3) &&  
                        Jawab4.equalsIgnoreCase(dbjawab4) && 
                        Jawab5.equalsIgnoreCase(dbjawab5) && 
                        Jawab6.equalsIgnoreCase(dbjawab6) && 
                        Jawab7.equalsIgnoreCase(dbjawab7) && 
                        Jawab8.equalsIgnoreCase(dbjawab8) && 
                        Jawab9.equalsIgnoreCase(dbjawab9) 
                       )
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
    public List<ModHard> getAll() {
        List<ModHard> lmh = null;
        try {
            lmh = new ArrayList<ModHard>();
            Statement st = connection.createStatement();
            ResultSet rs = st.executeQuery(select);
            while(rs.next()){
                ModHard mh = new ModHard();
                mh.setNo(rs.getInt("no"));
                mh.setSoal(rs.getString("soal"));
                mh.setBentuk(rs.getString("bentuk"));
                mh.setJawab_1(rs.getString("jawab_1"));
                mh.setJawab_2(rs.getString("jawab_2"));
                mh.setJawab_3(rs.getString("jawab_3"));
                mh.setJawab_4(rs.getString("jawab_4"));
                mh.setJawab_5(rs.getString("jawab_5"));
                mh.setJawab_6(rs.getString("jawab_6"));
                mh.setJawab_7(rs.getString("jawab_7"));
                mh.setJawab_8(rs.getString("jawab_8"));
                mh.setJawab_9(rs.getString("jawab_9"));
                mh.setJawab_10(rs.getString("jawab_10"));
                lmh.add(mh);
            }
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
       return lmh;
    }
    
}
