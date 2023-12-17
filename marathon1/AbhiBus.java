package marathon1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class AbhiBus {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.abhibus.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		// Type Chennai in From Station
		driver.findElement(By.xpath("//input[@placeholder='From Station']")).click();
		driver.findElement(By.xpath("//input[@placeholder='From Station']")).sendKeys("Chennai");
		driver.findElement(By.xpath("//div[text()='Chennai']")).click();
		// Type Bangalore in To Staion
		driver.findElement(By.xpath("//input[@placeholder='To Station']")).click();
		driver.findElement(By.xpath("//input[@placeholder='To Station']")).sendKeys("Bangalore");
		driver.findElement(By.xpath("//div[text()='Bangalore']")).click();
		// Select the date as Tomorrow
		driver.findElement(By.xpath("//a[text()='Tomorrow']")).click();
		//Thread.sleep(2000);
		// Print the name of the first resulting bus
		String text = driver.findElement(By.xpath("(//h5[text()='Orange Tours and Travels'])[1]")).getText();
		System.out.println(text);
		// Choose SLEEPER in the left menu from Bus Type
		driver.findElement(By.xpath("//span[text()='Sleeper']")).click();
		// Print the first resulting bus seat count
		String text2 = driver.findElement(By.xpath("(//div[@class='text-grey']/small)[1]")).getText();
		System.out.println(text2);
		// Click Show seats
		driver.findElement(By.xpath("//button[@class='btn bus-info-btn filled primary sm inactive button']")).click();
		// Choose any one available seat
		driver.findElement(By.xpath("//button[@class='seat sleeper']/span[text()='U3']")).click();
		// Select first boarding point
		driver.findElement(By.xpath("//p[text()='sholinganallur max  (Pickup Van-Bus)']")).click();
		// Select first dropping point
		driver.findElement(By.xpath("//p[text()='Hosur- OPP BUS STOP NEAR YASODHA TOWERS']")).click();
		// Print the selected seat
		String text3 = driver.findElement(By.xpath("//span[text()='Seat Selected :']")).getText();
		System.out.println(text3);
		// Print the total fare
		String text4 = driver.findElement(By.xpath("//span[text()='Base Fare :']")).getText();
		System.out.println(text4);
		// Get the Title of the page
		String title = driver.getTitle();
		System.out.println(title);
		driver.close();

	}

}
