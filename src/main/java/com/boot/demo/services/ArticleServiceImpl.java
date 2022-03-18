package com.boot.demo.services;

import com.boot.demo.entity.Article;
import com.boot.demo.repository.ArticleRepository;
import com.boot.demo.services.service.ArticleService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;
import java.util.List;
import java.util.Optional;

@Service
@Slf4j
public class ArticleServiceImpl implements ArticleService {

    private ArticleRepository articleRepository;

    public ArticleServiceImpl(ArticleRepository articleRepository) {
        this.articleRepository = articleRepository;
    }

    @Override
    public Article showArticle(Long id) {
        log.info("Show an article {}", id);
        Optional<Article> acticle = articleRepository.findById(id);
        return acticle.isPresent() ? acticle.get() : null;
    }

    @Override
    public List<Article> showAll() {
        log.info("Show all articles");
        List<Article> acticle = articleRepository.findAll();
        return acticle;
    }

    @Override
    public Boolean addArticle(Long id, String name) {
        log.info("Add a new article");
        articleRepository.save(Article.builder().amount(BigDecimal.ONE).name(name).build());
        return true;
    }

    @Override
    public Boolean deleteArticle(Long id) {
        log.info("Delete an article = {}", id);
        articleRepository.delete(articleRepository.getById(id));
        return true;

    }
}
