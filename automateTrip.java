/**
 * 
 */
package makeMyTrip;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class automateTrip {
	
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\singh\\Downloads\\chromedriver_win32\\chromedriver.exe");
		String Url = "https://www.makemytrip.com/railways/";
        String expectedTitle = "IRCTC Train Tickets Reservation | Indian Railways Reservation | IRCTC Train Tickets Booking, Trains Enquiry Online : MakeMyTrip";
        String myTitle = "";
		WebDriver d = new ChromeDriver();
		d.get("https://www.makemytrip.com/railways/");
		myTitle = d.getTitle();
		d.manage().window().maximize();
		//d.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS:);
		if (myTitle.contentEquals(expectedTitle))
		{
			// myTitle == expectedTitle
			System.out.println("Title Matched");
			System.out.println(expectedTitle);
			//WebElement from = d.findElement(By.xpath(""));
			//from.sendKeys("NDLS");
			//from.click();
//			WebElement to = d.findElement(By.xpath("\"/html/body/div/div/div[2]/div/div/div/div[2]/div/div[2]/div[1]/div/div/div/input\""));
			d.findElement(By.xpath("//*[@id=\"root\"]/div/div[2]/div/div/div/div[2]/div/div[1]")).click();
			Thread.sleep(3000);
			d.findElement(By.xpath("//div[@class='hsw_autocomplePopup autoSuggestPlugin ']/div/input")).sendKeys("NDLS");
			d.findElement(By.xpath("//*[@id=\"root\"]/div/div[2]/div/div/div/div[2]/div/div[2]")).click();
//			Thread.sleep(4000);
			d.findElement(By.xpath("//*[@id=\"root\"]/div/div[2]/div/div/div/div[2]/div/div[2]")).click();
			Thread.sleep(3000);
			d.findElement(By.xpath("//div[@class='hsw_autocomplePopup autoSuggestPlugin ']/div/input")).sendKeys("lucknow");
			Thread.sleep(3000);
			d.findElement(By.xpath("//*[@id=\"react-autowhatever-1-section-0-item-0\"]")).click(); 
			Thread.sleep(3000);
//			d.findElement(By.xpath("//*[@id=\"react-autowhatever-1-section-0-item-0\"]")).click();
			d.findElement(By.xpath("//*[@id=\"travelDate\"]")).click();
			Thread.sleep(3000);
			d.findElement(By.xpath("//*[@id=\"root\"]/div/div[2]/div/div/div/div[2]/div/div[3]/div[1]/div/div/div/div[2]/div/div[2]/div[1]/div[3]/div[3]/div[6]")).click();
			Thread.sleep(3000);
			d.findElement(By.xpath("//*[@id=\"root\"]/div/div[2]/div/div/div/div[2]/div/div[4]/label/span")).click();
			Thread.sleep(3000);
			d.findElement(By.xpath("//*[@id=\"root\"]/div/div[2]/div/div/div/div[2]/div[1]/div[4]/ul/li[3]")).click();
			Thread.sleep(3000);
			d.findElement(By.xpath("//*[@id=\"root\"]/div/div[2]/div/div/div/div[2]/p/a")).click();
//			to.click();
			Thread.sleep(5000);
//			to.sendKeys("lucknow");	
        } 
		else 
		{
            System.out.println("Title does not match");
        }
		Thread.sleep(10000);
		System.out.print(d.getTitle());
		d.quit();
	}
	//*[@id=\"react-autowhatever-1-section-0-item-0\"]/div
}

//d.findelement