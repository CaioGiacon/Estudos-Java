# 📊 Análise de Dados de Pessoas (Vetores de Objetos)

Este projeto é uma aplicação de console em Java responsável por ler os dados físicos (nome, idade e altura) de um número determinado de pessoas. Após a coleta, o sistema processa a altura média do grupo, calcula a porcentagem de indivíduos com menos de 16 anos e lista seus respectivos nomes. 

## 🧠 Aprendizados e Conceitos Aplicados

Este código elevou a complexidade do gerenciamento de memória e fluxo de dados, consolidando as seguintes práticas para o desenvolvimento de software corporativo:

* **Vetores de Objetos (Reference Types):** Compreensão prática de que instanciar um array de classes (`new Person[numberOfPeople]`) aloca apenas os espaços de memória contendo referências nulas. O código demonstra a necessidade de instanciar cada objeto individualmente (`new Person(...)`) dentro do laço `for` para preencher as posições da estrutura.
* **Encapsulamento e Coleções:** Acesso aos dados encapsulados utilizando os métodos `getAge()`, `getHeight()` e `getName()` para extrair informações da entidade e realizar validações matemáticas na classe `Main`, sem ferir a integridade da classe de domínio.
* **Conversão de Tipos (Casting Explícito):** Aplicação do modificador `(double)` durante o cálculo de porcentagem (`(double)minorData / numberOfPeople`). Isso garante que a divisão entre duas variáveis inteiras seja processada como ponto flutuante, evitando o truncamento (perda) das casas decimais antes da multiplicação final.
* **Gestão do Buffer de Entrada:** Utilização estratégica do comando `sc.nextLine()` logo após a leitura de números (`nextInt()` e `nextDouble()`) para limpar a quebra de linha residual do terminal, prevenindo bugs ao ler as variáveis do tipo String (nomes).

## 🧮 A Lógica Matemática

A aplicação processa dois cálculos fundamentais que dependem das variáveis acumuladoras alimentadas iterativamente pelo laço de repetição:

**1. Média de Altura:**
$$Media = \frac{\sum Alturas}{vect.length}$$

**2. Porcentagem de Menores de 16 Anos:**
$$Percentual = \left( \frac{Menores}{Total} \right) \times 100$$

## 🛠️ Estrutura do Código

O projeto está organizado com foco em separação de responsabilidades e alta coesão:

* `application/Main.java`: Ponto de entrada do sistema. Centraliza a interação com o usuário (`Scanner` com `Locale.US`), controla a alocação do vetor, gerencia os laços de repetição e processa a lógica matemática.
* `entities/Person.java`: Classe de domínio que representa a entidade Pessoa, mantendo os atributos protegidos (`private`) e disponibilizando os métodos de acesso padrão (`getters` e `setters`).

---
**Autor:** Caio Giacon