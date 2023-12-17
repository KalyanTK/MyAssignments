package marathon1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Amazon {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		// Click on search box
		driver.findElement(By.id("twotabsearchtextbox")).click();
		// In search box, type "Bags for b"
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys("Bags for b");
		// Choose the item in the result (bags for boys)
		driver.findElement(By.xpath("(//div[@class='s-suggestion s-suggestion-ellipsis-direction'])[1]")).click();
		// Print the total number of results 
		String text1 = driver.findElement(By.xpath("//span[text()='1-48 of over 30,000 results for']")).getText();
		System.out.println(text1);
		// Select the first 2 brands in left menu
		//Thread.sleep(5000);
		driver.findElement(By.xpath("(//span[text()='American Tourister'])[2]")).click();
		driver.findElement(By.xpath("//span[text()='Gear']")).click();
		// Choose New Arrivals (Sort)
		driver.findElement(By.xpath("//span[@id='a-autoid-0-announce']")).click();
		driver.findElement(By.xpath("//a[@id='s-result-sort-select_4']")).click();
		// Print the first resulting bag info (name, discounted price)
		String text2 = driver.findElement(By.xpath("(//span[text()='American Tourister'])[1]")).getText();
		System.out.println(text2);
		String text3 = driver.findElement(By.xpath("//span[text()='Yoodle 2.O Vegetable Green Backpack For 4 to 6 Year Kids. (Medium Size)']")).getText();
		System.out.println(text3);
		// Get the page title and close the browser(driver.close())
		String title = driver.getTitle();
		System.out.println(title);
		Thread.sleep(5000);
		driver.close();
	}

}
