/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Koneksi;

import com.mysql.jdbc.jdbc2.optional.MysqlDataSource;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author ASUS
 */
public class KoneksiDB {
    
    static Connection con;
    
    public static Connection connection(){
        
        if(con == null)
        {
            MysqlDataSource data = new  MysqlDataSource ();
            data.setDatabaseName("tts");
            data.setUser("root");
            data.setPassword("");
            try{
                con = data.getConnection();
            } catch(SQLException ex){
                Logger.getLogger(KoneksiDB.class.getName()).log(Level.SEVERE,null,ex);
            }
            
        }
        return con;
    }
    
    
    
}
