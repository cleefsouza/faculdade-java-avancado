# Mini Projeto 001
## Prof: Thiago Rodrigues Medeiros
## Aluno: Aryosvalldo Cleef de Souza

A. Depois de criar as classes do diagrama (UML.jpg) com seus atributos encapsulados e métodos, crie uma classe principal com o método main() e desenvolva a lógica a seguir:
B. O Sistema deverá possuir um menu para cadastro de contas, listagem das contas e acessar uma conta.

----------------------------------------
> Gerenciamento de Contas
>> 1 – Cadastrar Conta
>> 2 – Listar Contas
>> 3 – Acessar uma Conta
>> 4 – Sair
----------------------------------------

1. No item 1 do menu, deverá ser pedido todos os dados para cadastrar uma conta e adicionar essa conta criada em uma agência.
2. No item 2 do menu, deverá ser listada todas as contas da agência.
2.1. Se a agência não possuir nenhuma conta exibir uma mensagem ao usuário
3. No item 3 do menu, deverá ser pedido o número de determinada conta para que se possa realizar as suas operações. Essas operações deverão ser descritas em outro menu.
3.1. Se não existir uma conta com o número informado deverá ser retornado uma mensagem avisando esse erro ao usuário.
4. No item 4 do menu, o sistema deverá encerrar o programa e exibir a mensagem. Obrigado por utilizar o banco “Unipê Bank”.

C. Todas as contas devem pertencer a uma única Agência. Dessa forma uma agência deve ser criada no início do programa e todas as contas criadas devem ser adicionadas a ela.
D. O menu de acesso a uma conta deverá possuir as opções abaixo:

----------------------------------------
> Conta nº: 45254
>> 1 – Realizar Saque
>> 2 – Realizar Deposito
>> 3 – Realizar Transferência
>> 4 – Extrato Bancário
>> 5 – Sair
----------------------------------------

1. No item 1 do menu, deverá ser pedido um valor de saque e efetuar essa operação na conta escolhida.
1.1. Se o valor do saque for maior que o saldo da conta uma mensagem deverá ser exibida ao usuário informando esse erro.
2. No item 2 do menu, deverá ser pedido um valor de deposito e efetuar essa operação na conta escolhida.
3. No item 3 do menu, deverá ser pedido um valor de transferência e o número de uma conta e efetuar essa operação na conta escolhida.
3.1. Depois do número da conta que receberá a transferência for digitado, será necessário pesquisar na agência se a conta existe. Se a conta não existir, uma mensagem deverá ser exibida ao usuário informando essa situação.
4. No item 4 do menu, deverá ser exibida todas as movimentações realizadas na conta escolhida.
5. No item 5 do menu, o sistema deverá voltar para o menu gerenciamento de contas.

E. A cada momento que o usuário realizar um saque, deposito ou transferência, um movimento deve ser criado e adicionado no ArrayList de movimentos da conta.
F. Encontre duas exceções que podem ocorrer durante a execução do programa e crie classes personalizadas para exceções herdando de exception. Depois trate as mesmas dentro do código.