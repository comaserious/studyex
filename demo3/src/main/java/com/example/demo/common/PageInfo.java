package com.example.demo.common;

public class PageInfo {

    private int firstPage;
    private int lastPage;
    private int curPage;

    public PageInfo(){}

    public PageInfo(int firstPage, int lastPage, int curPage) {
        this.firstPage = firstPage;
        this.lastPage = lastPage;
        this.curPage = curPage;
    }

    public int getFirstPage() {
        return firstPage;
    }

    public void setFirstPage(int firstPage) {
        this.firstPage = firstPage;
    }

    public int getLastPage() {
        return lastPage;
    }

    public void setLastPage(int lastPage) {
        this.lastPage = lastPage;
    }

    public int getCurPage() {
        return curPage;
    }

    public void setCurPage(int curPage) {
        this.curPage = curPage;
    }

    @Override
    public String toString() {
        return "PageInfo{" +
                "firstPage=" + firstPage +
                ", lastPage=" + lastPage +
                ", curPage=" + curPage +
                '}';
    }
}
