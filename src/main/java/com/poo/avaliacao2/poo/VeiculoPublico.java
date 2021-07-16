package com.poo.avaliacao2.poo;

public class VeiculoPublico {
    public String marca;
    public String modelo;
    public String cor;
    public int ano;

    public VeiculoPublico() {
    }

    public VeiculoPublico(String marca, String modelo, String cor, int ano) {
        this.marca = marca;
        this.modelo = modelo;
        this.cor = cor;
        this.ano = ano;
    }

    public void exibe() {
        System.out.println("Veiculo:");
        System.out.println("\tMarca: " + this.marca);
        System.out.println("\tModelo: " + this.modelo);
        System.out.println("\tCor: " + this.cor);
        System.out.println("\tAno: " + this.ano);
    }

}
