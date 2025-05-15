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

## I: Interface Segregation Principle (ISP - Princípio da Segregação de Interfaces)

> Nenhuma classe deve ser forçada a implementar métodos que não precisa

### Exemplo de violação do ISP

```java
public interface Funcionario {
  void trabalhar();
  void comer();
}

public class Desenvolvedor implements Funcionario {
  public void trabalhar() {
    system.out.println("Desenvolvendo...");
  }

  public void comer() {
    system.out.println("Desenvolvedor não tem tempo pra comer");
  }
}

public class RoboDesenvolvedor implements Funcionario {
    public void trabalhar() {
    system.out.println("Desenvolvendo...");
  }

  public void comer() {
    throw new UnsuportedOperationException("Robô não se alimenta");
  }
}
```

### Solução

```java
public interface Trabalhador {
  public void trabalhar();
} 

public interface SerHumano {
  public void comer();
}

public class Desenvolvedor implements Trabalhador, SerHumano {
  public void trabalhar() {
    system.out.println("Desenvolvendo...");
  }

  public void comer() {
    system.out.println("Desenvolvedor não tem tempo pra comer");
  }
}

public class RoboDesenvolvedor implements Trabalhador {
    public void trabalhar() {
    system.out.println("Desenvolvendo...");
  }
}
```

## D: Dependency Inversion Principle (DIP - Princípio da Inversão de Dependência)

> Módulos de alto nível não devem depender de módulos de baixo nível, em outras palavras, abstrações não devem depender de detalhes. Detalhes devem depender de abstrações.

### Exemplo de violação do DIP

```java
public class MySQLDatabase {
  public void salvar(String dado) {
      System.out.println("Salvando no banco");
  }
}

public class UsuarioService {
  private MySQLDatabase database;

  public UsuarioService() {
    this.database = new MySQLDatabase();
  }

  public void gravar(String nome) {
    database.salvar(nome);
  }
}

```

### Correção

```java
public interface Database {
  public void salvar(String dado);
}

public MySQLDatabase implements Database {
  @Override
  public void salvar(String dado) {
    System.out.println("Salvando no MySQL");
  }
}

public MongoDatabase implements Database {
  @Override
  public void salvar(String dado) {
    System.out.println("Salvando no MongoDB");
  }
}


public class UsuarioService {
  private Database database;

  public UsuarioService(Database database) {
    this.database = database;
  }

  public void gravar(String nome) {
    database.salvar(nome);
  }
}

public class Application {
  public static main() {
    Database database = new MongoDBDatabase();
    UsuarioService usuarioService = new UsuarioService(database);
  }
}
```

## Exercícios
Identifique os princípios violados abaixo e refatore o código com a respectiva correção.

### Exercício 1
```java 
public class SomAnimal {
  public void emitirSom(String tipo) {
    if (tipo.equals("cachoro")) {
      System.out.println("Au au");
    } else if (tipo.equals("gato")){
      System.out.println("Miau");
    }
  }
}
```

### Exercício 2
```java 
class Passaro {
    public void voar() {
        System.out.println("Pássaro está voando");
    }
}

class Avestruz extends Passaro {
    @Override
    public void voar() {
        // Avestruzes não voam!
        throw new UnsupportedOperationException("Avestruz não pode voar");
    }
}

public class Main {
    public static void fazerPassaroVoar(Passaro passaro) {
        passaro.voar();
    }

    public static void main(String[] args) {
        Passaro passaro = new Passaro();
        fazerPassaroVoar(bird);

        Passaro avestruz = new Avestruz();
        fazerPassaroVoar(ostrich); 
    }
}
```

### Execício 3
```java
class EmailSender {
    public void send(String message) {
        System.out.println("Enviando e-mail: " + message);
    }
}

class NotificationService {
    private EmailSender emailSender;

    public NotificationService() {
        this.emailSender = new EmailSender();
    }

    public void notifyUser(String message) {
        emailSender.send(message);
    }
}
```

### Execício 4
```java
interface Veiculo {
    void dirigir();
    void voar();
    void navegar();
}

class Carro implements Veiculo {
    @Override
    public void dirigir() {
        System.out.println("Carro dirigindo na estrada");
    }

    @Override
    public void voar() {
        throw new UnsupportedOperationException("Carro não pode voar!");
    }

    @Override
    public void navegar() {
        throw new UnsupportedOperationException("Carro não pode navegar!");
    }
}

class Barco implements Veiculo {
    @Override
    public void dirigir() {
        throw new UnsupportedOperationException("Barco não pode dirigir!");
    }

    @Override
    public void voar() {
        throw new UnsupportedOperationException("Barco não pode voar!");
    }

    @Override
    public void navegar() {
        System.out.println("Barco navegando no mar");
    }
}
``` 

### Execício 5
```java
class Relatorio {
    public void gerarRelatorio(String tipo) {
        if (tipo.equals("PDF")) {
            System.out.println("Gerando relatório em PDF...");
        } else if (tipo.equals("HTML")) {
            System.out.println("Gerando relatório em HTML...");
        } else {
            System.out.println("Formato não suportado.");
        }
    }
}
```