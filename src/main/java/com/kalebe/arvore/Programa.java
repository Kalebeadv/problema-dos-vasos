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
        
        Vaso vaso_menor = new Vaso(3);
        Vaso vaso_maior = new Vaso(4);
        
        Regra regra = new Regra(vaso_menor, vaso_maior);
        
        Testador teste = new Testador(vaso_menor, vaso_maior);
        
        teste.iniciarCacheMemoriaF();
        
        System.out.println(teste.getCache());
    }
    
}
