import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Sistema {
    public static void main(String[] args) throws NumberFormatException, IOException {
        ArrayList<Cliente> clientes = new ArrayList<>();
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        while (true) {
            System.out.println("\nMENU:");
            System.out.println("1 - Cadastrar cliente");
            System.out.println("2 - Listar clientes");
            System.out.println("3 - Cadastrar orçamento para um cliente");
            System.out.println("4 - Listar orçamentos de um cliente");
            System.out.println("5 - Sair");
            System.out.print("\nEscolha uma opção: \n");

            String input = reader.readLine();
            if (input.isEmpty()) {
                System.out.println("Opção inválida. Por favor, escolha uma opção válida.");
                continue; // Volta ao início do loop sem processar a entrada vazia
            }

            int opcao = Integer.parseInt(input);

            switch (opcao) {
                case 1 -> cadastrarCliente(clientes);
                case 2 -> listarCliente(clientes);
                case 3 -> cadastrarOrcamento(clientes);
                case 4 -> listarOrcamentosCliente(clientes);
                default -> {
                    System.out.println("Opção inválida. Saindo...");
                    System.exit(0);
                }
            }
        }
    }


    private static void cadastrarCliente(ArrayList<Cliente> clientes) throws IOException {
        System.out.println("Digite o nome do cliente: ");
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String nome = reader.readLine();
        System.out.println("Digite o cpf do cliente: ");
        String cpf = reader.readLine();
        System.out.println("Digite o email do cliente: ");
        String email = reader.readLine();
        System.out.println("Digite o telefone do cliente: ");
        String fone = reader.readLine();

        Cliente cli = new Cliente();
        cli.setNome(nome);
        cli.setCpf(cpf);
        cli.setEmail(email);
        cli.setFone(fone);
        clientes.add(cli);
    }

    private static void listarCliente(ArrayList<Cliente> clientes) {
        System.out.println("\nLista de clientes:");
        for (Cliente cliente : clientes) {
            System.out.println("Nome: " + cliente.getNome());
            System.out.println("CPF: " + cliente.getCpf());
            System.out.println("Email: " + cliente.getEmail());
            System.out.println("Telefone: " + cliente.getFone() + "\n");
        }
    }

    private static void cadastrarOrcamento(ArrayList<Cliente> clientes) throws IOException {
        System.out.println("\nDigite o nome do cliente para adicionar o orçamento: ");
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String nomeCliente = reader.readLine();

        Cliente clienteSelecionado = null;
        for (Cliente cliente : clientes) {
            if (cliente.getNome().equalsIgnoreCase(nomeCliente)) {
                clienteSelecionado = cliente;
                break;
            }
        }

        if (clienteSelecionado != null) {
            System.out.println("Digite a descrição do orçamento: ");
            String descricao = reader.readLine();
            System.out.println("Digite o valor do orçamento: ");
            double valor = Double.parseDouble(reader.readLine());

            Orcamento orcamento = new Orcamento(descricao, valor);
            clienteSelecionado.addOrcamento(orcamento);
            System.out.println("\nOrçamento cadastrado com sucesso para o cliente " + clienteSelecionado.getNome() + "!\n");
        } else {
            System.out.println("Cliente não encontrado.");
        }
    }

    private static void listarOrcamentosCliente(ArrayList<Cliente> clientes) throws IOException {
        System.out.println("\nDigite o nome do cliente para listar os orçamentos: ");
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String nomeCliente = reader.readLine();

        Cliente clienteSelecionado = null;
        for (Cliente cliente : clientes) {
            if (cliente.getNome().equalsIgnoreCase(nomeCliente)) {
                clienteSelecionado = cliente;
                break;
            }
        }

        if (clienteSelecionado != null) {
            ArrayList<Orcamento> orcamentos = clienteSelecionado.getOrcamentos();
            System.out.println("\nOrçamentos do cliente " + clienteSelecionado.getNome() + ":");
            if (orcamentos.isEmpty()) {
                System.out.println("Nenhum orçamento cadastrado para este cliente.");
            } else {
                for (Orcamento orcamento : orcamentos) {
                    System.out.println("Descrição: " + orcamento.getDescricao() + ", Valor: " + orcamento.getValor());
                }
            }
        } else {
            System.out.println("Cliente não encontrado.");
        }
    }

}