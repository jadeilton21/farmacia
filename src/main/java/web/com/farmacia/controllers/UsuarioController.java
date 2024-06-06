package web.com.farmacia.controllers;


import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/usuario")
public class UsuarioController {



    @GetMapping("/{id}")
    private ResponseEntity<usuario> pegarUsuarios(@PathVariable Long id){

        var usuario = usuarioServidor.pegarUsuario(id);
        return ResponseEntity.ok(usuario);
    }

}
