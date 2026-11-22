import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite seu nome: ");
        String nome = sc.nextLine();
        System.out.print("Digite sua idade: ");
        int idade = sc.nextInt();
        System.out.print("Digite sua altura: ");
        double altura = sc.nextDouble();
        System.out.println("Meu nome é: " + nome);
        System.out.println("Tenho: " + idade + " anos");
        System.out.printf("Tenho %.2fm", altura);

        sc.close();
    }

}


