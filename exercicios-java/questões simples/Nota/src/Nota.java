import java.util.Scanner;

public class Nota {
    public static void main(String[] args) {
        int nota;

        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Digite a nota (0 a 10): ");
            nota = sc.nextInt();

            while (nota > 10 || nota < 0) {
                System.out.println("Nota inválida, digite novamente:");
                nota = sc.nextInt();
            }
        }

        System.out.println("Nota válida: " + nota);
    }
}
