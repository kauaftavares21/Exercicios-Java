import java.util.Scanner;

public class VerificacaoDeDesconto {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o valor da compra: R$ ");
        double valorDaCompra = scanner.nextDouble();

        if (valorDaCompra > 100.00) {
            double desconto = valorDaCompra * 0.10;
            double valorFinal = valorDaCompra - desconto;
            System.out.println("Desconto de 10% aplicado ");
            System.out.printf("Novo valor: R$ %.2f%n", valorFinal);
        } else {
            System.out.println("Nenhum desconto aplicado.");
            System.out.printf("Valor total: R$ %.2f%n", valorDaCompra);
        }

        scanner.close();
    }
}
