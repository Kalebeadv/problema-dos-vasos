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
public class Programa {
    
    public static void main(String[] args) {
        
        Vaso vaso_menor = new Vaso(3,0);
        Vaso vaso_maior = new Vaso(4,0);
        
        
        Testador testador =  new Testador();
        
        testador.guarda(vaso_menor, vaso_maior);
        
        //vaso_maior.setVolume(2);
        //vaso_menor.setVolume(1);
        
        //testador.guarda(vaso_menor, vaso_maior);
        
        //System.out.println(testador.getVasos().get(0) + testador.getVasos().get(1));
        
        
        
        testador.contruir_(vaso_menor, vaso_maior);
        for(int i = 0; i < testador.getVasos().size(); i++)
        {
            System.out.println(testador.getVasos().get(i));  
        }
    }
    
}
