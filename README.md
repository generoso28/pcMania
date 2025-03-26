# PCMania - Sistema de Compras de Computadores

Este projeto implementa um sistema de compras de computadores chamado PCMania, seguindo o diagrama de classes fornecido.

## Funcionalidades

* **Promoção de Computadores:** Exibe os computadores disponíveis na promoção.
* **Adição ao Carrinho:** Permite adicionar computadores ao carrinho de compras do cliente.
* **Finalização da Compra:** Exibe os computadores no carrinho e o total da compra.
* **Validação de Entrada:** Valida a entrada do usuário para garantir que o número do computador seja válido.
* **Tratamento de Erros:** Exibe mensagens de erro informativas para o usuário.

## Diagrama de Classes

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
