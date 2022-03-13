package com.boot.demo.controller;

import com.boot.demo.entity.Article;
import com.boot.demo.services.service.ArticleService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@RequestMapping(value = "/articles")
@Slf4j
public class ArticleController {
    private final ArticleService articleService;

    public ArticleController(ArticleService articleService) {
        this.articleService = articleService;
    }

    @RequestMapping(value = "/show", method = RequestMethod.GET)
    public List<Article> showAll() {
        log.info("Start show All acticles");
        return articleService.showAll();
    }

    @RequestMapping(value = "/show/{name}", method = RequestMethod.GET)
    public Article show(@RequestParam Long id) {
        log.info("Start show acticle");
        return articleService.showArticle(id);
    }

    @RequestMapping(value = "/add", method = RequestMethod.GET)
    public Boolean add(@RequestParam("name") String name,
                       @RequestParam("id") Long id) {

        return articleService.addArticle(id, name);
    }

    @RequestMapping(value = "/delete", method = RequestMethod.GET)
    public Boolean delete(@PathVariable Long id) {

        return articleService.deleteArticle(id);
    }
}