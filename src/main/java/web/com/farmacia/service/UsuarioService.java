package web.com.farmacia.service;

import web.com.farmacia.doMain.modelo.Usuario;

public interface UsuarioService {

    Usuario pegarUsuarios(Long id);

    Usuario criarUsuarios(Usuario usuarioCriar);
}
