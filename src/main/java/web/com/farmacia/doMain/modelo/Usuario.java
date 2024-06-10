package web.com.farmacia.doMain.modelo;

public class Usuario {



    private Long id;
    private String nome;
    private Conta conta;
    private Factura factura;
    private Card card;
    private Lis<News> news;


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

    public Lis<News> getNews() {
        return news;
    }
}
