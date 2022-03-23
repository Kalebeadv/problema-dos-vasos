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
       Integer sobraDeAgua = vaso_maior.despejarAguaEmOutroVaso(vaso_menor.getVolume());
       vaso_menor.setVolume(sobraDeAgua);
   }
   
   public void despejarNoMenor(Vaso vaso_menor, Vaso vaso_maior)
   {
       Integer sobraDeAgua = vaso_menor.despejarAguaEmOutroVaso(vaso_maior.getVolume());
       vaso_maior.setVolume(sobraDeAgua);
   }}
