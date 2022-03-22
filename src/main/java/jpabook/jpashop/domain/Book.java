package jpabook.jpashop.domain;

import javax.persistence.Column;
import javax.persistence.Entity;

@Entity
public class Book extends Item{

    private String author;
    private String isbin;

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getIsbin() {
        return isbin;
    }

    public void setIsbin(String isbin) {
        this.isbin = isbin;
    }
}
