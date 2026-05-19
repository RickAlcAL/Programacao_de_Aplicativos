# 📦 Gerenciador de Produtos - Programação de Aplicativos

[![License](https://img.shields.io/github/license/RickAlcAL/Programacao_de_Aplicativos)](LICENSE)
[![Java](https://img.shields.io/badge/Java-ED8B00?style=flat&logo=openjdk&logoColor=white)](https://www.oracle.com/java/)

Este repositório contém o projeto prático desenvolvido para a disciplina de **Programação de Aplicativos**. O objetivo principal é criar um sistema robusto e intuitivo para o cadastro, gerenciamento e visualização de produtos, aplicando conceitos de Orientação a Objetos (POO), arquitetura de software e boas práticas na linguagem Java.

---

## 🚀 Funcionalidades Principais

- **Cadastro de Produtos:** Inclusão de novos produtos com informações detalhadas (Nome, Categoria, Preço, Código, Quantidade em Estoque, etc.).
- **Listagem e Busca:** Visualização de todos os itens cadastrados com suporte a filtros e pesquisas dinâmicas.
- **Atualização e Remoção (CRUD):** Controle total sobre o inventário de produtos.
- **Validação de Dados:** Regras de negócio integradas para garantir a consistência das informações inseridas no sistema.

---

## 🛠 Tecnologias e Ferramentas

O projeto foi construído utilizando o ambiente Java:

- **Linguagem Principal:** Java (JDK [Insira a versão aqui, ex: 17 ou 21])
- **Interface Gráfica (se aplicável):** [Ex: JavaFX / Swing / AWT / Apenas Console]
- **IDEs Recomendadas:** IntelliJ IDEA / Eclipse / NetBeans / VS Code

---

## ⚙️ Como Executar o Projeto

### Pré-requisitos
Antes de começar, certifique-se de ter instalado em sua máquina:
- [Git](https://git-scm.com)
- [Java Development Kit (JDK)](https://www.oracle.com/java/technologies/downloads/) configurado nas variáveis de ambiente.

### Passo a Passo

```bash
# 1. Clone este repositório
$ git clone [https://github.com/RickAlcAL/Programacao_de_Aplicativos.git](https://github.com/RickAlcAL/Programacao_de_Aplicativos.git)

# 2. Acesse a pasta do projeto
$ cd Programacao_de_Aplicativos/Programacao_de_Aplicativos

# 3. Se o seu projeto usa Maven para compilar:
$ mvn clean package
$ java -jar target/[nome-do-arquivo].jar

# 3.1. Caso seja um projeto Java simples (sem Maven/Gradle), compile os arquivos:
$ javac -d bin src/**/*.java

# 4. Execute a classe principal (substitua Main pelo nome da sua classe principal)
$ java -cp bin Main
