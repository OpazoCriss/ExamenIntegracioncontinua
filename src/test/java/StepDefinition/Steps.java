package StepDefinition;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;


public class Steps {
	
	WebDriver driver;
    
	@Given("Abrir Chrome")
    public void abrir_Chrome() {
        System.out.println("Se abre el navegador de google chrome");
        System.setProperty("webdriver.chrome.driver", "D:\\chrome antiguo\\chromedriver.exe;");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://PetSmile/login/index.php");
    }
 
    @When("ingresa Username {string} y Password {string}")
    public void ingresa_Username_y_Password(String string, String string2) {
    	System.out.println("Ingreso de credenciales de usuario");
    	System.out.println("se ingresa el nombre de usuario y contraseña en la pagina");
    	driver.findElement(By.id("username")).sendKeys(string);
    	driver.findElement(By.id("password")).sendKeys(string2);
    }
    
    @Then("inicia sesion")
    public void inicia_sesion() {
    	System.out.println("acceso a sesion con datos ingresados");
    	driver.findElement(By.id("loginbtn")).click();
    }
     
    
}
