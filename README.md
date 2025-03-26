<h1 align="center">
    <a href="#"> PCMania - Sistema de Compras de Computadores</a>
</h1>

<h3 align="center">
     Sistema para venda de computadores com carrinho de compras 
</h3>

<p align="center">
<img alt="Java" src="https://img.shields.io/badge/-Java-007396?style=flat&logo=java&logoColor=white">
  <img alt="GitHub repo size" src="https://img.shields.io/github/repo-size/generoso28/pcMania">
    
  <a href="https://github.com/generoso28/pcMania/commits/master">
    <img alt="GitHub last commit" src="https://img.shields.io/github/last-commit/generoso28/pcMania">
  </a>
    
  <a href="https://github.com/generoso28/pcMania/stargazers">
    <img alt="Stargazers" src="https://img.shields.io/github/stars/generoso28/pcMania?style=social">
  </a>
  <a href="https://github.com/generoso28/">
  <img alt="Feito por Generoso" src="https://img.shields.io/badge/feito%20por-Generoso-%237519C1">
  </a>
</p>

<h4 align="center">
	 🚀 Concluído  
</h4>

---

## 📌 Tabela de Conteúdos
- [📖 Sobre o Projeto](#sobre-o-projeto)
  - [⚙️ Funcionalidades](#funcionalidades)
  - [📐 Diagrama de Classes](#diagrama-de-classes)
  - [🛠 Tecnologias](#tecnologias)
  - [👨‍💻 Autor](#autor)

---

## 📖 Sobre o projeto

O **PCMania** é um sistema de compras de computadores que permite ao usuário visualizar promoções, adicionar computadores ao carrinho e finalizar a compra.

Este projeto foi desenvolvido durante a disciplina de **Programação Orientada a Objetos**, ministrada pelo professor **Christopher de Souza Lima**.

---

## ⚙️ Funcionalidades

✅ Exibe computadores disponíveis na promoção.  
✅ Adiciona computadores ao carrinho de compras.  
✅ Exibe os computadores no carrinho, o total da compra e os dados do cliente.  

---

## 📐 Diagrama de Classes

```mermaid
classDiagram
    Cliente "1" -- "*" Computador : compra
    Computador "1" -- "0..1" MemoriaUSB : possui
    Computador "*" -- "*" HardwareBasico : tem
    Computador "1" -- "1" SistemaOperacional : tem

    class Cliente {
        + nome : String
        + cpf : String
        + calculaTotalCompra() : float
    }

    class Computador {
        + marca : String
        + preco : float
        + mostraPCConfigs()
        + addMemoriaUSB(musb : MemoriaUSB)
        + addHardware(hardware : HardwareBasico)
    }

    class HardwareBasico {
        + nome : String
        + capacidade : float
    }

    class MemoriaUSB {
        + nome : String
        + capacidade : int
    }
class SistemaOperacional {
        + nome : String
        + tipo : String
    }

````
## 🛠 Tecnologias

As seguintes ferramentas foram usadas na construção do projeto:

#### **Utilitários**

-   Editor:  **[Intellij Ultimate]([https://www.jetbrains.com/idea/])**

---
  
## 🦸 Autores
<a>
 <img style="border-radius: 50%;" src="https://avatars3.githubusercontent.com/u/131410501?s=460&u=61b426b901b8fe02e12019b1fdb67bf0072d4f00&v=4" width="100px;" alt=""/>
 <br />
 <sub><b>Lucas Generoso</b></sub></a> <a>🚀</a>
 <br />
 
[![Linkedin Badge](https://img.shields.io/badge/%40-Lucas_Generoso-blue?style=flat-square&logo=Linkedin&logoColor=white&link=https://www.linkedin.com/in/lucascgeneroso/)](https://www.linkedin.com/in/lucascgeneroso/) 
[![Gmail Badge](https://img.shields.io/badge/-lucas.generoso@ges.inatel.br-c14438?style=flat-square&logo=Gmail&logoColor=white&link=mailto:lucas.generoso@alunos.ifsuldeminas.edu.br)](mailto:lucas.generoso@alunos.ifsuldeminas.edu.br)

---
    
