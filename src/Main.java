import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Insira um numero: ");
        int num = sc.nextInt();
        if (num >= 1) {
            System.out.println("Positivo");
        } else if (num == 0 ) {
            System.out.println("Neutro");
        } else {
            System.out.println("Negativo");
        }

        sc.close();
    }

}


