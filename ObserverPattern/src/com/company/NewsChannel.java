package com.company;

public class NewsChannel implements Channel{
    private String news;



    public void setNews(String news) {
        this.news = news;
    }

    public String getNews() {
        return news;
    }

    @Override
    public void update(Object news) {
        this.setNews((String) news);
    }
}
