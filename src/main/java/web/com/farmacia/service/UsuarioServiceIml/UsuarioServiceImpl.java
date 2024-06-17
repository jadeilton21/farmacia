package web.com.farmacia.service.UsuarioServiceIml;

import jakarta.persistence.Id;
import org.springframework.stereotype.Service;
import web.com.farmacia.doMain.modelo.Usuario;
import web.com.farmacia.doMain.repository.UsuarioRepository;
import web.com.farmacia.service.UsuarioService;

import java.util.NoSuchElementException;

@Service
public class UsuarioServiceImpl implements UsuarioService {

    private final UsuarioRepository usuarioRepository;

    public UsuarioServiceImpl(UsuarioRepository usuarioRepository) {
        this.usuarioRepository = usuarioRepository;
    }


    @Override
    public Usuario pegarUsuarios(Long id) {
        return usuarioRepository.findById(id).orElseThrow(NoSuchElementException::new);


    }

    @Override
    public Usuario criarUsuarios(Usuario usuarioCriar) {
        return null;
    }
}
