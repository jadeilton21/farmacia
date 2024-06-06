package web.com.farmacia.controllers;


import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;
import web.com.farmacia.doMain.modelo.usuario;

import java.net.URI;
import java.nio.file.Path;

@RestController
@RequestMapping("/usuario")
public class UsuarioController {

    private final usuarioService usuarioService;



    private usuarioController(UsuarioService usuarioService){

        this.usuarioService = usuarioService;
    }



    @GetMapping("/{id}")
    private ResponseEntity<usuario> pegarUsuarios(@PathVariable Long id){

        var usuario = usuarioService.pegarUsuario(id);
        return ResponseEntity.ok(usuario);
    }

    @PostMapping
    private ResponseEntity<usuario> criarUsuarios(@RequestBody usuario criarUmUsuario){

        var usuarioCriar = usuarioService.criarUsuarios(criarUmUsuario);
        URI location = ServletUriComponentsBuilder.fromCurrentRequest()
                .path("/{id}")
                .buildAndExpand(usuarioCriar.getId())
                .toUri();
        return ResponseEntity.created(location).body(usuarioCriar);

    }

}
