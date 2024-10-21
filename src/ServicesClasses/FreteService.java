package ServicesClasses;

import ModelClasses.Endereco;
import java.math.BigDecimal;

public class FreteService {

    public BigDecimal calcularFrete(Endereco endereco) {

        BigDecimal valorFrete;

        if (endereco.getEstado().equalsIgnoreCase("SP")) {
            valorFrete = BigDecimal.valueOf(10.00);
        } else {
            valorFrete = BigDecimal.valueOf(20.00);
        }

        return valorFrete;
    }
}
