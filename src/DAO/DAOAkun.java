/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import Koneksi.KoneksiDB;
import Model.ModAkun;
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
public class DAOAkun implements ImpelementAkun {

     Connection connection;
    final String insert ="INSERT INTO akun (Nama,Poin) VALUES (?,?)";
    final String select ="SELECT * FROM akun";

    public DAOAkun() {
        connection = KoneksiDB.connection();
    }
    
    @Override
    public void insert(ModAkun ma) {
        PreparedStatement statement = null;
        
        try {
            statement = connection.prepareStatement(insert);
            statement.setString(1,ma.getNama());
            statement.setInt(2,10);
          
            statement.executeUpdate();
            ResultSet rs = statement.getGeneratedKeys();
            while (rs.next()){
                ma.setNo_akun(rs.getInt(1));
            }
            
        } catch (SQLException ex) {
            ex.printStackTrace();
        } finally {
            try{
                statement.close();
            }catch(SQLException ex){
                ex.printStackTrace();
            } 
        }
        
    }

    @Override
    public List<ModAkun> getAll() {
        List<ModAkun> lma = null;
       
        try {
            lma = new ArrayList<ModAkun>();
            Statement st = connection.createStatement();
            ResultSet rs = st.executeQuery(select);
            while(rs.next()){
                ModAkun ma = new ModAkun();
                ma.setNo_akun(rs.getInt("No_akun"));
                ma.setNama(rs.getString("Nama"));
                ma.setPoin(rs.getInt("Poin"));
 
                lma.add(ma);
            }
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
       return lma;
    }

    
}
