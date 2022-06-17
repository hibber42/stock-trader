package com.practice.reactive.stocktrader.service;

import com.practice.reactive.stocktrader.data.Stock;
import com.practice.reactive.stocktrader.repository.StockRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@Service
@AllArgsConstructor
public class StockService {
    private StockRepository repository;

    public Mono<Stock> getById(String id) {
        return repository.findById(id);
    }

    public Flux<Stock> getAll() {
        return repository.findAll();
    }

    public Mono<Stock> create(Stock stock) {
        return repository.save(stock);
    }
}
