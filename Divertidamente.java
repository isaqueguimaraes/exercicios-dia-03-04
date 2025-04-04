import java.util.Scanner;

public class Divertidamente {
  public static void main(String args[]) {
    Scanner scanner = new Scanner(System.in);
    int alegria, tristeza;
    alegria = 0;
    tristeza = 0;

    System.out.println("Quantas amizades a Riley fez na nova cidade? ");
    int amizades = scanner.nextInt();

    if (amizades > 0) {
      alegria += amizades * 10;
      tristeza += 0;
    } else {
      tristeza += 30;
    }

    System.out.println("\nRiley fez três provas na faculdade, vamos calcular sua média.");
    System.out.println("Qual a pontuação de Riley na prova A1? ");
    double notaUm = scanner.nextDouble();

    System.out.println("Qual a pontuação de Riley na prova A2? ");
    double notaDois = scanner.nextDouble();

    System.out.println("Qual a pontuação de Riley na prova A3? ");
    double notaTres = scanner.nextDouble();

    double media = (notaUm + notaDois + notaTres) / 3;
    System.out.println("\nA média de Riley nas provas é: " + media);

    if (media >= 7) {
      System.out.println("Riley foi aprovada na faculdade.");
      alegria += 50;
    } else {
      System.out.println("Riley não alcançou a média e não foi aprovada na faculdade.");
      tristeza += 50;
    }

    System.out.println("\nRiley tem 10 exercícios da faculdade para fazer.");
    System.out.println("Quantos exercícios a Riley conseguiu fazer? ");
    int exerciciosFeitos = scanner.nextInt();

    if (exerciciosFeitos > 0) {
      alegria += exerciciosFeitos * 10;
    }

    int naofeitos = 10 - exerciciosFeitos;
    if (naofeitos > 0) {
      tristeza += naofeitos * 10;
    }

    if (alegria > tristeza) {
      System.out.println("\nA mudança para a nova cidade foi uma experiência incrível para a Riley.");
    } else if (alegria < tristeza) {
      System.out.println("\nA mudança para a nova cidade foi uma experiência desagradável para a Riley.");
    } else {
      System.out.println("\nA mudança para a nova cidade foi uma experiência comum para a Riley.");
    }

    System.out.println("Alegria = " + alegria);
    System.out.println("Tristeza = " + tristeza);

    scanner.close();
  }
}