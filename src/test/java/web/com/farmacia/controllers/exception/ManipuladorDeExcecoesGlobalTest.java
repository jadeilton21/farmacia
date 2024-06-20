package web.com.farmacia.controllers.exception;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.web.servlet.MockMvc;

import static org.junit.jupiter.api.Assertions.*;


@SpringBootTest
@AutoConfigureMockMvc
class ManipuladorDeExcecoesGlobalTest {



    @MockBean
    private MockMvc mockMvc;


    @Test
    @DisplayName("Deve devolver código http 404 quando informações forem invalidas...")
    void handleBusinessException() throws Exception {




    }
}