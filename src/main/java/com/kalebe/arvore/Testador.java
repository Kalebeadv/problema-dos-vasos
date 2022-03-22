/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.kalebe.arvore;

import java.util.ArrayList;

/**
 *
 * @author kaleb
 */
public class Testador {
    private Vaso vaso_menor;
    private Vaso vaso_maior;
    private ArrayList cache = new ArrayList<>(); 
    private ArrayList memoria = new ArrayList<>();
    private Integer f;

    public Testador(Vaso vaso_menor, Vaso vaso_maior) {
        this.vaso_menor = vaso_menor;
        this.vaso_maior = vaso_maior;
    }
    
    
    
    public void iniciarCacheMemoriaF()
    {
        this.cache.add(0.0);
        this.memoria.add(0.0);
        this.f = 0;
    }
   
   public void testador(Testador testador)
   {
       if(f == 0)
       {
           System.out.println("Inicio");
       }
      
   }

    public Vaso getVaso_menor() {
        return vaso_menor;
    }

    public void setVaso_menor(Vaso vaso_menor) {
        this.vaso_menor = vaso_menor;
    }

    public Vaso getVaso_maior() {
        return vaso_maior;
    }

    public void setVaso_maior(Vaso vaso_maior) {
        this.vaso_maior = vaso_maior;
    }

    public ArrayList getCache() {
        return cache;
    }

    public void setCache(ArrayList cache) {
        this.cache = cache;
    }

    public ArrayList getMemoria() {
        return memoria;
    }

    public void setMemoria(ArrayList memoria) {
        this.memoria = memoria;
    }

    public Integer getF() {
        return f;
    }

    public void setF(Integer f) {
        this.f = f;
    }
   
   
    
}
