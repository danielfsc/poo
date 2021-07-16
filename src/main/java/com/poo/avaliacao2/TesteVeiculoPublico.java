package com.poo.avaliacao2;

import com.poo.avaliacao2.poo.VeiculoPublico;

public class TesteVeiculoPublico {

    public static void main(String[] args) {
        VeiculoPublico onibus = new VeiculoPublico();
        onibus.marca = "Scania";
        onibus.modelo = "S380";
        onibus.cor = "Azul";
        onibus.ano = 2008;

        VeiculoPublico taxi = new VeiculoPublico();
        taxi.marca = "Ford";
        taxi.modelo = "Tracker";
        taxi.cor = "Prata";
        taxi.ano = 2015;

        onibus.exibe();
        taxi.exibe();
    }

}
