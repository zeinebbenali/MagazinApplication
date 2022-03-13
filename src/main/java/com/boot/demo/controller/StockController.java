package com.boot.demo.controller;

import com.boot.demo.entity.Stock;
import com.boot.demo.services.service.StockeService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@RequestMapping(value = "/magazin")
@Slf4j
public class StockController {
    private final StockeService stockeService;

    public StockController(StockeService stockeService) {
        this.stockeService = stockeService;
    }

    @RequestMapping(value = "/{name}", method = RequestMethod.GET)
    public String show(@PathVariable String name) {
        return "Hello " + name;
    }

    @RequestMapping(value = "/show", method = RequestMethod.GET)
    public List<Stock> showAll() {
        log.info("Start show All Stock");
        return stockeService.showAll();
    }

    @RequestMapping(value = "/show/{name}", method = RequestMethod.GET)
    public Stock show(@RequestParam Long id) {
        log.info("Start show stock");
        return stockeService.showStock(id);
    }

    @RequestMapping(value = "/add", method = RequestMethod.GET)
    public Boolean add(@RequestParam("id") Long id) {

        return stockeService.addStocks(id);
    }

    @RequestMapping(value = "/delete", method = RequestMethod.GET)
    public Boolean delete(@PathVariable Long id) {

        return stockeService.deleteStocks(id);
    }
}