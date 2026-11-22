public class Main {
    public static void main(String[] args) {
        double produto = 19.99;
        int qtdProduto = 24;
        final double DESCONTO = 0.10;

        double somaTotal = produto * qtdProduto;
        double valorDoDesconto = somaTotal * DESCONTO;
        double valoComDesconto = somaTotal - valorDoDesconto;

        System.out.printf("Total sem desconto: R$ %.2f%n" , somaTotal);
        System.out.printf("Desconto de 10%%: R$ %.2f%n", valorDoDesconto);
        System.out.printf("Total com desconto: R$ %.2f%n ", valoComDesconto);

    }

}


