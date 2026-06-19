Operador(es) Operação(ões) Ordem de avaliação (precedência)
* Multiplicação Avaliado primeiro. Se houver vários operadores desse tipo, eles são avaliados 
da esquerda para a direita. 
/ Divisão
% Resto
+ Adição Avaliado em seguida. Se houver vários operadores desse tipo, eles são 
    avaliados da esquerda para a direita.
- Subtração
= atribuição - avaliado por ultimo

Eis um exemplo da equação de uma linha reta:
Álgebra: y = mx + b 
Java: y = m * x + b;

Exemplo de expressões algébricas e Java
Agora vamos considerar várias expressões à luz das regras de precedência de operador. Cada exemplo lista uma expressão algébrica e seu equivalente Java. O seguinte é de uma média aritmética dos cinco termos:
Álgebra: m = ___a + b + c + d + e__ 
                      5
Java: m = (a + b + c + d + e) / 5;

O seguinte exemplo contém operações de resto (%), multiplicação, divisão, adição e subtração:
Álgebra: z = pr%q + w/x – y
java = z = p * r % q