package com.howie.bookstore.model;


/**
 * Created with IntelliJ IDEA
 *
 * @Author yuanhaoyue swithaoy@gmail.com
 * @Description
 * @Date 2019-01-01
 * @Time 17:13
 */
public class BookInformation extends Book {
    /**
     * 封面地址
     */
    private String imageURL;
    /**
     * 页数
     */
    private Integer pageNum;
    /**
     * ISBN号
     */
    private String isbn;
    /**
     * 简介
     */
    private String introduction;
    /**
     * 作者信息
     */
    private String authorIntroduction;

    public BookInformation() {
    }

    public BookInformation(String imageURL, Integer pageNum, String isbn, String introduction,
                           String authorIntroduction) {
        this.imageURL = imageURL;
        this.pageNum = pageNum;
        this.isbn = isbn;
        this.introduction = introduction;
        this.authorIntroduction = authorIntroduction;
    }

    public BookInformation(Integer id, String name, String category, Integer price,
                           String author, Integer quantity, String press, String imageURL,
                           Integer pageNum, String isbn, String introduction, String authorIntroduction) {
        super(id, name, category, price, author, quantity, press);
        this.imageURL = imageURL;
        this.pageNum = pageNum;
        this.isbn = isbn;
        this.introduction = introduction;
        this.authorIntroduction = authorIntroduction;
    }

    public String getImageURL() {
        return imageURL;
    }

    public void setImageURL(String imageURL) {
        this.imageURL = imageURL;
    }

    public Integer getPageNum() {
        return pageNum;
    }

    public void setPageNum(Integer pageNum) {
        this.pageNum = pageNum;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public String getIntroduction() {
        return introduction;
    }

    public void setIntroduction(String introduction) {
        this.introduction = introduction;
    }

    public String getAuthorIntroduction() {
        return authorIntroduction;
    }

    public void setAuthorIntroduction(String authorIntroduction) {
        this.authorIntroduction = authorIntroduction;
    }

    @Override
    public String toString() {
        return "BookInformation{" +
                "imageURL='" + imageURL + '\'' +
                ", pageNum=" + pageNum +
                ", isbn='" + isbn + '\'' +
                ", introduction='" + introduction + '\'' +
                ", authorIntroduction='" + authorIntroduction + '\'' +
                "} " + super.toString();
    }
}
