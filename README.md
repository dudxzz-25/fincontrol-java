# FinControl Java

<p align="center">
  <img alt="Java" src="https://img.shields.io/badge/Java-OOP-ED8B00?logo=openjdk&logoColor=white">
  <img alt="CSV" src="https://img.shields.io/badge/CSV-Persistence-217346">
  <img alt="CLI" src="https://img.shields.io/badge/CLI-Banking-555555">
  <a href="https://github.com/dudxzz-25/fincontrol-java/actions/workflows/ci.yml"><img alt="Build" src="https://github.com/dudxzz-25/fincontrol-java/actions/workflows/ci.yml/badge.svg"></a>
</p>


[![Build](https://github.com/dudxzz-25/fincontrol-java/actions/workflows/ci.yml/badge.svg)](https://github.com/dudxzz-25/fincontrol-java/actions/workflows/ci.yml)

Sistema bancário de terminal desenvolvido em **Java**, criado para aplicar conceitos de Programação Orientada a Objetos e persistência simples em CSV.

## ✨ Funcionalidades

- criação de contas;
- depósito;
- saque;
- transferência entre contas;
- listagem de contas;
- persistência automática em `data/accounts.csv`;
- diferenciação entre conta corrente e poupança.

## 🛠️ Conceitos aplicados

**Java · POO · Encapsulamento · Herança · Polimorfismo · Exceções · Persistência em CSV**

## 🧩 Estrutura

```text
fincontrol-java/
├── data/
│   └── accounts.csv
├── src/com/eduardo/fincontrol/
│   ├── Account.java
│   ├── Bank.java
│   ├── CheckingAccount.java
│   ├── CsvRepository.java
│   ├── Main.java
│   └── SavingsAccount.java
├── sql/
│   └── schema.sql
├── build.sh
└── README.md
```

O arquivo `sql/schema.sql` apresenta uma modelagem relacional equivalente para uma futura migração da persistência CSV para banco de dados.

## ▶️ Compilar e executar

### Linux/macOS

```bash
./build.sh
java -cp out com.eduardo.fincontrol.Main
```

### Windows PowerShell

```powershell
javac -d out src/com/eduardo/fincontrol/*.java
java -cp out com.eduardo.fincontrol.Main
```

## 🧠 O que este projeto demonstra

- modelagem orientada a objetos;
- separação entre domínio e persistência;
- manipulação de arquivos;
- tratamento de erros;
- fluxo de operações bancárias por CLI;
- organização de código Java em pacotes.

## ⚠️ Limitações

O projeto utiliza CSV para manter a execução simples e educacional. Não há autenticação, concorrência, banco transacional ou tratamento financeiro com `BigDecimal`, itens que seriam importantes em um sistema real.

---

Desenvolvido por **Eduardo de Toledo Dias**.

[Portfólio](https://dudxzz-25.github.io/portfolio-web/) · [GitHub](https://github.com/dudxzz-25) · [LinkedIn](https://www.linkedin.com/in/eduardo-de-toledo-dias-880b9834b/)