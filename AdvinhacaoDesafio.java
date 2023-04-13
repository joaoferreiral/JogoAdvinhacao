import java.util.Random;
import java.util.Scanner;

public class AdvinhacaoDesafio {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random rand = new Random();
        int numeroAleatorio = rand.nextInt(100); // gera um numero de 0 a 100
        int tentativas = 5;
        int palpite;
        int contador = 0;

        System.out.println("Jogo de advinhação!");

        while (contador < tentativas) {;
        System.out.print("Tentativa " + (contador + 1) + ": ");
        palpite = sc.nextInt();

        if (palpite == numeroAleatorio) {;
            System.out.println("Parabéns você acertou o número " + numeroAleatorio + "!");
            return;
        } else if (palpite < numeroAleatorio) {
            System.out.println("O número que você digitou é menor que o número aleatório!");
        } else {
            System.out.println("O número que você digitou é maior que o número aleatório!");
            contador++;
        }
        }
        System.out.println("Suas tentativas acabaram, o número era: " + numeroAleatorio);


    }
}
