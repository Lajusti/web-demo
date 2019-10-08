package alejandro.lajusticia.web.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SomeController {

    @GetMapping("/hello")
    public ResponseEntity<String> helloController() {
        return ResponseEntity.ok("Hello world!");
    }

}
