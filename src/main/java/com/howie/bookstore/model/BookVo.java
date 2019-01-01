package com.howie.bookstore.model;

/**
 * Created with IntelliJ IDEA
 *
 * @Author yuanhaoyue swithaoy@gmail.com
 * @Description
 * @Date 2019-01-01
 * @Time 17:38
 */
public class BookVo {
    private String author;
    private String pubdate;
    private String image;
    private Integer pages;
    private String publisher;
    private String isbn10;
    private String title;
    private String author_intro;
    private String summary;
    private Integer price;

    public BookVo() {
    }

    public BookVo(String author, String pubdate, String image, Integer pages, String publisher,
                  String isbn10, String title, String author_intro, String summary, Integer price) {
        this.author = author;
        this.pubdate = pubdate;
        this.image = image;
        this.pages = pages;
        this.publisher = publisher;
        this.isbn10 = isbn10;
        this.title = title;
        this.author_intro = author_intro;
        this.summary = summary;
        this.price = price;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getPubdate() {
        return pubdate;
    }

    public void setPubdate(String pubdate) {
        this.pubdate = pubdate;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public Integer getPages() {
        return pages;
    }

    public void setPages(Integer pages) {
        this.pages = pages;
    }

    public String getPublisher() {
        return publisher;
    }

    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }

    public String getIsbn10() {
        return isbn10;
    }

    public void setIsbn10(String isbn10) {
        this.isbn10 = isbn10;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor_intro() {
        return author_intro;
    }

    public void setAuthor_intro(String author_intro) {
        this.author_intro = author_intro;
    }

    public String getSummary() {
        return summary;
    }

    public void setSummary(String summary) {
        this.summary = summary;
    }

    public Integer getPrice() {
        return price;
    }

    public void setPrice(Integer price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "BookVo{" +
                "author='" + author + '\'' +
                ", pubdate='" + pubdate + '\'' +
                ", image='" + image + '\'' +
                ", pages=" + pages +
                ", publisher='" + publisher + '\'' +
                ", isbn10='" + isbn10 + '\'' +
                ", title='" + title + '\'' +
                ", author_intro='" + author_intro + '\'' +
                ", summary='" + summary + '\'' +
                ", price=" + price +
                '}';
    }
}
