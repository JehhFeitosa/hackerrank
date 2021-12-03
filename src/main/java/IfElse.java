import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

/*
 *Tarefa
 *Dado um número inteiro,, execute as seguintes ações condicionais:
 *Se  é estranho imprimir Weird
 *Se  é uniforme e está na faixa inclusiva de  para , imprimir Not Weird
 *Se  é uniforme e está na faixa inclusiva de  para , imprimir Weird
 *Se  é igual e maior do que , imprimir Not Weird
 *Complete o código stub fornecido em seu editor para imprimir ou não  é estranho.
 *Formato de entrada
 *Uma única linha contendo um número inteiro positivo, .
 *Restrições
 *Formato de saída
 *Imprima Weirdse o número for estranho; caso contrário, imprima Not Weird.
 */
public class IfElse {

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int N = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");
        if (N % 2 != 0) {
            System.out.println("Weird");
        } else if (N >= 2 && N <= 5) {
            System.out.println("Not Weird");
        } else if (N >= 6 && N <= 20) {
            System.out.println("Weird");
        } else if (N > 20) {
            System.out.println("Not Weird");
        }
        scanner.close();
    }
}
