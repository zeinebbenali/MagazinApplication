package com.boot.demo.services.service;

import com.boot.demo.entity.Article;

import java.util.List;

public interface ArticleService {
    List<Article> showAll();

    Article showArticle(Long id);

    Boolean addArticle(Long id, String name);

    Boolean deleteArticle(Long id);
}

