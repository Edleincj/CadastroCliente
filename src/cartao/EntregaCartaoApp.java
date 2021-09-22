package cartao;

import br.com.dio.Cliente;
import br.com.dio.Endereco;

public class EntregaCartaoApp {

    public static void main(String[] args) {

        Endereco endereco = new Endereco();
        endereco.cep = "00000000";
        //dados do endereço
        Cliente cliente = new Cliente();
        //dados do cliente

        try {
            cliente.adicionaEndereco(endereco);
            System.out.println("Endereço adicionado com suscesso!");
        } catch(Exception e) {
            System.err.println("Houve um erro ao adicionar endereço: " + e.getMessage());
        }
    }
}

