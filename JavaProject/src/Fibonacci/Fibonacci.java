package Fibonacci;

import java.util.Scanner;


public class Fibonacci {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite um número: ");
        int numero = scanner.nextInt();

        int primeiro = 0;
        int segundo = 1;

        if (numero == primeiro || numero == segundo) {
            System.out.println("O número " + numero + " pertence à sequência de Fibonacci.");
        } else {
            while (segundo <= numero) {
                int soma = primeiro + segundo;
                if (soma == numero) {
                    System.out.println("O número " + numero + " pertence à sequência de Fibonacci.");
                    return;
                }
                primeiro = segundo;
                segundo = soma;
            }
            System.out.println("O número " + numero + " não pertence à sequência de Fibonacci.");
            }
        
       
          } 
} 