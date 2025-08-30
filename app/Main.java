package app;

import domain.*;
import service.*;
import locator.ServiceLocator;

public class Main {
    public static void main(String[] args) {
        ServiceLocator locator = ServiceLocator.getInstance();

        Cliente cliente = new Cliente("João", "joao@email.com");
        Produto produto = new Produto("Notebook", 3500.00);
        Pedido pedido = new Pedido(cliente);
        pedido.adicionarProduto(produto);

        PedidoService pedidoService = locator.getPedidoService();
        pedidoService.processarPedido(pedido);

        RelatorioService relatorioService = locator.getRelatorioService();
        relatorioService.gerarRelatorio(pedido);

        EmailService emailService = locator.getEmailService();
        emailService.enviarConfirmacao(pedido);
    }
}