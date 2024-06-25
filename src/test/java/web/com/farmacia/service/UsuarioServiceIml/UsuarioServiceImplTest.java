package web.com.farmacia.service.UsuarioServiceIml;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.HttpStatus;
import org.springframework.test.web.servlet.MockMvc;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;


@SpringBootTest
@AutoConfigureMockMvc
class UsuarioServiceImplTest {

    @Autowired
    private MockMvc mockMvc;


    @Test
    @DisplayName("Deve Devolver Código http 404 quando informações forem invalidas")
    void pegarUsuarios_cenario1() throws Exception {



        var response = mockMvc
                .perform(post("/")).andReturn().getResponse();


        assertThat(response.getStatus())
                .isEqualTo(HttpStatus.BAD_REQUEST.value());

    }
}