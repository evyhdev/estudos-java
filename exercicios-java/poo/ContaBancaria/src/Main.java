class ContaBancaria{
    String titular;
    double saldo;

    void depositar (double valor){
        saldo += valor;
        System.out.println("Depósito realizado. Saldo atualizado com sucesso!");
    }

    void sacar (double valor){
        if (saldo >= valor){
        saldo -= valor;
        System.out.println("Saque realizado. Saldo atualizado com sucesso!");
        } else {
            System.out.println("Saldo insuficiente, tente novamente");
        }
    }
    void mostrarSaldo (){
        System.out.println("Nome: " + titular + "\nSaldo: " + saldo);
    }

}

public class Main{
    public static void main (String[] args){
        ContaBancaria c1 = new ContaBancaria();
        c1.titular = "João";
        c1.saldo = 500;

        ContaBancaria c2 = new ContaBancaria();
        c2.titular = "Maria";
        c2.saldo = 1000;

        c1.mostrarSaldo();
        c1.depositar(100);
        c1.mostrarSaldo();
        c1.sacar(900);
        c1.mostrarSaldo();

        c2.mostrarSaldo();
        c2.depositar(100);
        c2.mostrarSaldo();
        c2.sacar(900);
        c2.mostrarSaldo();

    }
}