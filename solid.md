# Boas práticas em POO com S.O.L.I.D

- Código limpo
- Código reutilizável
- Código escalável

- Objetivos:
  - Facilitar o trabalho em equipe
  - Redução de bugs
  - Alcançar evolução saudável do software
  
## S: Single Responsability Principle (SRP - Princípio da Responsabilidade Única)

> Uma classe deve possuir apenas um responsabilidade bem definida.

### Exemplo de violação do SRP
```java
class Pedido {
    void calcularValorTotal();
    void salvarNoBanco();
    void enviarPushNotification();
}
```

### Correção
```java
class Pedido {
    void calcularValorTotal();
}

class PedidoRepository {
    void salvar();
}

class PushNotificationService {
    void enviar();
}
```

## O: Open/Closed Principle (OCP - Princípio Aberto/Fechado)

> Classes devem estar abertas para extensão, mas fechadas para modificação

### Exemplo de violação de OCP
```java
class CalculadoraDesconto {
  public double calcular(double valor, TipoDesconto tipo){
    if(tipo == TipoDesconto.NATAL) {
      return valor * 0.9;
    } else if (tipo == TipoDesconto.BLACK_FRIDAY) {
      return valor * 0.8;
    } else if (tipo == TipoDEsconto.DIA_DAS_MAES) {
      return valor * 0.7
    } else {
      return valor;
    }
  }
}
```

### Correção
```java
interface Desconto {
  double aplicarDesconto(double valor);
}

class DescontoNatal implements Desconto {
  @Override
  public double aplicarDesconto(double valor) {
    return valor * 0.9; 
  }
}

class DescontoBlackFriday implements Desconto {
  @Override
  public double aplicarDesconto(double valor) {
    return valor * 0.8; 
  }
}

class DescontoDiaDasMaes implements Desconto {
  @Override
  public double aplicarDesconto(double valor) {
    return valor * 0.7; 
  }
}

class CalculadoraDesconto {
  public double calcular(double valor, Desconto desconto) {
    return desconto.aplicarDesconto(valor);
  }
}
```

## L: Liskov Substitution Principle (LSP - Princípio da Substituição de Liskov)

> Subclasses devem poder substituir suas classes base sem quebrar o comportamento

### Exemplo de violação do LSP
```java
class Retangulo {
  protected float largura, altura;

  public void setLargura(float largura) {
    this.largura = largura;
  }

  public float getLargura() {
    return this.largura;
  }

  public float setAltura(float altura) {
    this.altura = altura;
  }

  public float getAltura() {
    return this.largura;
  }

  public float calcularArea() {
    return altura * largura;
  }
}

class Quadrado extends Retangulo {
  @Override
  public void setLargura(int largura) {
    super.setLargura(largura);
    super.setAltura(largura);
  }
}

class Forma {
  public static Retangulo scale(Retangulo retangulo, float scale) {
    retangulo.setAltura(retangulo.getAltura * scale);
    retangulo.setLargura(retangulo.getLargura * scale);
  }
}

class Application {
  public static void main() {
    Retangulo retangulo = new Retangulo();
    quadrado.setLargura(10.0f);
    quadrado.setAltura(15.0f);
    Forma.scale(retangulo, 2.5f);

    Quadrado quadrado = new Quadrado();
    quadrado.setLargura(10.0f);
    Forma.scale(quadrado, 2.5f);
  }
}
```

### Correção

```java
interface Forma {
  float calcularArea();
  float scale(float scale);
}

class Retangulo implements Forma {
  protected float largura, altura;

  public void setLargura(float largura) {
    this.largura = largura;
  }

  public float setAltura(float altura) {
    this.altura = altura;
  }

  @Override
  public float calcularArea() {
    return altura * largura;
  }

  @Override
  Retangulo scale(float scale) {
    this.altura = this.altura * scale;
    this.largura = this.largura * scale;
  }
}

class Quadrado implements Forma {
  protected float lado;

  public float setLado(float lado) {
    this.lado = lado;
  }

  @Override
  public float calcularArea() {
    return lado * lado;
  }

  @Override
  public Quadrado scale(float scale) {
    return this.lado = this.lado * scale
  }
}

class Application {
  public static void main() {
    Retangulo retangulo = new Retangulo();
    retangulo.setLargura(10.0f);
    retangulo.setAltura(15.0f);
    retangulo.scale(retangulo, 2.5f);
    retagulo.area()

    Quadrado quadrado = new Quadrado();
    quadrado.setLado(10.0f);
    quadrado.scale(2.5f);
    quadrado.area();
  }
}
```