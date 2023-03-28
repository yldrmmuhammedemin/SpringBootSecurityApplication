package com.yildirim.springbootsecurity.demo;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/api/v1/demo-controller")
public class DemoController {
    @GetMapping
    public ResponseEntity<String> demoApp(){
        return ResponseEntity.ok("Successfully login secured endpoint.");
    }
}
