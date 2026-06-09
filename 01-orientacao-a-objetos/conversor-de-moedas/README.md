# 💵 Conversor de Moedas (com IOF)

Uma aplicação simples de console em Java projetada para ler a cotação do dólar, a quantidade de dólares a ser comprada e calcular o valor final a ser pago em reais. Este projeto faz parte dos meus estudos no Curso de Java Completo (Nélio Alves - Udemy) e marca a introdução aos conceitos de membros estáticos (Static) na linguagem.

## 🧠 Aprendizados e Conceitos Aplicados

Diferente do exercício de cálculo de área (onde cada entidade possuía seu próprio estado e precisava ser instanciada), este projeto abordou o conceito de **Classes Utilitárias**:

* **Membros Estáticos (`static`):** Utilização de atributos e métodos estáticos na classe `CurrencyConverter`. Compreensão prática de que membros estáticos pertencem à classe como um todo e não a uma instância específica.
* **Acesso Direto:** Dispensa do uso da palavra-chave `new` para instanciar objetos. Os métodos e valores são chamados diretamente pelo nome da classe na `Main` (ex: `CurrencyConverter.dolarPrice`).
* **Formatação de Saída:** Uso do `String.format("%.2f%n", ...)` para garantir a exibição correta de duas casas decimais no valor financeiro final.

## 🧮 A Lógica Matemática

A classe utilitária é responsável por duas operações matemáticas simples. Primeiro, ela calcula o valor bruto da conversão multiplicando o preço do dólar pela quantidade desejada. Em seguida, aplica uma taxa fixa de **6%** referente ao IOF (Imposto sobre Operações Financeiras) do Brasil.

O cálculo encapsulado no método `rawMoeny()` pode ser representado pela seguinte fórmula:

$$ValorFinal = (Preco \times Quantidade) + ((Preco \times Quantidade) \times \frac{6}{100})$$

## 🛠️ Estrutura do Código

A aplicação segue separada em pacotes lógicos:

* `aplicattion/Main.java`: Ponto de entrada. Configura o `Locale.US` para o padrão americano de pontuação, coleta os dados do usuário via `Scanner` e imprime o resultado formatado.
* `entities/CurrencyConverter.java`: Classe utilitária estática. Armazena as variáveis da cotação e quantidade, além de abrigar as regras de negócio para a conversão de moeda e o acréscimo da taxa de IOF.

---
**Autor:** Caio Giacon
