package br.com.alura.comex;
import java.util.ArrayList;

public class ListaDeDesejos {
    ArrayList<Produto> listaDeProdutos = new ArrayList<>();

    public void adicionarProduto(Produto produto){
        listaDeProdutos.add(produto);
    }

    public void imprimeProdutos(){
        System.out.println("Lista de desejos: " + listaDeProdutos);
    }
}
