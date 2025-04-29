import java.util.Scanner;

public class ValidacaoSenha {
    public static void main(String[] args) {
        String senhaCorreta = "123456";
        String senhaDigitada;
        int tentativas = 0;
        int maxTentativas = 3;
        Scanner scanner = new Scanner(System.in);

        while (tentativas < maxTentativas) {
            System.out.println("Tentativa " + (tentativas + 1) + ": Digite a senha:");
            senhaDigitada = scanner.nextLine();
            tentativas++;

            if (senhaDigitada.equals(senhaCorreta)) {
                System.out.println("Senha correta! Acesso concedido.");
                break; 
            } else {
                System.out.println("Senha incorreta. Tente novamente.");
            }
        }

        if (tentativas == maxTentativas) {
            System.out.println("Número máximo de tentativas excedido. Acesso bloqueado.");
        }

        scanner.close();
    }
}