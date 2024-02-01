package br.com.alura.comex;

public class Teste {
    public static void main(String[] args) {
        Produto myProduct = new Produto();
        myProduct.nome = "Ferrari F40";
        myProduct.descricao = "Ferrari ano 1994 carro de consumo de muitos colecionadores de ferrari";
        myProduct.precoUnitario = 50000;
        myProduct.quantidade = 1;

        Produto book = new Produto();
        book.nome = "Pai Rico e Pai Pobre";
        book.descricao = "Aprenda sobre ativo e passivo";
        book.precoUnitario = 34.99;
        book.quantidade = 50;
    }
}
