package com.boot.demo.services.service;

import com.boot.demo.entity.Stock;

import java.util.List;

public interface StockeService {
    Stock showStock(Long id);

    List<Stock> showAll();

    Boolean addStocks(Long id);

    Boolean deleteStocks(Long id);
}
