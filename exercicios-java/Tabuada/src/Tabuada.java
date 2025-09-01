import java.util.Scanner;
public class Tabuada {
    public static void main (String[] args) {
        int tabuada;
        System.out.println("Digite um número para ver a tabuada: ");
        try (Scanner sc = new Scanner(System.in)) {
            tabuada = sc.nextInt();

            for (int i = 1; i <= 10; i++) {
                System.out.println(tabuada + " x " + i + " = " + (tabuada*i));
        }
    }
    }
}

