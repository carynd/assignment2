package assignment2.Book_review.entity;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity

public class books {

    @Id

    private String bookid;
    private  String name;
    private  String author;
    private  String publication;
    private  String category;
    private   int pages;
    private   int price;

    //for entity to bind we use this constructor
    public books(){

    }
    public books(String bookid, String name, String author, String publication, String category, int pages, int price) {
        this.bookid = bookid;
        this.name = name;
        this.author = author;
        this.publication = publication;
        this.category = category;
        this.pages = pages;
        this.price = price;
    }

    @Override
    public String toString() {
        return "books{" +
                "bookid='" + bookid + '\'' +
                ", name='" + name + '\'' +
                ", author='" + author + '\'' +
                ", publication='" + publication + '\'' +
                ", category='" + category + '\'' +
                ", pages=" + pages +
                ", price=" + price +
                '}';
    }

    public String getBookid() {
        return bookid;
    }

    public void setBookid(String bookid) {
        this.bookid = bookid;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getPublication() {
        return publication;
    }

    public void setPublication(String publication) {
        this.publication = publication;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public int getPages() {
        return pages;
    }

    public void setPages(int pages) {
        this.pages = pages;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }




}



