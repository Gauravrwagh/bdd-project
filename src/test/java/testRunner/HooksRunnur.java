package testRunner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;


@RunWith(Cucumber.class)
@CucumberOptions

(features=".//feature\\Demologin.feature",
 glue= "stepDefinations",
 dryRun= false,
 monochrome= true,
 plugin={"pretty",
		 "html:test.output"
}
)

public class HooksRunnur {
	
	
     
}
