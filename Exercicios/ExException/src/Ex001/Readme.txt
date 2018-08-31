Exercicío:

Considere o problema de conversão de temperaturas entre Celsius e Fahrenheit em
Java.

a) Crie duas exceções, TemperatureException que herda de Exception e
FahrenheitException que herda de TemperatureException.
b) Crie uma classe utilitária (Utils) com um método para converter temperaturas em
graus Fahrenheit para graus Celsius (toCelsius()), ambas representadas em pontoflutuante
(double). Porém, caso o valor a ser convertido seja menor que zero
absoluto (-459,67°F) deve-se lançar a exceção FahrenheitException. A formula para
conversão é dada por: C = 5 (f - 32) / 9