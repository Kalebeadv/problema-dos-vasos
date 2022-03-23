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

    private Vaso vaso_menor;
    private Vaso vaso_maior;
    private List<String> vasos = new ArrayList<>();

    public Testador(Vaso vaso_menor, Vaso vaso_maior) 
    {
        this.vaso_menor = vaso_menor;
        this.vaso_maior = vaso_maior;
    }

    public void iniciarVasos(Integer vMenorCapacidade, Integer vMaiorCapacidade) 
    {
        vaso_menor.setCapacidade(vMenorCapacidade);
        vaso_maior.setCapacidade(vMaiorCapacidade);
    }

    private void guarda(Vaso vaso1, Vaso vaso2) 
    {
        vasos.add("(" + vaso1.getVolume().toString()+ "," 
                    + vaso2.getVolume().toString() + ")");
    }

    private Boolean valida_vaso(Vaso vaso1, Vaso vaso2) 
    {
        for (int i = 0; i < vasos.size(); i++) {
            if (("("+ vaso1.getVolume().toString() + "," + 
                      vaso2.getVolume().toString() + ")") == vasos.get(i)) {
                
                return true;
            }
        }
        return false;
    }

    public Vaso getVaso_menor() 
    {
        return vaso_menor;
    }

    public void setVaso_menor(Vaso vaso_menor) 
    {
        this.vaso_menor = vaso_menor;
    }

    public Vaso getVaso_maior() 
    {
        return vaso_maior;
    }

    public void setVaso_maior(Vaso vaso_maior) 
    {
        this.vaso_maior = vaso_maior;
    }
    
}
