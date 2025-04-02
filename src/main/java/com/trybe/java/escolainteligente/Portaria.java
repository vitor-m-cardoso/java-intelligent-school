package com.trybe.java.escolainteligente;

import java.util.Locale;
import java.util.Scanner;

public class Portaria {

  private static String formatarPercentual(double valor) {
    if (Double.isNaN(valor)) {
      return "0.0%";
    }
    if (valor % 1 == 0) {
      return String.format(Locale.US, "%.1f%%", valor);
    }
    return String.format(Locale.US, "%.2f%%", valor);
  }

  public static void emitirRelatorio(int qtdFundamental1, int qtdFundamental2, int qtdMedio) {
    Scanner scanMenu = new Scanner(System.in);
    int totalEstudantes = qtdFundamental1 + qtdFundamental2 + qtdMedio;
    double percentualFundamentalI = (qtdFundamental1 * 100.0) / totalEstudantes;
    double percentualFundamentalII = (qtdFundamental2 * 100.0) / totalEstudantes;
    double percentualEnsinoMedio = (qtdMedio * 100.0) / totalEstudantes;
    scanMenu.useLocale(Locale.US);

    System.out.println("----- Quantidade -----");
    System.out.println("Ensino Fundamental I: " + qtdFundamental1);
    System.out.println("Ensino Fundamental II: " + qtdFundamental2);
    System.out.println("Ensino Médio: " + qtdMedio + "\n");
    System.out.println("----- Percentual -----");
    System.out.println("Ensino Fundamental I: " + formatarPercentual(percentualFundamentalI));
    System.out.println("Ensino Fundamental II: " + formatarPercentual(percentualFundamentalII));
    System.out.println("Ensino Médio: " + formatarPercentual(percentualEnsinoMedio) + "\n");
    System.out.println("TOTAL: " + totalEstudantes);
  }

  public static void coletarInformacoes() {
    Scanner scanMenu = new Scanner(System.in);
    int qtdFundamental1 = 0;
    int qtdFundamental2 = 0;
    int qtdMedio = 0;

    while (true) {
      System.out.println("Entre com o número correspondente à opção desejada:");
      System.out.println("1 - Registrar o acesso de estudante");
      System.out.println("2 - Finalizar o acesso e emitir o relatório");
      short opcao = scanMenu.nextShort();

      if (opcao == 1) {
        System.out.print("Entre com a idade do estudante: ");
        int idade = scanMenu.nextInt();
        if(idade >= 6 && idade <= 10) {
          System.out.println("Pessoa estudante do Ensino Fundamental I, catraca liberada!");
          qtdFundamental1 += 1;
        } else if (idade >= 11 && idade <= 14) {
          System.out.println("Pessoa estudante do Ensino Fundamental II, catraca liberada!");
          qtdFundamental2 += 1;
        } else if (idade >= 15) {
          System.out.println("Pessoa estudante do Ensino Médio, catraca liberada!");
          qtdMedio += 1;
        } else {
          System.out.println("Idade inválida, tente novamente.");
        }
      } else if (opcao == 2) {
        emitirRelatorio(qtdFundamental1, qtdFundamental2, qtdMedio);
        break;
      } else {
        System.out.println("Entre com uma opção válida!\n");
      }
    }
  }
}
