package com.example.demo.thymeleaf.dto;

public class PageCriteria {

    private int startPage;
    private int endPage;
    private int curPage;

    public PageCriteria(){}

    public PageCriteria(int startPage, int endPage, int curPage) {
        this.startPage = startPage;
        this.endPage = endPage;
        this.curPage = curPage;
    }

    public int getStartPage() {
        return startPage;
    }

    public void setStartPage(int startPage) {
        this.startPage = startPage;
    }

    public int getEndPage() {
        return endPage;
    }

    public void setEndPage(int endPage) {
        this.endPage = endPage;
    }

    public int getCurPage() {
        return curPage;
    }

    public void setCurPage(int curPage) {
        this.curPage = curPage;
    }

    @Override
    public String toString() {
        return "PageCriteria{" +
                "startPage=" + startPage +
                ", endPage=" + endPage +
                ", curPage=" + curPage +
                '}';
    }
}
