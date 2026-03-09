import java.util.Locale;
import java.util.Scanner;

public class Exercicio_06 {

    public static void main(String[] args) {

        /* PROBLEMÁTICA - Exercício 05

        * Fazer um programa que leia três valores com ponto flutuante de dupla precisão: A, B e C.
        * Em seguida, calcule e mostre:

        * a) a área do triângulo retângulo que tem A por base e C por altura.
        * b) a área do círculo de raio C. (pi = 3.14159)
        * c) a área do trapézio que tem A e B por bases e C por altura.
        * d) a área do quadrado que tem lado B.
        * e) a área do retângulo que tem lados A e B.

        ENTRADA                                           SAÍDA
        3.0 4.0 5.2                                       TRIANGULO: 7.800
                                                          CIRCULO: 84.949
                                                          TRAPEZIO: 18.200
                                                          QUADRADO: 16.000
                                                          RETANGULO: 12.000 */

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        // Definição de variáveis

        double A = sc.nextDouble();
        double B = sc.nextDouble();
        double C = sc.nextDouble();

        double TRIANGULO;
        double CIRCULO;
        double TRAPEZIO;
        double QUADRADO;
        double RETANGULO;


        TRIANGULO = (A * C) / 2;
        System.out.printf("TRIANGULO: %.3f\n" , TRIANGULO);

        CIRCULO = 3.14159 * C * C;
        System.out.printf("CIRCULO: %.3f\n" , CIRCULO);

        TRAPEZIO = (A + B)  / 2 * C;
        System.out.printf("TRAPÉZIO: %.3f\n" , TRAPEZIO);

        QUADRADO = B * 4;
        System.out.printf("QUADRADO: %.3f\n" , QUADRADO);

        RETANGULO = (A * B);
        System.out.printf("RETÂNGULO: %.3f" , RETANGULO);

        sc.close();

    }
}

