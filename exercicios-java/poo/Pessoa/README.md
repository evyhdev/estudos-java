🧑‍🤝‍🧑 Exercício: Pessoa
Descrição

Este programa em Java cria uma classe Pessoa com os atributos nome e idade.
A classe possui métodos para:

apresentar() → exibe no console uma mensagem com o nome e a idade da pessoa.

fazerAniversario() → incrementa a idade em 1 e exibe uma mensagem de feliz aniversário.

No programa principal (Main), são criados objetos do tipo Pessoa e chamados seus métodos para demonstrar apresentações e aniversários.

✅ Casos de Teste
Ação no programa	Saída esperada
Criar pessoa: p1.nome = "João", p1.idade = 20	
Criar pessoa: p2.nome = "Maria", p2.idade = 25	
p1.apresentar()	"Olá, meu nome é João e tenho 20 anos."
p1.fazerAniversario()	"Feliz Aniversário!20"
p2.apresentar()	"Olá, meu nome é Maria e tenho 25 anos."
p2.fazerAniversario()	"Feliz Aniversário!25"
p1.apresentar()	"Olá, meu nome é João e tenho 21 anos."
p2.apresentar()	"Olá, meu nome é Maria e tenho 26 anos."