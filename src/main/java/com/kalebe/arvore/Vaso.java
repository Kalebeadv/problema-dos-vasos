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
public class Vaso {
    
    private Integer capacidade ;
    private Integer volume = 0;
    
    public Vaso(Integer capacidade) {
        this.capacidade = capacidade;
    }

    public Integer getCapacidade() {
        return capacidade;
    }

    public void setCapacidade(Integer capacidade) {
        this.capacidade = capacidade;
    }
    
    public void setVolume(Integer volume) {
        this.volume = volume;
    }

    public Integer getVolume() {
        return volume;
    }
    
    public Integer despejarAguaEmOutroVaso(Integer agua)
    {
        Integer totalDeAgua = 0;
        if (this.volume + agua <= this.capacidade)
        {
            this.volume = this.volume + agua;
        }
        else if (this.volume + agua > this.capacidade)
        {
            Integer sobraDeAgua = this.capacidade - this.volume;
            sobraDeAgua = agua - sobraDeAgua;
            this.volume = sobraDeAgua;
        }
        
        return totalDeAgua;
    }
}
