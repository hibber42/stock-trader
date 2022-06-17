package com.practice.reactive.stocktrader.repository;

import com.practice.reactive.stocktrader.data.Stock;
import org.springframework.data.mongodb.repository.ReactiveMongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface StockRepository extends ReactiveMongoRepository<Stock, String> {
}
