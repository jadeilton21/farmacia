package web.com.farmacia.doMain.modelo;

import jakarta.persistence.*;

import java.math.BigDecimal;
@Entity(name = "tb_conta")
public class Conta {


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(unique = true)
    private String numero;

    @Column(precision = 13, scale = 2)
    private BigDecimal balance;
    @Column(name = "additional_limit", precision = 13, scale = 2)
    private BigDecimal limiteDaConta;


    public void setId(Long id) {
        this.id = id;
    }

    public void setNumero(String numeroConta) {
        this.numero = numeroConta;
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

    public String getNumero() {
        return numero;
    }

    public BigDecimal getBalance() {
        return balance;
    }

    public BigDecimal getLimiteDaConta() {
        return limiteDaConta;
    }
}
