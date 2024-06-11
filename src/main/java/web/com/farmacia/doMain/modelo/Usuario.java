package web.com.farmacia.doMain.modelo;

import jakarta.persistence.*;

import java.util.List;


public class Usuario {


    @Id
    @GeneratedValue
    private Long id;

    private String nome;

    @OneToOne(cascade = CascadeType.ALL)
    private Conta conta;


    private Factura factura;
    private Card card;
    private List<News> news;


    public void setId(Long id) {
        this.id = id;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setConta(Conta conta) {
        this.conta = conta;
    }

    public void setFactura(Factura factura) {
        this.factura = factura;
    }

    public void setCard(Card card) {
        this.card = card;
    }

    public void setNews(List<News> news) {
        this.news = news;
    }

    public Long getId() {
        return id;
    }

    public String getNome() {
        return nome;
    }

    public Conta getConta() {
        return conta;
    }

    public Factura getFactura() {
        return factura;
    }

    public Card getCard() {
        return card;
    }

    public List<News> getNews() {
        return news;
    }
}
