package runner;

import org.junit.BeforeClass;
import org.junit.runner.RunWith;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import conexoes.Drivers;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import io.cucumber.junit.CucumberOptions.SnippetType;

@RunWith(Cucumber.class)
@CucumberOptions(
		features = "src/test/resources/features",
	    glue = "steps",
		tags = "@cadastrar",
		monochrome = true,
		dryRun = false,
		plugin = {"pretty","html:target/cucumber-report.html"},
		snippets = SnippetType.CAMELCASE
		)
public class Executa extends Drivers {


	@BeforeClass
	public static void iniciarTeste() {
		Executa.abrirNavegador();
	}
	
	
	public static void abrirNavegador() {
		String navegador = "chrome";
		//chrome ou firefox
		if(navegador.equalsIgnoreCase("chrome")) {
			System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");
			driver = new ChromeDriver();
		}else if(navegador.equalsIgnoreCase("firefox")) {
			System.setProperty("webdriver.gecko.driver", "./Drivers/geckodriver.exe");
			driver = new FirefoxDriver();
			}
		
	driver.get("https://www.grocerycrud.com/v1.x/demo/bootstrap_theme");
	driver.manage().window().maximize();
		
	}
//	@AfterClass
public static void fecharNavegador() {
	driver.quit();
}
	
	
}
