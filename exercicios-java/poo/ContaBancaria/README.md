
🏦 Exercício: Conta Bancária
Descrição

Este programa em Java cria uma classe ContaBancaria com os atributos titular e saldo.
A classe possui métodos para:

depositar(double valor) → adiciona o valor informado ao saldo da conta e exibe uma mensagem de confirmação.

sacar(double valor) → subtrai o valor informado do saldo, se houver saldo suficiente, ou exibe mensagem de saldo insuficiente.

mostrarSaldo() → exibe o nome do titular e o saldo atual da conta.

No programa principal (Main), são criados objetos do tipo ContaBancaria e chamados seus métodos para demonstrar depósitos, saques e exibição de saldo.

✅ Casos de Teste
Ação no programa	Saída esperada
Criar conta: titular "João", saldo 500	
mostrarSaldo()	"Nome: João"
"Saldo: 500.0"
depositar(100) + mostrarSaldo()	"Depósito realizado. Saldo atualizado com sucesso!"
"Nome: João"
"Saldo: 600.0"
sacar(900) + mostrarSaldo()	"Saldo insuficiente, tente novamente"
"Nome: João"
"Saldo: 600.0"
Criar conta: titular "Maria", saldo 1000	
mostrarSaldo()	"Nome: Maria"
"Saldo: 1000.0"
depositar(100) + mostrarSaldo()	"Depósito realizado. Saldo atualizado com sucesso!"
"Nome: Maria"
"Saldo: 1100.0"
sacar(900) + mostrarSaldo()	"Saque realizado. Saldo atualizado com sucesso!"
"Nome: Maria"
"Saldo: 200.0"