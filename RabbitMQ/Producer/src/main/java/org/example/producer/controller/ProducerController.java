package org.example.producer.controller;


import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.example.producer.service.ProductService;


@RestController
@RequestMapping("/send")
public class ProducerController {
    private final ProductService productService;

    @PostMapping
    public ResponseEntity<String> sendMessage(@RequestBody String message) {
        productService.sendMessage(message);
        return ResponseEntity.ok("Message sent!");
    }

    public ProducerController(ProductService productService) {
        this.productService = productService;
    }

}
