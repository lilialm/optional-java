package interfaces;

import java.util.Optional;
import java.util.Scanner;

public class TestaCliente {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        String[] dadosPessoaFisica = new String[6];
        try {
            System.out.print("Digite o nome da pessoa física 1: ");
            dadosPessoaFisica[0] = scanner.nextLine();

            System.out.print("Digite o endereço da pessoa física 1: ");
            dadosPessoaFisica[1] = scanner.nextLine();

            System.out.print("Digite o email da pessoa física 1: ");
            dadosPessoaFisica[2] = scanner.nextLine();

            System.out.print("Digite o telefone da pessoa física 1: ");
            dadosPessoaFisica[3] = scanner.nextLine();

            System.out.print("Digite o CPF da pessoa física 1: ");
            dadosPessoaFisica[4] = scanner.nextLine();

            System.out.print("Digite o RG da pessoa física 1: ");
            dadosPessoaFisica[5] = scanner.nextLine();

            Optional<String> optionalNome = Optional.ofNullable(dadosPessoaFisica[0]);
            Optional<String> optionalEndereco = Optional.ofNullable(dadosPessoaFisica[1]);
            Optional<String> optionalEmail = Optional.ofNullable(dadosPessoaFisica[2]);
            Optional<String> optionalTelefone = Optional.ofNullable(dadosPessoaFisica[3]);
            Optional<String> optionalCPF = Optional.ofNullable(dadosPessoaFisica[4]);
            Optional<String> optionalRG = Optional.ofNullable(dadosPessoaFisica[5]);

            if (optionalNome.isPresent() || optionalEndereco.isPresent() || optionalEmail.isPresent()
                    || optionalTelefone.isPresent() || optionalCPF.isPresent() || optionalRG.isPresent()) {
                throw new IllegalArgumentException("Nenhum campo de entrada de dados pode ser nulo");
            }

            ClienteInterface pessoaFisica1 = new PessoaFisica(
                    optionalNome.get(), optionalEndereco.get(), optionalEmail.get(), optionalTelefone.get(),
                    optionalCPF.get(), optionalRG.get()
            );

            pessoaFisica1.visualizar();
            System.out.println();
        } catch (IllegalArgumentException e) {
            System.out.println("Erro ao criar cliente: " + e);
        } finally {
            scanner.close();
        }
    }
}
