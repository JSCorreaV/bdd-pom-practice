
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)

@CucumberOptions(
        features = {"src/test/resources/example.feature"}
        ,glue= {"stepdefinitions"}
        ,snippets = CucumberOptions.SnippetType.CAMELCASE
)

public class TestRunner {

}

