package domain;

import java.util.ArrayList;
import java.util.List;

public class Pedido {
    private Cliente cliente;
    private List<Produto> produtos = new ArrayList<>();

    public Pedido(Cliente cliente) {
        this.cliente = cliente;
    }

    public void adicionarProduto(Produto produto) {
        produtos.add(produto);
    }

    public Cliente getCliente() {
        return cliente;
    }

    public List<Produto> getProdutos() {
        return produtos;
    }

    public double calcularTotal() {
        return produtos.stream().mapToDouble(Produto::getPreco).sum();
    }
}