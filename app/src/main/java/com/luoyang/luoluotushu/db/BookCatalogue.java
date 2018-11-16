package com.luoyang.luoluotushu.db;

import org.litepal.crud.DataSupport;

/**
 * package: com.luoyang.luoluotushu.db
 * created by luoyang
 * QQ:1845313665
 * on 2018/11/1
 */
public class BookCatalogue extends DataSupport {
    private int id;
    private String bookpath;
    private String bookCatalogue;
    private long bookCatalogueStartPos;

    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }

    public String getBookCatalogue() {
        return this.bookCatalogue;
    }

    public void setBookCatalogue(String bookCatalogue) {
        this.bookCatalogue = bookCatalogue;
    }

    public String getBookpath() {
        return bookpath;
    }

    public void setBookpath(String ebookpath) {
        this.bookpath = ebookpath;
    }

    public long getBookCatalogueStartPos() {
        return bookCatalogueStartPos;
    }

    public void setBookCatalogueStartPos(long bookCatalogueStartPos) {
        this.bookCatalogueStartPos = bookCatalogueStartPos;
    }
}