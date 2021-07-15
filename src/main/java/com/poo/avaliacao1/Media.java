package com.poo.avaliacao1;

import java.util.Scanner;

public class Media {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.print("Digite a nota 1: ");
        Float n1 = Float.parseFloat(scan.next().replace(",", "."));

        System.out.print("Digite a nota 1: ");
        Float n2 = Float.parseFloat(scan.next().replace(",", "."));

        scan.close();

        Float media = (n1 + n2) / 2;

        if (media >= 7.0) {
            System.out.println("Aprovado");
        } else {
            System.out.println("Reprovado");
        }

    }

}
