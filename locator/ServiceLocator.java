package locator;

import repository.PedidoRepository;
import service.*;

public class ServiceLocator {
    private static ServiceLocator instance;

    private PedidoRepository pedidoRepository = new PedidoRepository();
    private PedidoService pedidoService = new PedidoService(pedidoRepository);
    private RelatorioService relatorioService = new RelatorioService();
    private EmailService emailService = new EmailService();

    private ServiceLocator() {}

    public static ServiceLocator getInstance() {
        if (instance == null) {
            instance = new ServiceLocator();
        }
        return instance;
    }

    public PedidoService getPedidoService() {
        return pedidoService;
    }

    public RelatorioService getRelatorioService() {
        return relatorioService;
    }

    public EmailService getEmailService() {
        return emailService;
    }
}