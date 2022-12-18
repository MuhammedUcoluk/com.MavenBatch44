package day05_MavenProjeOlusturma;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class C02_Calısma {
    public static void main(String[] args) {
        WebDriverManager.chromedriver();
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

        // http://zero.webappsecurity.com adresine gidin.
        driver.get("http://zero.webappsecurity.com");

        // Signin butonuna tıklayın
        driver.findElement(By.xpath("//button[@class='signin btn btn-info']")).click();
        // Login alanına "usarname" yazdırın
        WebElement login= driver.findElement(By.xpath("//input[@name='user_login']"));
        login.sendKeys("usarname");

        //  Signin butonuna tıklayın
        driver.findElement(By.xpath("//input[@value='Sign in']")).submit();

        //pay bills sayfasına gidiniz

        //amount kismina yatırmak istediginiz herhangi bir miktarı yazın
        //tarih kısmına 2020-09-10 yazdırın
        //pay buttonuna tıklayın
        //"The Payment war submitted" mesajının cıktıgını kontrol edin

    }
}
