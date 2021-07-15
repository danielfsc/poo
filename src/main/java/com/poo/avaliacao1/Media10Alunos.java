package com.poo.avaliacao1;

import java.util.Scanner;

public class Media10Alunos {

    public static void main(String[] args) {

        int alunos = 0;
        float total = 0;
        float nota;
        float media;

        Scanner scan = new Scanner(System.in);

        System.out.print(" Digite a nota do aluno " + (alunos + 1) + ":");
        nota = Float.parseFloat(scan.next().replace(",", "."));

        while (nota >= 0) {
            alunos++;
            total += nota;
            System.out.print(" Digite a nota do aluno " + (alunos + 1) + ":");
            nota = Float.parseFloat(scan.next().replace(",", "."));
        }

        if (alunos > 0) {
            media = total / alunos;
            System.out.print("A média das notas da turma é: " + media);
        }

        scan.close();
    }

}
