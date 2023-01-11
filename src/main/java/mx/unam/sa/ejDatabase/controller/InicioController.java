/*
 * (c) UNAM, 2022
 */
package mx.unam.sa.ejDatabase.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 *
 * @author israel1971
 */
@Controller
@RequestMapping("/")
public class InicioController {

    @GetMapping
    public ResponseEntity<String> inicial() {
        String salida = "<p>Proyecto ejDatabase";
        return ResponseEntity.ok().body(salida);
    }
    

}
