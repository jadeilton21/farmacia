package web.com.farmacia.doMain.repository;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import web.com.farmacia.doMain.modelo.Usuario;

@Repository
public interface UsuarioRepository extends JpaRepository<Usuario,Long> {

    boolean existsByContaNumero(String numero);
}
