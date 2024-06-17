package allancristiano.annotations.controller;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;


@RestController
public class HelloControlller {
    @GetMapping()
    public ResponseEntity<Void> hello() {
        
        return ResponseEntity.ok().build();
    }
    
    
}
