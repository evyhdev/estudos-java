//criando a classe Produto
class Produto {
    String nome; //definindo atributos
    double preco;

    //metodo para mostrar informações do produto
    void mostrarInfo() {
        System.out.println("Produto: " + nome + ", Preço: " + preco);
    }

    //metodo para atualizar o preço
    void atualizarPreco(double novoPreco) {
        if (novoPreco >= 0) {
            preco = novoPreco;
        } else {
            System.out.println("Preço inválido. O preço deve ser maior ou igual a zero.");
        }
    }
}
//classe principal
public class Main {
    public static void main(String[] args) {
        Produto p1 = new Produto();
        Produto p2 = new Produto();

        //atribuindo valores
        p1.nome = "Notebook";
        p1.preco = 2500.00;
        p2.nome = "Smartphone";
        p2.preco = 2000.00;

        //mostrando informações
        p1.mostrarInfo();
        p2.mostrarInfo();

        //atualizando preço
        p1.atualizarPreco(2600.00);
        p2.atualizarPreco(-500); //teste do preço inválido

        //mostrando informações atualizadas
        p1.mostrarInfo();
        p2.mostrarInfo();
    }
}
