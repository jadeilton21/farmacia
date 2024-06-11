package web.com.farmacia.doMain.modelo;

import java.math.BigDecimal;

public class Card {


    private String numerdoConta;


    private BigDecimal limite;

    public String getNumerdoConta() {
        return numerdoConta;
    }

    public BigDecimal getLimite() {
        return limite;
    }

    public void setNumerdoConta(String numerdoConta) {
        this.numerdoConta = numerdoConta;
    }

    public void setLimite(BigDecimal limite) {
        this.limite = limite;
    }
}
