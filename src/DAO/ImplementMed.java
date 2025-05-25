/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import Model.ModMedium;
import java.util.List;

/**
 *
 * @author user
 */
public interface ImplementMed {
    public String check(ModMedium mm);
    public String check5(ModMedium mm);
    public String check6(ModMedium mm);
    public String check8(ModMedium mm);
    public List<ModMedium> getAll();
}
