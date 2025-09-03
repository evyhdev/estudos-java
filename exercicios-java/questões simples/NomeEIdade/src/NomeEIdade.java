import java.util.Scanner;

public class NomeEIdade {
    public static void main(String[] args) {
        String nome;
        int idade;

        try (Scanner scanner = new Scanner(System.in)) {
            while (true) {
                System.out.print("Nome: ");
                nome = scanner.nextLine();

                if (nome.equals("0")) {
                    break;
                }

                System.out.print("Idade: ");
                idade = scanner.nextInt();
                scanner.nextLine();
                System.out.println("Nome: " + nome + ", Idade: " + idade);
            }
        }
        System.out.println("Programa encerrado.");
    }
}
