package feature.search_by_author;

import cucumber.api.Format;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import lib.Book;
import lib.Library;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import static org.hamcrest.core.IsEqual.equalTo;
import static org.junit.Assert.assertThat;

/**
 * Created by asutp on 05.11.16.
 */
public class BookSearchByAuthorSteps {
    Library library = new Library();
    List<Book> result = new ArrayList<>();

    @Given(".+book with the title '(.+)', written by '(.+)', published in (.+)")
    public void addNewBook(final String title, final String author, @Format("dd MMMMM yyyy") final Date published) {
        Book book = new Book(title, author, published);
        library.addBook(book);
    }

    @When("^the customer searches for books written by '(.+)'$")
    public void setSearchParameters(final String author) {
        result = library.findBooks(author);
    }

    @Then("(\\d+) books should have been found$")
    public void verifyAmountOfBooksFound(final int booksFound) {
        assertThat(result.size(), equalTo(booksFound));
    }

    /*@Then("Book (\\d+) should have the title '(.+)'$")
    public void verifyBookAtPosition(final int position, final String title) {
        assertThat(result.get(position - 1).getTitle(), equalTo(title));
    }*/
}
