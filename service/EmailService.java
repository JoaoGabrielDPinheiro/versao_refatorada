package service;

import domain.Pedido;

public class EmailService {
    public void enviarConfirmacao(Pedido pedido) {
        String email = pedido.getCliente().getEmail();
        System.out.println("Enviando e-mail para " + email + "...");
        System.out.println("Pedido confirmado com total de R$" + pedido.calcularTotal());
    }
}