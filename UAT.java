import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
public class PG2 {

    public static void main(String[] args) throws InterruptedException {
        try {
            WebDriver driver = new ChromeDriver();

            String baseUrl = "http://localhost:8888/";

            driver.get(baseUrl);
            Thread.sleep(2000);
            WebElement exampleStep1 = driver.findElement(By.xpath("/html/body/div[1]/div/div[1]/div[1]/a[2]/span[2]"));
            exampleStep1.click();
            Thread.sleep(2000);
            WebElement exampleStep2 = driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div/div[2]/div[10]"));
            exampleStep2.click();
            Thread.sleep(2000);
            WebElement exampleStep3 = driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div/div[3]/div[3]/div/button/span[1]"));
            exampleStep3.click();
            Thread.sleep(2000);
            for (int i= 0; i<6; i++){
                WebElement next = driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div/div[4]/button/span[1]"));
                next.click();
                Thread.sleep(2000);
            }
            WebElement exampleStep10 = driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div/div[5]/button/span[1]"));
            exampleStep10.click();
            Thread.sleep(2000);
            WebElement exampleStep11 = driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div/div[5]/button/span[1]"));
            exampleStep11.click();
            Thread.sleep(2000);
            WebElement exampleStep12 = driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div/div[5]/button/span[1]"));
            exampleStep12.click();
            Thread.sleep(2000);
            WebElement exampleStep13 = driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div/div[4]/button[2]/span[1]"));
            exampleStep13.click();
            Thread.sleep(3000);
            driver.close();
            System.out.println("success");
        }

        catch(Exception e){
            System.out.println("fail");
        }

    }

}