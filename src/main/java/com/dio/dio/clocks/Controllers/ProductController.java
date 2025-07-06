package com.dio.dio.clocks.Controllers;
import com.dio.dio.clocks.Domain.Clock;

import com.dio.dio.clocks.Services.ProductServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/clocks")
public class ProductController {

    @Autowired
    private ProductServices clockService;

    @GetMapping
    public List<Clock> getAllProducts() {
        return clockService.getAllProducts();
    }

    @GetMapping("/{id}")
    public ResponseEntity<Clock> getProductById(@PathVariable Long id) {
        return clockService.getProductById(id)
                .map(clock -> ResponseEntity.ok().body(clock))
                .orElse(ResponseEntity.status(404).body(null));
    }
}
