import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite dois numeros inteiros: ");
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();

        int soma = num1 + num2;
        int sub = num1 - num2;
        int mult = num1 * num2;
        int div = num1 / num2;

        System.out.println("Resultado da soma: " + soma);
        System.out.println("Resultado da subtração: " + sub);
        System.out.println("Resultado da multiplicação: " + mult);
        System.out.println("Resultado da divisão: " + div);

        sc.close();
    }

}


