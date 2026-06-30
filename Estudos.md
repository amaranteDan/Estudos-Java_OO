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

Esse conjunto de arquivos é um ótimo exemplo introdutório ao conceito de **Orientação a Objetos (OO)** em Java. Trata-se de um único exercício dividido em duas partes fundamentais: a **Classe Entidade** (`Product`) e a **Classe de Aplicação/Principal** (`Program`).

Abaixo está a explicação detalhada de como cada uma delas funciona e como interagem.

---

### 1. A Classe `Product.java` (A Entidade)

Esta classe funciona como um "molde" (ou modelo) para representar produtos dentro do sistema. Ela define as características que um produto possui e o que ele é capaz de fazer.

* **Atributos (Variáveis de Instância):**
* `public String name;` -> Armazena o nome do produto (ex: "Laptop").
* `public double price;` -> Armazena o preço unitário do produto (ex: 2500.00).
* `public int quantity;` -> Armazena a quantidade atual desse produto em estoque.


* **Métodos (Funções / Comportamentos):**
* `totalValueInStock()`: Calcula o valor total financeiro daquele produto em estoque multiplicando o preço pela quantidade (`price * quantity`).
* `addProducts(int quantity)`: Recebe uma quantidade via parâmetro e adiciona ao estoque existente utilizando o operador acumulador (`this.quantity += quantity`).
* `removeProducts(int quantity)`: Recebe uma quantidade e subtrai do estoque atual (`this.quantity -= quantity`).
* `toString()`: Este método é muito especial. Ele sobrescreve o comportamento padrão do Java para quando mandamos imprimir o objeto. Em vez de mostrar um código estranho na tela (como `Product@1a2b3c`), ele devolve o texto formatado lindamente com o Nome, Preço (com 2 casas decimais), Quantidade e o Valor Total em estoque calculando dinamicamente.



---

### 2. A Classe `Program.java` (O Controle)

Esta classe contém o método `main`, que é a porta de entrada para a execução do programa. Ela dita o fluxo de interação com o usuário (leitura de dados e exibição de resultados).

* **Configurações Iniciais:**
* `Locale.setDefault(Locale.US);` -> Configura o programa para aceitar o formato de ponto flutuante americano (separado por ponto `.` em vez de vírgula `,`, como `2.50`).
* `Scanner sc = new Scanner(System.in);` -> Cria o objeto para ler o teclado.


* **Fluxo do Exercício:**
1. **Instanciação:** `Product product = new Product();` cria um objeto real na memória a partir do molde `Product`.
2. **Entrada de Dados do Produto:** O programa solicita e armazena os valores digitados diretamente nos atributos públicos do objeto criado (`product.name`, `product.price`, `product.quantity`).
3. **Adição de Estoque:** O programa pergunta quantos itens deseja adicionar. Ele lê esse número inteiro e chama a função `product.addProducts(quantity);`. Internamente, a classe `Product` atualiza sua própria quantidade.
4. **Exibição dos Dados Atualizados:** Ao fazer `System.out.println("Updated data: " + product);`, o Java chama implicitamente o método `toString()` que explicamos acima, imprimindo a linha formatada com os valores recalculados.
5. **Remoção de Estoque:** O mesmo processo acontece para a remoção: o usuário digita um número, o método `product.removeProducts(quantity);` é chamado para diminuir o estoque, e os dados finais são mostrados na tela.
6. **Encerramento:** `sc.close();` fecha o leitor de teclado para liberar recursos do sistema.



### Resumo da Interação

O objetivo principal deste exercício é mostrar o encapsulamento de lógica: a classe `Program` não sabe *como* calcular o estoque ou *como* somar os produtos; ela apenas coleta os dados da tela e pede para o objeto `product` realizar as operações. Isso torna o código organizado, modular e fácil de manter!