Exercicío:

Considere os problemas de saque e deposito em uma conta bancaria.

a) Crie uma classe conta com os atributos saldo, limite e número.
Também implemente os métodos sacar (decrementa determinado valor do saldo), depositar (incrementa determinado valor no saldo)
e obterSaldo (acessa o valor do saldo encapsulado).

b) Crie duas Exceções, SaldoNegativoException e ValorException. Ambas devem herdar da classe Exception.

c) Reescreva os métodos sacar e depositar da classe conta, lançando uma exceção SaldoNegativoException se o valor
do saque for maior que o saldo em conta corrente e lançando um ValorException se o valor do deposito for menor ou igual a zero.

d) Teste os métodos para ver se as exceções estão sendo lançadas e trate-as.