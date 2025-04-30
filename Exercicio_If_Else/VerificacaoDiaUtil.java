import java.util.Scanner;

public class VerificacaoDiaUtil {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o dia da semana (em letras minúsculas): ");
        String dia = scanner.nextLine();

        switch (dia) {
            case "segunda":
            case "terca":
            case "terça":
            case "quarta":
            case "quinta":
            case "sexta":
                System.out.println(capitalize(dia) + " é um dia útil.");
                break;
            case "sabado":
            case "sábado":
            case "domingo":
                System.out.println(capitalize(dia) + " não é um dia útil.");
                break;
            default:
                System.out.println("Dia inválido.");
        }

        scanner.close();
    }

    // Método para deixar a primeira letra maiúscula
    public static String capitalize(String texto) {
        if (texto == null || texto.isEmpty()) return texto;
        return texto.substring(0, 1).toUpperCase() + texto.substring(1);
    }
}
