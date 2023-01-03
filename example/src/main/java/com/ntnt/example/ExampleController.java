package com.ntnt.example;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/api/v1/example")
public class ExampleController {
    @GetMapping
    public ResponseEntity<String> example() {
        return ResponseEntity.ok("OK");
    }
}
