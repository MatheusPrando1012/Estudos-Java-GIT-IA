import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite o preço de um produto: ");
        double preco = sc.nextDouble();
        System.out.print("Digite a quantidade de itens comprados: ");
        int quantidade = sc.nextInt();

        double precototal = preco * quantidade;
        final double DESCONTO = 0.10;
        double economia = precototal * DESCONTO;
        double valorFinal = precototal - economia;

        System.out.printf("Preço total: R$ %.2f%n", precototal);
        System.out.printf("Preço total com o desconto: R$ %.2f%n", valorFinal);
        System.out.printf("Dinheiro salvo: R$ %.2f%n", economia);

        sc.close();
    }

}


