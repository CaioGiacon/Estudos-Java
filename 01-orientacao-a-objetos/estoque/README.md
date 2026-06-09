# 📦 Controle de Estoque de Produtos

Este é um mini projeto de aplicação em console desenvolvido em Java, criado para gerenciar os dados de um produto (nome, preço e quantidade) e controlar as entradas e saídas do estoque. O exercício faz parte da minha evolução técnica no Curso de Java Completo (Nélio Alves - Udemy), aprofundando os pilares da Orientação a Objetos.

## 🧠 Aprendizados e Conceitos Aplicados

Diferente dos exercícios anteriores, este projeto exigiu uma modelagem de domínio mais robusta, aplicando regras rigorosas de proteção e inicialização de dados:

* **Construtores e Sobrecarga:** Implementação de múltiplos construtores na classe `Product`. Isso permite a flexibilidade de instanciar o objeto fornecendo os três dados iniciais (nome, preço e quantidade) ou apenas o nome e o preço (iniciando a quantidade zerada por padrão).
* **Encapsulamento:** Proteção do estado interno do objeto. Os atributos (`name`, `price`, `quantity`) foram definidos como `private`, garantindo que não possam ser alterados indevidamente de fora da classe. O acesso a eles passou a ser controlado por métodos `getters` e `setters`.
* **Regras de Negócio na Entidade:** A lógica de adicionar (`addProducts`) e remover (`removeProduct`) itens não fica solta no programa principal. Ela pertence ao próprio Produto, garantindo alta coesão.
* **Sobrescrita do método `toString()`:** Personalização da forma como o objeto é convertido para texto. Em vez de imprimir a referência de memória padrão do Java, o objeto agora retorna uma string formatada e amigável com seus dados e o valor total em estoque.

## 🛠️ Estrutura do Código

A aplicação é dividida da seguinte forma:

* `aplicattion/Main.java`: Ponto de entrada do sistema. Responsável por interagir com o usuário via terminal (utilizando `Scanner`), instanciar o produto e testar as operações de entrada e saída de estoque.
* `entities/Product.java`: A classe de domínio que representa a entidade Produto, contendo o encapsulamento dos dados e os métodos de cálculo e atualização de estoque.

---
**Autor:** Caio Giacon
