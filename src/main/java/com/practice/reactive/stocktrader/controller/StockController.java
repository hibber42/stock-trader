package com.practice.reactive.stocktrader.controller;

import com.practice.reactive.stocktrader.data.Stock;
import com.practice.reactive.stocktrader.service.StockService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@RestController
@RequestMapping("/stocks")
@AllArgsConstructor
public class StockController {

    private StockService service;

    @GetMapping("/{id}")
    public Mono<Stock> getStock(@PathVariable String id) {
        return service.getById(id);
    }

    @GetMapping
    public Flux<Stock> getAllStocks() {
        return service.getAll();

    }

    @PostMapping
    public Mono<Stock> createStock(@RequestBody Stock stock) {
        return service.create(stock);
    }
}
