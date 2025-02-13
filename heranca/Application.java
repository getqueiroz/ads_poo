package heranca;

import heranca.src.main.Cliente;
import heranca.src.main.PessoaFisica;
import heranca.src.main.PessoaJuridica;

public class Application {
    public static void main(String[] args) {
        Cliente clientePf = new PessoaFisica("José", "1234567");
        Cliente clientePj = new PessoaJuridica("UNORTE", "1234567097780001");

        System.out.println(clientePf);
        System.out.println(clientePj);
    }
}
