package br.com.alura.comex;

public class Principal {
    public static void main(String[] args) {
        Produto produto = new Produto("Apple Macbook Pro 16 Polegadas");
        produto.setDescricao("MacBook Pro A2141 - 2019");
        produto.setPrecoUnitario(8.299);
        produto.setQuantidade(1);

        System.out.println("O nome do produto é " + produto.getNome());
        System.out.println("Descrição: " + produto.getDescricao());
        System.out.println("O valor de cada unidade é R$ " + produto.getPrecoUnitario());
        System.out.println("Temos em estoque " + produto.getQuantidade() + " unidades.");

        Produto produto3 = new Produto("Notebook Dell");
        produto3.setDescricao("Notebook Dell processador i9 com 128GB RAM");
        produto3.setPrecoUnitario(7500.00);
        produto3.setQuantidade(8);

        produto3.imprimeDados();

        Endereco endereco = new Endereco();
        endereco.rua = "Rua dos Karatecas";
        endereco.numero = 94;
        endereco.complemento = "";
        endereco.bairro = "China Town";
        endereco.cidade = "China";
        endereco.estado = "SP";

        Cliente cliente = new Cliente();
        cliente.nome = "Robert Garcia";
        cliente.cpf = "021.879.354-89";
        cliente.email = "robertgarcia@teamkof.com";
        cliente.profissao = "Empresário";
        cliente.telefone = "+5511999887755";
        cliente.endereco = endereco;

        System.out.println("O cliente " + cliente.nome + " tem o CPF " + cliente.cpf + " e reside na Rua " + cliente.endereco.rua + " na cidade de " + cliente.endereco.cidade );

        ListaDeDesejos lista = new ListaDeDesejos();
        lista.adicionarProduto(produto);
        lista.adicionarProduto(produto3);
        lista.imprimeProdutos();
    }
}
