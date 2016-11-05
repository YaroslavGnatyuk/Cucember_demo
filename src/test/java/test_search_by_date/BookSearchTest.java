package test_search_by_date;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(features = "classpath:.src/test/resourсes/feature/search_book_by_year/search_book_by_date.feature")
public class BookSearchTest {
}
