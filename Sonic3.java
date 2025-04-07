import java.util.Scanner;

public class Sonic3 {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int esperanca, medo, confianca, desanimo, determinacao, incerteza;
    esperanca = 0;
    medo = 0;
    confianca = 0;
    desanimo = 0;
    determinacao = 0;
    incerteza = 0;

    System.out.println(
        "Quantos novos aliados Sonic, Knuckles e Tails conseguiram encontrar para ajudar na luta contra Shadow?");
    int aliados = scanner.nextInt();

    if (aliados > 0) {
      esperanca += aliados * 15;
      medo += 0;
    } else {
      medo += 40;
    }

    System.out.println("\nA equipe enfrentou três grandes confrontos iniciais contra Shadow.");
    System.out
        .println("Em uma escala de 0 a 10, digite o quão bem a equipe a equipe se saiu em cada um dos confrontos.");
    System.out.println("Pontuação do primeiro confronto:");
    int confrontoUm = scanner.nextInt();

    System.out.println("Pontuação do segundo confronto:");
    int confrontoDois = scanner.nextInt();

    System.out.println("Pontuação do terceiro confronto:");
    int confrontoTres = scanner.nextInt();

    int media = (confrontoUm + confrontoDois + confrontoTres) / 3;

    if (media >= 7) {
      confianca += 60;
    } else {
      desanimo += 60;
    }

    System.out
        .println("\nA equipe precisa analisar 12 estratégias diferentes para tentar superar os poderes de Shadow.");
    System.out.println("Quantas dessas estratégias a equipe conseguiu analisar completamente?");
    int estrategiascertas = scanner.nextInt();

    if (estrategiascertas > 0) {
      determinacao += estrategiascertas * 10;
    }

    int estrategiaserradas = 12 - estrategiascertas;
    if (estrategiaserradas > 0) {
      incerteza += estrategiaserradas * 10;
    }

    System.out.println("\nEsperança: " + esperanca);
    System.out.println("Medo: " + medo);
    System.out.println("Confiança: " + confianca);
    System.out.println("Desânimo: " + desanimo);
    System.out.println("Determinação: " + determinacao);
    System.out.println("Incerteza: " + incerteza);

    int emocoespositivas = esperanca + confianca + determinacao;
    int emocoesnegativas = medo + desanimo + incerteza;

    if (emocoespositivas > emocoesnegativas) {
      System.out.println("\nO Shadow foi derrotado.");
    } else {
      System.out.println("\nShadow venceu o time do Sonic.");
    }
    scanner.close();
  }
}
