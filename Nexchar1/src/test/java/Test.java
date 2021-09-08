import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Test {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub\
	 WebDriverManager.firefoxdriver().setup();
     WebDriver driver = new FirefoxDriver();
     driver.get("http://nexchar.com/signIn");
     
//     //Thread.sleep(5000);
//     
//     //driver.close();
//     
////     System.out.println("Title of the page :" +driver.getTitle());
////     System.out.println("Url of the page :"+driver.getCurrentUrl());
////     System.out.println("Source code of the page "+driver.getPageSource());
////     
//  // for windows maximize
//  		driver.manage().window().maximize();
//  		
//  		//How to Navigate
//		driver.navigate().to("http://sheradambd.com/");
//     
//		//Navigate back nexchar
//				driver.navigate().back();
     
   //Input box testing --
		
   		// 1. Id: edit input box using id locator
   		driver.findElement(By.id("Email")).sendKeys("gift_shop");
   		
//   		WebElement emailbox=driver.findElement(By.id("Email"));
//   		emailbox.sendKeys("Abc");
//   		
//   		emailbox.sendKeys("bbc");
   			
   		// 2. Name: edit input box 2 using name locator
   		driver.findElement(By.name("Password")).sendKeys("12345");
   		
   		// 3.xPath: show password button testing using  xPath locator
   		
   		driver.findElement(By.xpath("//*[@class='icon']")).click();
   		
   		// 4.cssSelector: sign in button testing using cssSelector
   		
   		driver.findElement(By.cssSelector("body.antialiased:nth-child(2) div.page:nth-child(1) div.flex-fill.d-flex.flex-column.justify-content-center.py-4 div.container-tight.py-6 form.card.card-md.sm-borderless div.card-body:nth-child(1) div.form-footer:nth-child(5) > button.btn.btn-primary.w-100")).click();
   		
   		driver.navigate().back();
   		
   		// 5. LinkText: contact page visit using linkText
   		driver.findElement(By.linkText("Contact")).click();
   		Thread.sleep(1000);
   		
   		//6. PartialLinkText: contact page visit using linkText
   		driver.findElement(By.partialLinkText("Dem")).click();
   		
   		// TextArea Test--
   		Thread.sleep(1000);
   		driver.get("https://nexchar.com/contactus");
   		driver.findElement(By.id("Message")).sendKeys("Testing");
   		
   		// Image button testing--
   		Thread.sleep(3000);
   		//7. ClassName: Home page visit using classname locator
   		driver.findElement(By.className("navbar-brand-image")).click();
   
	}

}
