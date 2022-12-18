package day05_MavenProjeOlusturma;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;
import java.util.List;

public class C01_FirstMavenClass {
    public static void main(String[] args) {

        WebDriverManager.chromedriver().setup();
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

        // amazon sayfasına gidelim.
        driver.get("https://www.amazon.com");

        // arama kutusunu locate edelim.
        WebElement aramaCubugu=driver.findElement(By.id("twotabsearchtextbox"));

        // "Samsung headphones" ile arama yapalım
        aramaCubugu.sendKeys("Samsung headphones");
        aramaCubugu.submit();
        // Bulunan sonuç yazısını yazdıralım

        WebElement sonucYazisi= driver.findElement(By.xpath("(//div[@class='a-section a-spacing-small a-spacing-top-small'])[1]"));
        System.out.println(sonucYazisi.getText());

        //ilk ürünü tıklayalım
        driver.findElement(By.xpath("(//div[@class='a-section aok-relative s-image-fixed-height'])[1]")).click();

        //Bir önceki sayfaya dönüp sayfadaki başlıkları yazdıralım

        driver.navigate().back();
        List<WebElement> basliklarListesi=driver.findElements(By.xpath("//a[@class='a-link-normal s-navigation-item']"));
        System.out.println("Sayfadaki başlık sayısı : " + basliklarListesi.size());

        driver.close();
    }
}
