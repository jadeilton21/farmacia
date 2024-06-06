package web.com.farmacia.controllers;


import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.nio.file.Path;

@RestController
@RequestMapping("/usuario")
public class UsuarioController {



    @GetMapping("/{id}")
    private ResponseEntity<usuario> pegarUsuarios(@PathVariable Long id){

        var usuario = usuarioServidor.pegarUsuario(id);
        return ResponseEntity.ok(usuario);
    }


    private ResponseEntity<usuario> criarUsuarios(@RequestBody usuario criarUsuario){


    }

}
