/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import Model.ModHard;
import java.util.List;

/**
 *
 * @author user
 */
public interface ImplementHard {
    public String check3(ModHard mh);
    public String check5(ModHard mh);
    public String check8(ModHard mh);
    public String check9(ModHard mh);
    public List<ModHard> getAll();
}
