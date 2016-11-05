package feature.sweet_home;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

/**
 * Created by yroslav on 11/5/16.
 */
@RunWith(Cucumber.class)
@CucumberOptions(features = "src/test/resources/feature/sweet_home/logging.feature")
public class SweetHomeLoggingTest {
}
