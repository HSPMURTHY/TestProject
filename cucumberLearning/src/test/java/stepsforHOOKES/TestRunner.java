package stepsforHOOKES;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;


@RunWith(Cucumber.class)
//@CucumberOptions(features="D:\\cucumber\\cucumberLearning\\src\\test\\resources\\Features\\login.feature",glue= {"StepDefinition"})

@CucumberOptions(features="D:/cucumber/cucumberLearning/src/test/resources/HookesForDemo/DemoHookes.feature",
glue= {"stepsforHOOKES"},
monochrome=true,
plugin = {"pretty","html:target/reports.html"}

)

/*
 * 
 * 
 *
 @CucumberOptions(features="D:/cucumber/cucumberLearning/src/test/resources/Features/OrangeHRLoginScenaioOutline.feature",
glue= {"StepDefinition"},
tags = "smoke"
)
 @CucumberOptions(features="D:/cucumber/cucumberLearning/src/test/resources/Features/login.feature",
glue= {"StepDefinition"},
tags= "smoke"
)*/


public class TestRunner {

}
