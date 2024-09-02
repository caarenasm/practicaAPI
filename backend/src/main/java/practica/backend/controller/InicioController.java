package practica.backend.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("practica")
public class InicioController {
    @GetMapping(produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<List<String>> getLista() {
        List<String> languages = new ArrayList<>();
        languages.add("Python");
        languages.add("English");
        languages.add("JavaScript");
        return new ResponseEntity<>(languages, HttpStatus.OK);
    }
}
