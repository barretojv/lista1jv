import java.util.Scanner;
import java.util.Random;

public class jogoAdivinhacao {
    public static void main(String[] args) throws Exception {
        Scanner ler = new Scanner (System.in);
        Random sorteio = new Random();

        int numAleatorio = sorteio.nextInt(100) +1;
        int palpite = 0;
        int tentativas = 0;

        System.out.println("Bem vindo ao Tigrinho!");
        System.out.println();
        System.out.println("Jogo de Adivinhação.");
        System.out.println("Digite um número de (1-100)");
        System.out.println();

        while (palpite != numAleatorio) {
            System.out.print("Digite seu palpite: ");
            palpite = ler.nextInt();
            tentativas++;
            if (palpite < numAleatorio) {
                System.out.println("Seu palpite é menor.");
                }//else if   
                else if (palpite > numAleatorio) {
                    System.out.println("Seu palpite é maior.");
                }//fim else if
                else {
                    System.out.println("Você acertou o número!" + numAleatorio + " em " + tentativas + " tentativas!");
                }//fim else
                break;
        }//fim while
    }//fim manin
}//fim class
