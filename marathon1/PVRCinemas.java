package marathon1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class PVRCinemas {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.pvrcinemas.com");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		// Select the city as Chennai
		driver.findElement(By.xpath("(//span[text()='Chennai'])[1]")).click();
		// Click on hamburger button
		driver.findElement(By.xpath("//div[@class='nav-icon']")).click();
		// Click on Movie Library
		driver.findElement(By.xpath("//a[text()='Movie Library']")).click();
		// Select the city
		WebElement city = driver.findElement(By.name("city"));
		Select drop1 = new Select(city);
		drop1.selectByIndex(19);
		// Select the Genre
		WebElement genre = driver.findElement(By.xpath("//select[@name='genre']"));
		Select drop2 = new Select(genre);
		drop2.selectByIndex(3);
		// Select the language
		WebElement language = driver.findElement(By.xpath("//select[@name='lang']"));
		Select drop3 = new Select(language);
		drop3.selectByIndex(1);
		// Click on Apply
		driver.findElement(By.xpath("//button[@class='btn btn-submit btn-primary']")).click();
		Thread.sleep(5000);
		// Click on first resulting animation movie
		driver.findElement(By.xpath("//div[text()='Paw Patrol']")).click();
		// Click Proceed to book
		driver.findElement(By.xpath("//button[text()='Proceed To Book']")).click();
		//Thread.sleep(5000);
		// Enter the field Cinema
		driver.findElement(By.name("cinemaName")).click();
		driver.findElement(By.xpath("//select[@name='cinemaName']/option[5]")).click();
		driver.findElement(By.xpath("(//div[@class='row'])[3]")).click();
		// Enter the show timing
		driver.findElement(By.xpath("//select[@name='timings']")).click();
		driver.findElement(By.xpath("//select[@name='timings']/option[4]")).click();
		driver.findElement(By.xpath("(//div[@class='row'])[3]")).click();
		// Enter the no. of seats
		driver.findElement(By.xpath("//input[@name='noOfTickets']")).click();
		driver.findElement(By.name("noOfTickets")).sendKeys("2");
		// Enter the name
		driver.findElement(By.xpath("//input[@name='name']")).click();
		driver.findElement(By.xpath("//input[@name='name']")).sendKeys("Kalyan");
		// Enter the email
		driver.findElement(By.xpath("//input[@name='email']")).click();
		driver.findElement(By.xpath("//input[@name='email']")).sendKeys("kalyan.tbs@gmail.com");
		// Enter the mobile number
		driver.findElement(By.xpath("(//input[@class='input-text form-control dark ng-untouched ng-pristine ng-invalid'])[1]")).click();
		driver.findElement(By.xpath("(//input[@class='input-text form-control dark ng-untouched ng-pristine ng-invalid'])[1]")).sendKeys("9894575417");
		// Enter the F&B
		driver.findElement(By.xpath("//select[@name='food']")).click();
		driver.findElement(By.xpath("//option[text()='No']")).click();
		driver.findElement(By.xpath("(//div[@class='row'])[3]")).click();
		// Enter Other Requirements
		driver.findElement(By.xpath("(//div[@class='form-group col-sm-6 input-list']/input)[7]")).click();
		driver.findElement(By.xpath("(//div[@class='form-group col-sm-6 input-list']/input)[7]")).sendKeys("No");
		// Click on Copy to Self
		driver.findElement(By.xpath("//span[text()='Copy To Self']")).click();
		// Click on button Send Request
		driver.findElement(By.xpath("//button[text()='SEND REQUEST']")).click();
		// Click on Cancel button
		driver.findElement(By.xpath("(//button[@class='btn already-member'])[4]")).click();
		// Close the OTP dialog
		driver.findElement(By.className("swal2-close")).click();
		// Get the title of the page
		String title = driver.getTitle();
		System.out.println(title);

	}

}
