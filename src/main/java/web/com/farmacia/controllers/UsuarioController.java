package web.com.farmacia.controllers;


import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import java.net.URI;
import java.nio.file.Path;

@RestController
@RequestMapping("/usuario")
public class UsuarioController {

    private final usuarioService usuarioService;



    private usuarioController(UsuarioService)



    @GetMapping("/{id}")
    private ResponseEntity<usuario> pegarUsuarios(@PathVariable Long id){

        var usuario = usuarioService.pegarUsuario(id);
        return ResponseEntity.ok(usuario);
    }

    @PostMapping
    private ResponseEntity<usuario> criarUsuarios(@RequestBody usuario criarUsuario){

        var userCreated = usuarioService.criarUsuarios(criarUsuario);
        URI location = ServletUriComponentsBuilder.fromCurrentRequest()
                .path("/{id}")
                .buildAndExpand(userCreated.getId())
                .toUri();
        return ResponseEntity.created(location).body(userCreated);

    }

}
