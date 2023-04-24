package br.dev.ely.loginSpringSecurity.demo;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import static org.springframework.http.ResponseEntity.ok;

@RestController
@RequestMapping("/api/demo-controller")
public class DemoController {
    @GetMapping
    public ResponseEntity<String> SayHello(){
        return ResponseEntity.ok("Hello from security endpoint");
    }
}
