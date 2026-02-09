import java.util.Locale;
import java.util.Scanner;

public class Exercicio_02 {

    static void main(String[] args) {

        // PROBLEMÁTICA - Exercício 02

        /* Faça um programa para ler o valor do raio de um círculo, e depois mostrar o valor da área
         * deste círculo com quatro casas decimais conforme exemplos.

         * Fórmula da área: area = π . raio²
         * Considere o valor de π = 3.14159

         * ENTRADA:  2.00                  SAÍDA: A= 12.5664 */

        Locale.setDefault(Locale.US);

        Scanner sc = new Scanner(System.in);


        double PI = 3.14159;
        double RAIO = sc.nextDouble();

        double AREA = PI * (RAIO * RAIO);

        System.out.printf("SAÍDA = %.4f" , AREA);

        sc.close();


    }


}