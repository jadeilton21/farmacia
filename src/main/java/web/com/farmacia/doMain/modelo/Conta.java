package web.com.farmacia.doMain.modelo;

import java.math.BigDecimal;

public class Conta {



    private Long id;

    private String numeroConta;


    private BigDecimal balance;

    private BigDecimal limiteDaConta;


    public void setId(Long id) {
        this.id = id;
    }

    public void setNumeroConta(String numeroConta) {
        this.numeroConta = numeroConta;
    }

    public void setBalance(BigDecimal balance) {
        this.balance = balance;
    }

    public void setLimiteDaConta(BigDecimal limiteDaConta) {
        this.limiteDaConta = limiteDaConta;
    }

    public Long getId() {
        return id;
    }

    public String getNumeroConta() {
        return numeroConta;
    }

    public BigDecimal getBalance() {
        return balance;
    }

    public BigDecimal getLimiteDaConta() {
        return limiteDaConta;
    }
}
