package web.com.farmacia.doMain.modelo;

import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.MappedSuperclass;


@MappedSuperclass
public abstract class Item {


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String icone;


    private String descricao;


    public Long getId() {
        return id;
    }

    public String getIcone() {
        return icone;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setIcone(String icone) {
        this.icone = icone;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }
}
