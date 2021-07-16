package com.poo.avaliacao2.poo;

public class Veiculo {

    private String modelo;
    private String cor;
    private int ano;

    public String getModelo() {
        return this.modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getCor() {
        return this.cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public int getAno() {
        return this.ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    public void exibe() {
        System.out.println("Veiculo:");
        System.out.println("\tModelo: " + this.getModelo());
        System.out.println("\tCor: " + this.getCor());
        System.out.println("\tAno: " + this.getAno());
    }

}
