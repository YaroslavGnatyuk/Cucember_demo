package lib;

import java.util.Date;

/**
 * Created with IntelliJ IDEA.
 * User: asutp
 * Date: 04.11.16
 * Time: 22:04
 * To change this template use File | Settings | File Templates.
 */
public class Book {
    private final String title;
    private final String author;
    private final Date published;


    public Book(String title, String author, Date published) {
        this.title = title;
        this.author = author;
        this.published = published;
    }

    public Book() {
        this.published = new Date (System.currentTimeMillis());
        author = "some_author";
        title = "some_title";
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public Date getPublished() {
        return published;
    }

}
