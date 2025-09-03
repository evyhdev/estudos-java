import java.util.Scanner;
public class Program {
    public static void main(String[] args) throws Exception {
       int valor = 50;
       int mes;
       int total = 0;
        try (Scanner sc = new Scanner (System.in)) {
            mes = sc.nextInt();
            total = valor * mes;
            System.out.println(total);
        }
    }
}
