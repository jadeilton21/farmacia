package web.com.farmacia.doMain.modelo;

import jakarta.persistence.*;

import java.util.List;

@Entity(name = "tb_usuario")
public class Usuario {


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String nome;

    @OneToOne(cascade = CascadeType.ALL)
    private Conta conta;

    @OneToMany(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    private List<Factura> factura;
    @OneToOne(cascade = CascadeType.ALL)
    private Card card;
    @OneToMany(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
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
        this.factura = (List<Factura>) factura;
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
        return (Factura) factura;
    }

    public Card getCard() {
        return card;
    }

    public List<News> getNews() {
        return news;
    }
}
