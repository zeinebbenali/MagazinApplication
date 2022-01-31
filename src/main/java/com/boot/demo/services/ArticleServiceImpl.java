package com.boot.demo.services;

import com.boot.demo.entity.Article;
import com.boot.demo.repository.ArticleRepository;
import com.boot.demo.services.service.ArticleService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;

@Service
@Slf4j
public class ArticleServiceImpl implements ArticleService {

    private ArticleRepository articleRepository;

    public ArticleServiceImpl(ArticleRepository articleRepository) {
        this.articleRepository = articleRepository;
    }

    @Override
    public Article showArticle(String name) {
        log.info("Show an article {}", name);
        Article acticle = articleRepository.save(Article.builder().id(1L).amount(BigDecimal.ONE).name(name).build());
        return acticle;
    }

    @Override
    public Boolean addArticle(Long id, String name) {
        log.info("Add a new article");
        articleRepository.save(Article.builder().id(id).amount(BigDecimal.ONE).name(name).build());
        return true;
    }

    @Override
    public Boolean deleteArticle(Long id) {
        log.info("Delete an article {}", id);
        articleRepository.delete(articleRepository.getById(id));
        return true;

    }
}
