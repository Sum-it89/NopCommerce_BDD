import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;





@RunWith(Cucumber.class)

@CucumberOptions(features = "src/test/resources/features", tags ="@Register or @Hover or @Comment", plugin = { "pretty", "html:target/cucumber-reports/report.html"}, publish = true)
public class RunCuke
{

}
