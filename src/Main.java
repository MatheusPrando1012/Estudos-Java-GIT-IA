import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Insira 2 numeros ");

        System.out.print("Primeiro numero: ");
        int num1 = sc.nextInt();
        System.out.print("Segundo numero: ");
        int num2 = sc.nextInt();

        if (num1 > num2) {
            System.out.println("O Primeiro numero é maior: " + num1);
        } else if (num1 == num2) {
            System.out.println("Nenhum numero é maior que outro");
        }else {
            System.out.println("O segundo numero é maior: " + num2);
        }

        sc.close();
    }

}


