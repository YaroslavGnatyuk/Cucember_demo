package lib;

import java.util.*;
import java.util.stream.Collectors;

/**
 * Created with IntelliJ IDEA.
 * User: asutp
 * Date: 04.11.16
 * Time: 22:04
 * To change this template use File | Settings | File Templates.
 */
public class Library {
    private final List<Book> store = new ArrayList<>();

    public void addBook(final Book book) {
        store.add(book);
    }

    public List<Book> findBooks(final Date from, final Date to) {
        Calendar end = Calendar.getInstance();
        end.setTime(to);
        end.roll(Calendar.YEAR, 1);

        return store.stream().filter(book -> {
            return from.before(book.getPublished()) && end.getTime().after(book.getPublished());
        }).sorted(Comparator.comparing(Book::getPublished).reversed()).collect(Collectors.toList());
    }

    public List<Book> findBooks(String author){
        return store.stream().filter(b->(b.getAuthor().equals(author))).collect(Collectors.toList());
    }
}
