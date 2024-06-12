package web.com.farmacia.doMain.modelo;

import jakarta.persistence.*;

import javax.annotation.processing.Generated;
import java.math.BigDecimal;

@Entity(name = "tb_card")
public class Card {


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(unique = true)
    private String numerdoConta;

    @Column(name = "available_limit", precision = 13, scale = 2)
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
