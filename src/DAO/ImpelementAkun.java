/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import Model.ModAkun;
import java.util.List;

/**
 *
 * @author ASUS
 */
public interface ImpelementAkun {
    
    public void insert(ModAkun ma);
    public List<ModAkun>getAll();
    
}
