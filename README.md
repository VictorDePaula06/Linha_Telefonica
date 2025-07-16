# Sistema de Linha Telefônica (Rede Telemar)

Este projeto em Java simula um sistema básico de gerenciamento e cobrança para diferentes tipos de linhas telefônicas (fixa e móvel) de clientes, reminiscentes de uma "Rede Telemar". O sistema demonstra conceitos de Programação Orientada a Objetos (POO), como herança, polimorfismo e interfaces.

## ✨ Destaques do Projeto

* **Modelagem de Classes:** Representação de `Cliente`, `LinhaTelefonica` (abstrata), `Fixa` e `Movel` com suas características e comportamentos específicos.
* **Herança e Polimorfismo:** `Fixa` e `Movel` herdam de `LinhaTelefonica`, que implementa a interface `Consumo`, permitindo o cálculo polimórfico de custos.
* **Cálculo de Custos:** Lógica de negócios para calcular a fatura de cada tipo de linha com base nos minutos gastos e características específicas (franquia para fixa, plano de dados para móvel).
* **Estrutura Simples:** Um projeto conciso que foca na aplicação de princípios de POO para resolver um problema de negócio.

## 🚀 Tecnologias Utilizadas

* **Java** (Linguagem de Programação)

## 📁 Estrutura do Projeto

└── TRABALHO_AV2/
├── Cliente.java         # Define a classe Cliente
├── Consumo.java         # Interface para o cálculo de consumo
├── Fixa.java            # Implementa a lógica para Linhas Fixas
├── LinhaTelefonica.java # Classe abstrata base para linhas telefônicas
├── Movel.java           # Implementa a lógica para Linhas Móveis
└── Principal.java       # Ponto de entrada da aplicação com exemplos de uso


⚙️ Como Executar o Projeto

Para compilar e rodar este projeto:

1.  **Clone o repositório:**
    ```bash
    git clone [https://github.com/VictorDePaula06/Linha_Telefonica.git](https://github.com/VictorDePaula06/Linha_Telefonica.git) # Verifique se este é o link correto do seu repositório
    cd Linha_Telefonica
    ```
2.  **Compile os arquivos Java:**
    Navegue até a pasta `TRABALHO_AV2` no seu terminal e compile os arquivos `.java`
    ```bash
    javac *.java
    ```
3.  **Execute a aplicação:**
    Após a compilação, execute a classe `Principal`:
    ```bash
    java Principal
    ```

## 📈 Exemplo de Saída

Ao executar o programa, você verá um resultado similar a este (os valores podem variar ligeiramente dependendo dos dados de entrada):


Compreendi! Este é um projeto Java que simula um sistema de cobrança para uma "Rede Telemar", gerenciando diferentes tipos de linhas telefônicas (Fixa e Móvel) para clientes. Utiliza conceitos de herança e polimorfismo.

Aqui está um rascunho de um README.md para este projeto.

Markdown

# Sistema de Linha Telefônica (Rede Telemar)

Este projeto em Java simula um sistema básico de gerenciamento e cobrança para diferentes tipos de linhas telefônicas (fixa e móvel) de clientes, reminiscentes de uma "Rede Telemar". O sistema demonstra conceitos de Programação Orientada a Objetos (POO), como herança, polimorfismo e interfaces.

## ✨ Destaques do Projeto

* **Modelagem de Classes:** Representação de `Cliente`, `LinhaTelefonica` (abstrata), `Fixa` e `Movel` com suas características e comportamentos específicos.
* **Herança e Polimorfismo:** `Fixa` e `Movel` herdam de `LinhaTelefonica`, que implementa a interface `Consumo`, permitindo o cálculo polimórfico de custos.
* **Cálculo de Custos:** Lógica de negócios para calcular a fatura de cada tipo de linha com base nos minutos gastos e características específicas (franquia para fixa, plano de dados para móvel).
* **Estrutura Simples:** Um projeto conciso que foca na aplicação de princípios de POO para resolver um problema de negócio.

## 🚀 Tecnologias Utilizadas

* **Java** (Linguagem de Programação)

## 📁 Estrutura do Projeto

.
└── TRABALHO_AV2/
├── Cliente.java         # Define a classe Cliente
├── Consumo.java         # Interface para o cálculo de consumo
├── Fixa.java            # Implementa a lógica para Linhas Fixas
├── LinhaTelefonica.java # Classe abstrata base para linhas telefônicas
├── Movel.java           # Implementa a lógica para Linhas Móveis
└── Principal.java       # Ponto de entrada da aplicação com exemplos de uso


## ⚙️ Como Executar o Projeto

Para compilar e rodar este projeto:

1.  **Clone o repositório:**
    ```bash
    git clone [https://github.com/VictorDePaula06/Linha_Telefonica.git](https://github.com/VictorDePaula06/Linha_Telefonica.git) # Verifique se este é o link correto do seu repositório
    cd Linha_Telefonica
    ```
2.  **Compile os arquivos Java:**
    Navegue até a pasta `TRABALHO_AV2` no seu terminal e compile os arquivos `.java`
    ```bash
    javac *.java
    ```
3.  **Execute a aplicação:**
    Após a compilação, execute a classe `Principal`:
    ```bash
    java Principal
    ```

## 📈 Exemplo de Saída

Ao executar o programa, você verá um resultado similar a este (os valores podem variar ligeiramente dependendo dos dados de entrada):

+++++ REDE TELEMAR +++++

Nome do Cliente: Anderson
Endereco: Rua Apolo, Pavuna, Número: 343

====== Linha Fixa =====
Número: 3333-3333
Quantidade de Minutos Gastos: 35
Valor a pagar: R$45.25

====== Linha Móvel =====
Número: 99999-9999
Quantidade de Minutos Gastos: 235
Plano de dados Habilitados: true
Valor a pagar: R$87.0

+++++ REDE TELEMAR +++++

Nome do Cliente: Alexia
Endereco: Rua Sargento Antônio ernesto, Pavuna, Número: 632

====== Linha Fixa =====
Número: 4444-44444
Quantidade de Minutos Gastos: 28
Valor a pagar: R$45.0

====== Linha Móvel =====
Número: 98888-8888
Quantidade de Minutos Gastos: 285
Plano de dados Habilitados: false
Valor a pagar: R$57.0


## ✉️ Contato

* **João Victor de Paula**
* www.linkedin.com/in/joaovictor0611
* J.17jvictor@gmail.com
