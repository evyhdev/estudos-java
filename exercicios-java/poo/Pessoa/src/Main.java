class Pessoa{
    String nome;
    int idade;

    void apresentar(){
       System.out.println("Olá, meu nome é " + nome + " e tenho " + idade + " anos.");
    }

    void fazerAniversario(){
        System.out.println("Feliz Aniversário!" + idade++);
    }
}

public class Main{
    public static void main (String[] args){
        Pessoa p1 = new Pessoa();
        Pessoa p2 = new Pessoa();
        p1.nome = "João";
        p1.idade = 20;
        p2.nome = "Maria";
        p2.idade = 25;

        p1.apresentar();
        p1.fazerAniversario();
        p2.apresentar();
        p2.fazerAniversario();
        p1.apresentar();
        p2.apresentar();

    }
}