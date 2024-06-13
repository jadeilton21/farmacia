package web.com.farmacia.controllers;


import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;
import web.com.farmacia.doMain.modelo.Usuario;
import web.com.farmacia.service.UsuarioService;


import java.net.URI;
import java.nio.file.Path;

@RestController
@RequestMapping("/usuario")
public class UsuarioController {

    private final UsuarioService usuarioService;



    private usuarioController(UsuarioService usuarioService){

        this.usuarioService = usuarioService;
    }

    public UsuarioController(UsuarioService usuarioService) {
        this.usuarioService = usuarioService;
    }


    @GetMapping("/{id}")
    private ResponseEntity<Usuario> pegarUsuarios(@PathVariable Long id){

        var usuario = usuarioService.pegarUsuarios(id);
        return ResponseEntity.ok(usuario);
    }

    @PostMapping
    private ResponseEntity<Usuario> criarUsuarios(@RequestBody Usuario criarUmUsuario){

        var usuarioCriar = usuarioService.criarUsuarios(criarUmUsuario);
        URI location = ServletUriComponentsBuilder.fromCurrentRequest()
                .path("/{id}")
                .buildAndExpand(usuarioCriar.getId())
                .toUri();
        return ResponseEntity.created(location).body(usuarioCriar);

    }

}
