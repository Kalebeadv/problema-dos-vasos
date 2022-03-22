/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.kalebe.arvore;

/**
 *
 * @author kalebe
 */
public class Regra {
    
    
   private Vaso vaso_menor;
   private Vaso vaso_maior;

    public Regra(Vaso vaso_menor, Vaso vaso_maior) {
        this.vaso_menor = vaso_menor;
        this.vaso_maior = vaso_maior;
    }
   
   
   
   public void encheMenorVaso()
   {
       this.vaso_menor.setVolume(this.vaso_menor.getCapacidade());
   }
   
   public void encheMaiorVaso()
   {
       this.vaso_maior.setVolume(this.vaso_maior.getCapacidade());
   }
   
   public void menorVasoEsvaziar()
   {
       this.vaso_menor.setVolume(0);
   }
   
   public void maiorVasoEsvaziar()
   {
       this.vaso_maior.setVolume(0);
   }
   
   public void despejarMenorNoVasoMaior()
   {
       Integer sobraDeAgua = this.vaso_maior.despejarAguaEmOutroVaso(this.vaso_menor.getVolume());
       this.vaso_menor.setVolume(sobraDeAgua);
   }
   
   public void despejarMaiorNoVasoMenor()
   {
       Integer sobraDeAgua = this.vaso_menor.despejarAguaEmOutroVaso(vaso_maior.getVolume());
       this.vaso_maior.setVolume(sobraDeAgua);
   }
}
