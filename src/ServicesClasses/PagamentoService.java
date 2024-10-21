package ServicesClasses;

import ModelClasses.Pagamento;
import ModelClasses.Status;
import java.math.BigDecimal;

public class PagamentoService {

    public boolean processarPagamento(Pagamento pagamento) {

        if (pagamento.getValorPago().compareTo(BigDecimal.ZERO) > 0) {
            pagamento.setStatusPagamento(new Status("Aprovado"));
            return true;
        } else {
            pagamento.setStatusPagamento(new Status("Rejeitado"));
            return false;
        }
    }

    public boolean validarPagamento(Pagamento pagamento) {
        return pagamento.getValorPago().compareTo(BigDecimal.ZERO) > 0;
    }
}


