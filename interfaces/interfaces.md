# Aula: Interfaces em Java

---

## 1. Introdução

### O que são interfaces?


>Imagine uma tomada elétrica na parede. Ela tem um formato padrão e define como um aparelho deve se conectar para funcionar — dois pinos paralelos, por exemplo.

`A tomada é a interface.`

>Agora pense nos aparelhos eletrônicos: um ventilador, uma TV, um carregador de celular... Todos têm plugues compatíveis com aquela tomada. Cada um funciona de um jeito diferente, mas todos sabem como se conectar e usar a energia elétrica fornecida.

`Os aparelhos são as classes que implementam a interface.`


Interfaces são contratos em Java. Elas definem um conjunto de métodos que uma classe deve implementar. Diferente de classes abstratas, interfaces não possuem implementação completa, apenas assinaturas de métodos (até o Java 7) ou implementações padrões (a partir do Java 8).

### Por que usar interfaces?
- Padroniza o comportamento de objetos.
- Permite polimorfismo.
- Facilita testes e manutenção.
- Ajuda na desacoplamento entre componentes do sistema.

---

## 2. Sintaxe de Interface

### Definição de Interface
```java
public interface Animal {
    void emitirSom();
    void mover();
}
```

### Implementando uma Interface
```java
public class Cachorro implements Animal {
    @Override
    public void emitirSom() {
        System.out.println("Latido");
    }

    @Override
    public void mover() {
        System.out.println("Correndo...");
    }
}
```

### Características
- Uma classe pode implementar várias interfaces.
- Todos os métodos em interfaces são public e abstract (por padrão).
- Interfaces não têm construtores.

---

## 3. Interface vs Classe Abstrata (5 minutos)

| Característica              | Interface                  | Classe Abstrata              |
|----------------------------|----------------------------|------------------------------|
| Métodos com código        | A partir do Java 8 (default)| Sim                         |
| Herança múltipla           | Sim                        | Não                         |
| Construtores               | Não                        | Sim                         |
| Estado (atributos)         | Constantes                 | Variáveis e constantes       |

---

## 4. Interfaces com Métodos Default e Estáticos

### Java 8 em diante
```java
public interface Veiculo {
    void ligar();

    default void buzinar() {
        System.out.println("Buzinando!");
    }

    static void info() {
        System.out.println("Interface Veiculo");
    }
}
```

### Implementação
```java
public class Carro implements Veiculo {
    @Override
    public void ligar() {
        System.out.println("Carro ligado");
    }
}

// Uso
Carro carro = new Carro();
carro.ligar();
carro.buzinar();
Veiculo.info();
```

---

## 5. Polimorfismo com Interfaces

```java
public class Gato implements Animal {
    @Override
    public void emitirSom() {
        System.out.println("Miado");
    }

    @Override
    public void mover() {
        System.out.println("Andando...");
    }
}

// Uso
Animal a1 = new Cachorro();
Animal a2 = new Gato();

a1.emitirSom(); // Latido
a2.emitirSom(); // Miado
```

Interfaces permitem que objetos sejam manipulados por suas capacidades e comportamentos, não por sua classe concreta.

---

## 6. Interfaces Funcionais e Lambda (Java 8+)

### Interface Funcional
```java
@FunctionalInterface
public interface Operacao {
    int executar(int a, int b);
}
```

### Uso com Lambda
```java
Operacao soma = (a, b) -> a + b;
Operacao multiplicacao = (a, b) -> a * b;

System.out.println(soma.executar(2, 3)); // 5
System.out.println(multiplicacao.executar(2, 3)); // 6
```

---

## 7. Exercício

**Objetivo:** Criar um sistema simples de pagamento utilizando uma interface.

### Interface
```java
public interface MetodoPagamento {
    void pagar(double valor);
}
```

### Implementações
```java
public class CartaoCredito implements MetodoPagamento {
    public void pagar(double valor) {
        System.out.println("Pagando R$" + valor + " com Cartão de Crédito.");
    }
}

public class Boleto implements MetodoPagamento {
    public void pagar(double valor) {
        System.out.println("Gerando boleto para R$" + valor);
    }
}
```

### Uso
```java
MetodoPagamento pagamento;

pagamento = new CartaoCredito();
pagamento.pagar(100);

pagamento = new Boleto();
pagamento.pagar(200);
```

---

## 8. Conclusão

### Pontos-chave:
- Interfaces definem comportamentos.
- Permitem polimorfismo e baixo acoplamento.
- A partir do Java 8, podem ter métodos default e estáticos.
- Interfaces funcionais são a base de expressões lambda.