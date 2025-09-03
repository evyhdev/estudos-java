import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        int pagPorDia = 3;
        int paginas = 0;
        int dias = 0;

        try (Scanner sc = new Scanner(System.in)) {
            paginas = sc.nextInt();
            dias = paginas / pagPorDia;

            if (paginas % pagPorDia != 0) {
                dias += 1; 
            }

            System.out.print(dias + " dias");
        }
    }
}
