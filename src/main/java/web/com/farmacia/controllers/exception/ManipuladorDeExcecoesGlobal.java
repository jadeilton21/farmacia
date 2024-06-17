package web.com.farmacia.controllers.exception;


import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import java.util.logging.Logger;

@RestControllerAdvice
public class ManipuladorDeExcecoesGlobal {



    private final Logger resistrador = (Logger) LoggerFactory.getLogger(ManipuladorDeExcecoesGlobal.class);
}
