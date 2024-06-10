package web.com.farmacia.doMain.modelo;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;

import java.math.BigDecimal;
@Entity(name = "tb_conta")
public class Conta {


    @Id
    @GeneratedValue
    private Long id;
    @Column(unique = true)
    private String numeroConta;

    @Column(precision = 13, scale = 2)
    private BigDecimal balance;
    @Column(name = "additional_limit", precision = 13, scale = 2)
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
