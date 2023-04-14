/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.calculomedia;

import java.util.Scanner;

/**
 *
 * @author jotal
 */
public class CalculoMedia {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        double[] media = new double[30];

        for (int i = 0; i < media.length; i++) {

            System.out.print("Digite a primeira nota: ");
            double nota1 = input.nextDouble();

            System.out.print("Digite a segunda nota: ");
            double nota2 = input.nextDouble();

            System.out.print("Digite a terceira nota: ");
            double nota3 = input.nextDouble();

            media[i] = (nota1 + nota2 + nota3) / 3;

            if (media[i] < 5) {
                System.out.println("Infelizmente o aluno está de reprovado, a média foi : " + media[i]);

            } else {
                System.out.println("Parabéns!! você passou a média foi: " + media[i]);
            }

        }

        System.out.println("Médias calculadas:");
        for (int i = 0; i < media.length; i++) {
            System.out.printf("%.2f - ", media[i]);

            if (media[i] >= 5) {
                System.out.println("Aluno aprovado!");
            } else {
                System.out.println("Aluno reprovado!");
            }
        }

    }

}
