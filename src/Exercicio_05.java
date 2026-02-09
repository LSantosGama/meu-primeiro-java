import java.util.Locale;
import java.util.Scanner;

public class Exercicio_05 {

    public static void main(String[] args) {


        // PROBLEMÁTICA - Exercício 05

        /* Fazer um programa para ler o código de uma peça 1, o número de peças 1, o valor unitário de cada peça 1, o
         * código de uma peça 2, o número de peças 2 e o valor unitário de cada peça 2.
         * Calcule e mostre o valor a ser pago.

        Exemplos:

        Entrada:                                 Saída:
        12 1 5.30                                VALOR A PAGAR: R$ 15.50
        16 2 5.1O                                                                 */

        int COD_PECA_01;
        int NUMERO_PECA_01;
        double PRECO_UNIT_01;

        int COD_PEGA_02;
        int NUMERO_PECA_02;
        double PRECO_UNIT_02;


        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        COD_PECA_01 = sc.nextInt();
        NUMERO_PECA_01 = sc.nextInt();
        PRECO_UNIT_01 = sc.nextDouble();


        COD_PEGA_02 = sc.nextInt();
        NUMERO_PECA_02 = sc.nextInt();
        PRECO_UNIT_02 = sc.nextDouble();

        double PAGAR = (NUMERO_PECA_01 * PRECO_UNIT_01) + (NUMERO_PECA_02 * PRECO_UNIT_02);

        System.out.printf("Valor A PAGAR: R$ %.2f" , PAGAR);

        sc.close();

    }
}
