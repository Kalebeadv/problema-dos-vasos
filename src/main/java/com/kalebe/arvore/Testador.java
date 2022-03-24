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
    private Vaso vaso_teste = new Vaso(3,0);
    
    public void guarda(Vaso vaso_menor, Vaso vaso_maior) 
    {
        this.vasos.add(("(" + vaso_menor.getVolume().toString()+ "," 
                    + vaso_maior.getVolume().toString() + ")"));
    }

    public Boolean valida_vaso(Vaso vaso_menor, Vaso vaso_maior) 
    {
        for (int i = 0; i < this.vasos.size(); i++) {
            if (("("+ vaso_menor.getVolume().toString() + "," + 
                      vaso_maior.getVolume().toString() + ")").equals(this.vasos.get(i))) {
                
                return true;
            }
        }
        return false;
    }

    public void encheVaso(Vaso vaso)
   {
      vaso.setVolume(vaso.getCapacidade());
   }
   
   public void esvaziaVaso(Vaso vaso)
   {
       vaso.setVolume(0);
   }
   
   public void despejarNoMaior(Vaso vaso_menor, Vaso vaso_maior)
   {
       if((vaso_menor.getVolume() + vaso_maior.getVolume()) > vaso_maior.getCapacidade())
       {
           vaso_menor.setVolume((vaso_menor.getVolume() + vaso_maior.getVolume())
                                 - vaso_maior.getCapacidade());
           vaso_maior.setVolume(vaso_maior.getCapacidade());
       } 
       else if((vaso_menor.getVolume() + vaso_maior.getVolume()) <= vaso_maior.getCapacidade())
       {
           vaso_maior.setCapacidade(vaso_menor.getVolume() + vaso_maior.getVolume());
           vaso_menor.setVolume(0);
       }
       
   }
   
   public void despejarNoMenor(Vaso vaso_menor, Vaso vaso_maior)
   {
       if((vaso_menor.getVolume()+ vaso_maior.getVolume()) > vaso_menor.getCapacidade())
       {
           
           vaso_maior.setVolume((vaso_menor.getVolume() + vaso_maior.getVolume())
                                 - vaso_menor.getCapacidade());
           vaso_menor.setVolume(vaso_menor.getCapacidade());
       }
       else if((vaso_menor.getVolume() + vaso_maior.getVolume()) 
               <= vaso_menor.getCapacidade())
       {
           vaso_menor.setVolume(vaso_maior.getVolume() + vaso_menor.getVolume());
           vaso_maior.setVolume(0);
       }
    }
   
    public void contruir_(Vaso vaso_menor, Vaso vaso_maior)
    {
        
        if(vaso_menor.getVolume() == 0 && vaso_maior.getVolume() == 0)
        {
            vaso_teste.setVolume(0);
            encheVaso(vaso_menor);
            guarda(vaso_menor, vaso_maior);
            encheVaso(vaso_maior);
            guarda(vaso_teste, vaso_maior);
        }
        if(vaso_menor.getVolume() > vaso_maior.getVolume())
        {
            despejarNoMaior(vaso_menor, vaso_maior);
            guarda(vaso_menor, vaso_maior);
        }
        if(vaso_maior.getVolume() == vaso_maior.getCapacidade())
        {
            despejarNoMenor(vaso_menor, vaso_maior);
            guarda(vaso_menor, vaso_maior);
        }
        if(vaso_maior.getVolume() < vaso_maior.getCapacidade())
        {
            
                encheVaso(vaso_maior);
                despejarNoMenor(vaso_menor, vaso_maior);
                guarda(vaso_menor, vaso_maior);
            
        }
        if(vaso_menor.getVolume() < vaso_maior.getVolume() && 
           vaso_menor.getVolume() == vaso_menor.getCapacidade())
        {
            esvaziaVaso(vaso_menor);
            despejarNoMenor(vaso_menor, vaso_maior);
            guarda(vaso_menor, vaso_maior);
        }
        if(vaso_menor.getVolume() < vaso_menor.getCapacidade() &&
           vaso_menor.getVolume() > vaso_maior.getVolume())
        {
            encheVaso(vaso_maior);
            guarda(vaso_menor, vaso_maior);
        }
        if(vaso_maior.getVolume() == vaso_maior.getCapacidade() &&
           vaso_menor.getVolume() > 0 && vaso_menor.getVolume() < 2)
        {
            despejarNoMenor(vaso_menor, vaso_maior);
            guarda(vaso_menor, vaso_maior);
        }
        
        if(vaso_menor.getVolume() > vaso_maior.getVolume() && 
           vaso_maior.getVolume() > 1 && vaso_maior.getVolume() < 3)
        {
            esvaziaVaso(vaso_menor);
            guarda(vaso_menor, vaso_maior);
        }
        
       
    }
   
    public List<String> getVasos() {
        return vasos;
    }
     
    
    
}
