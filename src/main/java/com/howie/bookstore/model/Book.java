package com.howie.bookstore.model;

/**
 * Created with IntelliJ IDEA
 *
 * @Author yuanhaoyue swithaoy@gmail.com
 * @Description
 * @Date 2018-12-31
 */

public class Book {

    private Integer id;

    /**
     * 名称
     */
    private String name;

    /**
     * 种类
     */
    private String category;

    /**
     * 价格
     */
    private Integer price;

    /**
     * 作者
     */
    private String author;

    /**
     * 出版社
     */
    private String press;
    /**
     * 库存数量
     */
    private Integer quantity;

    public Book() {
    }

    public Book(Integer id, String name, String category, Integer price, String author,
                Integer quantity, String press) {
        this.id = id;
        this.name = name;
        this.category = category;
        this.price = price;
        this.author = author;
        this.quantity = quantity;
        this.press = press;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public Integer getPrice() {
        return price;
    }

    public void setPrice(Integer price) {
        this.price = price;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public Integer getQuantity() {
        return quantity;
    }

    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }

    public String getPress() {
        return press;
    }

    public void setPress(String press) {
        this.press = press;
    }

    @Override
    public String toString() {
        return "Book{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", category='" + category + '\'' +
                ", price=" + price +
                ", author='" + author + '\'' +
                ", quantity=" + quantity +
                ", press=" + press +
                '}';
    }
}
