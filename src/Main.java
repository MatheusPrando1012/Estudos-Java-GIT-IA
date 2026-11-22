import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Insira um numero inteiro: ");
        int numero = sc.nextInt();
        int resto = numero % 2;
        if (resto == 0){
            System.out.println("par");
        }
        else {
            System.out.println("impar");
        }

        sc.close();
    }

}


