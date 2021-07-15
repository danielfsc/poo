package com.poo.avaliacao1;

public class CalculadoraDeFuncoes {
    static CalculadoraDeFuncoes cf = new CalculadoraDeFuncoes();

    public static void main(String[] args) {
        Calculadora calc = new Calculadora();
        double x = Double.parseDouble(args[0]);
        double y = Double.parseDouble(args[1]);
        impressaoDeValores(x, y, calc);
    }

    static void impressaoDeValores(double x, double y, Calculadora calc) {
        System.out.println("Primeira Função = " + cf.funcaoA(x, y, calc));
        System.out.println("Segunda Função = " + cf.funcaoB(x, calc));
    }

    double funcaoA(double x, double y, Calculadora calc) {
        double x2 = calc.multiplicacao(x, x);
        double y2 = calc.multiplicacao(2, y);
        double x2Maisy2 = calc.soma(x2, y2);
        return calc.subtracao(x2Maisy2, 1);
    }

    double funcaoB(double x, Calculadora calc) {
        double x3 = calc.multiplicacao(x, calc.multiplicacao(x, x));
        double x3Menos2 = calc.subtracao(x3, 2);
        double x3Menos2Sobre3 = calc.divisao(x3Menos2, 3);
        double x2vezes5 = calc.multiplicacao(5, calc.multiplicacao(x, x));
        return calc.soma(x3Menos2Sobre3, x2vezes5);
    }

}
