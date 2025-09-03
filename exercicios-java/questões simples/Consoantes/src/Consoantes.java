import java.util.Scanner;

public class Consoantes {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            String[] consoantes = new String[6]; 
            int count = 0; 

            for (int i = 0; i < 6; i++) {
                System.out.print("Digite uma letra: ");
                String letra = sc.next();

                if (!letra.equalsIgnoreCase("a") &&
                    !letra.equalsIgnoreCase("e") &&
                    !letra.equalsIgnoreCase("i") &&
                    !letra.equalsIgnoreCase("o") &&
                    !letra.equalsIgnoreCase("u")) {
                    consoantes[i] = letra; 
                    count++;
                } else {
                    consoantes[i] = null;
                }
            }

            System.out.print("Consoantes digitadas: ");
            for (String c : consoantes) {
                if (c != null) {
                    System.out.print(c + " ");
                }
            }

            System.out.println("Quantidade de consoantes: " + count);
        }
    }
}
