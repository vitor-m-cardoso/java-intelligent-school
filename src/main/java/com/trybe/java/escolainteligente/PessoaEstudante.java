package com.trybe.java.escolainteligente;

import java.util.Scanner;

public class PessoaEstudante {

  public static int calcularIdadeEmDias(int anos, int meses, int dias) {
    int anosEmDias = anos * 365;
    int mesesEmDias = meses * 30;
    int idadeEmDias = anosEmDias + mesesEmDias + dias;
    return idadeEmDias;
  }

  public static void coletarInformacoes() {
    Scanner scanMenu = new Scanner(System.in);
    System.out.println("Qual o nome do estudante?");
    String nome = scanMenu.nextLine();
    System.out.println("Qual a idade do estudante em anos, meses e dias?");
    System.out.print("anos: ");
    int anos = scanMenu.nextInt();
    System.out.print("meses: ");
    int meses = scanMenu.nextInt();
    System.out.print("dias: ");
    int dias = scanMenu.nextInt();
    int idadeEmDias = calcularIdadeEmDias(anos, meses, dias);
    String mensagem = String.format("A idade de %s em dias é %d.", nome, idadeEmDias);
    System.out.println(mensagem);
  }
}