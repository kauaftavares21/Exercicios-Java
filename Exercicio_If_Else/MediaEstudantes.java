import java.util.Scanner;

public class MediaEstudantes {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double media;

        while (true) {

            System.out.print("Digite a média do aluno (ou -1 para sair): ");
            media = scanner.nextDouble();

            if (media == -1) {
                break;
            }

            if (media >= 7.0) {
                System.out.println("O estudante teve média " + media + " e foi aprovado.");
            } else if (media >= 5.0 && media < 7.0) {
                System.out.println("O estudante teve média " + media + " e está de recuperação.");
            } else {
                System.out.println("O estudante teve média " + media + " e foi reprovado.");
            }
        }

        scanner.close();
        System.out.println("Programa encerrado.");

    }
}