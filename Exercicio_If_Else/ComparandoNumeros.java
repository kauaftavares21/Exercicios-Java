import java.util.Scanner;

public class ComparandoNumeros {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o primeiro número:");
        int numero1 = scanner.nextInt();

        System.out.println("Digite o segundo número:");
        int numero2 = scanner.nextInt();

        if (numero1 > numero2){
            System.out.println("O maior número é o " + numero1 );
        } if (numero2 > numero1) {
            System.out.println("O maior número é o " + numero2 );
        } else {
            System.out.println("Ambos números são iguais " );
        }

        scanner.close();
    }
}