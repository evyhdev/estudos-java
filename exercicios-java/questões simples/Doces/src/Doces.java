import java.util.Scanner;
public class Doces {
    public static void main(String[] args) throws Exception {
        int dinheiro = 0;
        try ( Scanner sc = new Scanner (System.in)) {
            dinheiro = sc.nextInt();
            int doces = dinheiro * 2;
            System.out.println("O cliente obteve:" + doces + " doces");
        }
    }
}
