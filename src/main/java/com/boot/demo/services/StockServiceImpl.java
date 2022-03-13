package com.boot.demo.services;

import com.boot.demo.entity.Stock;
import com.boot.demo.repository.StockRepository;
import com.boot.demo.services.service.StockeService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.List;
import java.util.Optional;

@Service
@Slf4j
public class StockServiceImpl implements StockeService {
    private StockRepository stockRepository;

    public StockServiceImpl(StockRepository stockRepository) {
        this.stockRepository = stockRepository;
    }

    @Override
    public Stock showStock(Long id) {
        log.info("Show an stock {}", id);
        Optional<Stock> acticle = stockRepository.findById(id);
        return acticle.isPresent() ? acticle.get() : null;
    }

    @Override
    public List<Stock> showAll() {
        log.info("Show all articles");
        List<Stock> stocks = stockRepository.findAll();
        return stocks;
    }

    @Override
    public Boolean addStocks(Long id) {
        log.info("Add a new stock");
        stockRepository.save(Stock.builder().acticleId(id).quantiy(BigDecimal.TEN).startDate(LocalDate.now()).build());
        return true;
    }

    @Override
    public Boolean deleteStocks(Long id) {
        log.info("Delete an stock {}", id);
        stockRepository.deleteById(id);
        return true;

    }
}
