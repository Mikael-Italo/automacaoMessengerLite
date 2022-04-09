package runners;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "classpath:Features",
        glue= {"steps"},
        tags = {"@Send"},
        plugin = {"pretty", "html:target/cucumber-reports"},
        monochrome = true,
        dryRun = false
        )

public class Send {

}
