package service;

import domain.Pedido;

public class RelatorioService {
    public void gerarRelatorio(Pedido pedido) {
        System.out.println("=== RELATÓRIO DO PEDIDO ===");
        System.out.println("Cliente: " + pedido.getCliente().getNome());
        pedido.getProdutos().forEach(produto ->
            System.out.println("- " + produto.getNome() + ": R$" + produto.getPreco())
        );
        System.out.println("Total: R$" + pedido.calcularTotal());
    }
}