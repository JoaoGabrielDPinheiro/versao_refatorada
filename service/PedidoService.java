package service;

import domain.Pedido;
import repository.PedidoRepository;

public class PedidoService {
    private PedidoRepository repository;

    public PedidoService(PedidoRepository repository) {
        this.repository = repository;
    }

    public void processarPedido(Pedido pedido) {
        validarPedido(pedido);
        repository.salvar(pedido);
    }

    private void validarPedido(Pedido pedido) {
        if (pedido.getProdutos().isEmpty()) {
            throw new IllegalArgumentException("Pedido deve conter ao menos um produto.");
        }
    }
}