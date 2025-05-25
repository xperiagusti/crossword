/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import Model.ModTTS;
import java.util.List;

/**
 *
 * @author ASUS
 */
public interface ImpelementTTS {
    public String check(ModTTS mb);
    public String check2(ModTTS mb);
    public List<ModTTS> getAll();
    
}
