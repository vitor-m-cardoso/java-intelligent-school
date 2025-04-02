package com.trybe.java.escolainteligente;

import java.util.Locale;
import java.util.Scanner;

public class Secretaria {

  public static double calcularMedia(double nota1, double nota2, double nota3, double nota4) {
    double mediaNotas = (nota1 + nota2 + nota3 + nota4) / 4;
    return mediaNotas;
  }

  public static void coletarInformacoes() {
    Scanner scanMenu = new Scanner(System.in);
    scanMenu.useLocale(Locale.US);
    System.out.println("Qual o nome do estudante?");
    String nome = scanMenu.nextLine();
    System.out.println("Entre com as notas das provas:");
    System.out.print("Avaliação 1: ");
    double nota1 = scanMenu.nextDouble();
    System.out.print("Avaliação 2: ");
    double nota2 = scanMenu.nextDouble();
    System.out.print("Avaliação 3: ");
    double nota3 = scanMenu.nextDouble();
    System.out.print("Avaliação 4: ");
    double nota4 = scanMenu.nextDouble();

    double mediaNotas = calcularMedia(nota1, nota2, nota3, nota4);
    String mensagem = String.format(Locale.US, "A média das notas de %s é %.3f", nome, mediaNotas);
    System.out.println(mensagem);
  }
}
