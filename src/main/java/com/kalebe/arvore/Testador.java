/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.kalebe.arvore;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author kaleb
 */
public class Testador {

    private List<String> vasos = new ArrayList<>();
    private Regra regra;
    
    
    public void guarda(Vaso vaso_menor, Vaso vaso_maior) 
    {
        this.vasos.add("(" + vaso_menor.getVolume().toString()+ "," 
                    + vaso_maior.getVolume().toString() + ")");
    }

    private Boolean valida_vaso(Vaso vaso_menor, Vaso vaso_maior) 
    {
        for (int i = 0; i < this.vasos.size(); i++) {
            if (("("+ vaso_menor.getVolume().toString() + "," + 
                      vaso_maior.getVolume().toString() + ")") == this.vasos.get(i)) {
                
                return true;
            }
        }
        return false;
    }
    
    public void construir_(Vaso vaso_menor, Vaso vaso_maior)
    {
        if(vasos.get(0) == null) {vasos.add("(0,0)");}
        
        if(vaso_menor.getVolume() == 0 && vaso_maior.getVolume() == 0)
        {
            if(valida_vaso(vaso_menor, vaso_maior) == false )
            {
                guarda(vaso_menor, vaso_maior);
            }
        }
        if(vaso_menor.getVolume() == 0)
        {
           regra.esvaziaVaso(vaso_menor);
            System.out.println(vaso_menor.getVolume());
        }
        
        
    }

    public Regra getRegra() {
        return regra;
    }

    public void setRegra(Regra regra) {
        this.regra = regra;
    }

    public List<String> getVasos() {
        return vasos;
    }
     
    
}
