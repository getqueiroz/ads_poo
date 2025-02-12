import src.main.Contato;

public class Application {
    public static void main(String[] args) {
        Contato contato = new Contato("Guylherme", "2345678");
        System.out.println(contato);
        
        Contato contato2 = new Contato("José", "999999999", "Rua Imperial");
        System.out.println(contato2);

        contato.setEndereco("Av. Bady Bassit");
        System.out.println(contato);
    }
}
