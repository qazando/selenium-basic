import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestLogin {

    public static void main(String[] args) throws InterruptedException {


        //MAXIMIZAR TELA

        System.setProperty("webdriver.chrome.driver", "chromedriver");

        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        //abrindo página do teste
        driver.get("https://automationpratice.com.br/login");

        //Mapeando os elementos
        WebElement campoEmail = driver.findElement(By.id("user"));
        WebElement campoSenha = driver.findElement(By.id("password"));
        WebElement btnLogin = driver.findElement(By.id("btnLogin"));

        //Chamando os elementos e executando acoes
        campoEmail.sendKeys("teste@gmail.com");
        campoSenha.sendKeys("123456");
        btnLogin.click();

        //sleep
        Thread.sleep(3000);

        //clicar no botão ok do popup

        //validar texto Pending Orders

        //fechando navegador
        driver.quit();
    }
}