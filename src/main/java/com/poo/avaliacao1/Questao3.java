package com.poo.avaliacao1;

public class Questao3 {
    int x;
    int y;
    String nome = null;

    public static void main(String[] args) {
        Questao3 obj = new Questao3(); // porque que quando eu crio a instância ele não faz o system.out.println()?
        System.out.println(obj.nome + " " + obj.x + " " + obj.y);
    }
}
