import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(features = {"C:\\aplana\\autotests\\src\\main\\resources"}, glue = {"ru.jigsawztw.autotests"},
        plugin = {
                "util.AllureReporter",
        }
)
public class CucumberRunner {

}