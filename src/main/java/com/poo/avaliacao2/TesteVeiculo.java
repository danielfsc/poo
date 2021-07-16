package com.poo.avaliacao2;

import com.poo.avaliacao2.poo.Veiculo;

public class TesteVeiculo {

    public static void main(String[] args) {
        Veiculo kombi = new Veiculo();
        kombi.setModelo("kombi");
        kombi.setCor("Branca");
        kombi.setAno(1994);
        Veiculo fusca = new Veiculo();
        fusca.setModelo("Fusca");
        fusca.setCor("Azul");
        fusca.setAno(1983);

        kombi.exibe();
        fusca.exibe();

    }

}
