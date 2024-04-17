package com.ohgiraffers.springboottest2.thymeleaf.model.dto;

public class SelectCriteria {

    private int startPage;
    private int endPage;
    private int curPage;

    public SelectCriteria(){}

    public SelectCriteria(int startPage, int endPage, int curPage) {
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
        return "SelectCriteria{" +
                "curPage=" + curPage +
                ", endPage=" + endPage +
                ", startPage=" + startPage +
                '}';
    }
}
