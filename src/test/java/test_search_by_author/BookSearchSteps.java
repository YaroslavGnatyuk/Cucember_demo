package test_search_by_author;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

/**
 * Created by asutp on 05.11.16.
 */
@RunWith(Cucumber.class)
@CucumberOptions(features = "classpath:/src/test/resourсes/feature/search_book_by_author/search_book_by_author.feature")
public class BookSearchSteps {
}
