import java.util.Scanner;

public class Exercicio_01 {

    static void main(String[] args) {

        // PROBLEMÁTICA - Exercício 01

        /* Faça um programa para ler dois valores inteiros, e depois mostrar na tela a soma
         * desses números com uma mensagem explicativa,conforme o exemplo abaixo:

         * Entrada:               * Saída
         * 10                     * SOMA = 40
         * 30
         */

        Scanner sc = new Scanner(System.in);

        int numero_01 = sc.nextInt();
        int numero_02 = sc.nextInt();

        int TOTAL = numero_01 + numero_02;

        System.out.println("SOMA = " + TOTAL);

        sc.close();

    }

}
