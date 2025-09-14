🛒 Exercício: Produto
Descrição

Este programa em Java cria uma classe Produto com os atributos nome e preco.
A classe possui métodos para:

mostrarInfo() → exibe no console o nome e o preço do produto.

atualizarPreco(double novoPreco) → atualiza o preço do produto se o valor for maior ou igual a zero; caso contrário, exibe uma mensagem de preço inválido.

No programa principal (Main), são criados objetos do tipo Produto, atribuídos valores iniciais, exibidas as informações, atualizados os preços e exibidas as informações atualizadas.

✅ Casos de Teste
Ação no programa	Saída esperada
Criar produto: "Notebook", 2500.00	"Produto: Notebook, Preço: 2500.0"
Criar produto: "Smartphone", 2000.00	"Produto: Smartphone, Preço: 2000.0"
Atualizar preço p1 para 2600.00	Nenhuma mensagem de erro
Atualizar preço p2 para -500	"Preço inválido. O preço deve ser maior ou igual a zero."
Mostrar informações atualizadas de p1	"Produto: Notebook, Preço: 2600.0"
Mostrar informações atualizadas de p2	"Produto: Smartphone, Preço: 2000.0"