import java.util.Locale;
import java.util.Scanner;

public class Exercicio_04 {

    public static void main(String[] args) {

        // PROBLEMÁTICA - Exercício 04

        /* Fazer um programa que leia o número de um funcionário, seu número de horas trabalhadas,
         * o valor que recebe por hora e calcula o salário desse funcionário. A seguir, mostre o número
         * e o salário do funcionário, com duas casas decimais.

        Exemplos:

        Entrada:                                 Saída:
        25                                       NUNBER: 25
        100                                      SALARY: U$ 550.00
        5.50                                                        */

        int NumeroDoFunionario;
        double TotalHorasTrabalhadas;
        double ValorHoraTrabalho;

        Locale.setDefault(Locale.US);

        Scanner sc = new Scanner(System.in);

        NumeroDoFunionario = sc.nextInt();
        TotalHorasTrabalhadas = sc.nextDouble();
        ValorHoraTrabalho = sc.nextDouble();

        double SALARY = (TotalHorasTrabalhadas * ValorHoraTrabalho);

        System.out.println("NUNBER: " + NumeroDoFunionario);
        System.out.printf("SALARY: U$ %.2f" , SALARY);

        sc.close();
  }
}