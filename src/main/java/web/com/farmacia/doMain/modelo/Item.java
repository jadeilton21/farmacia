package web.com.farmacia.doMain.modelo;

import jakarta.persistence.MappedSuperclass;

@MappedSuperclass
public abstract class Item {



    private Long id;

    private String icone;


    private String descricao;
}
