package SeleniumProject;

import java.util.Scanner;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Adactinhotelapp {

	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://adactinhotelapp.com/index.php");
		String title = driver.getTitle();
		System.out.println(" Title of webpage:" + title);
		String currentUrl = driver.getCurrentUrl();
		System.out.println(" Webpage address:" + currentUrl);
		Scanner sc = new Scanner(System.in);

		driver.findElement(By.xpath("//input[@name='username']")).sendKeys("velmaniA");
		driver.findElement(By.xpath("//input[@name='password']")).sendKeys("K0AY0O");
		driver.findElement(By.xpath("//input[@name='login']")).click();

		// Select country

		WebElement element = driver.findElement(By.name("location"));
		driver.executeScript("arguments[0].setAttribute('style', 'border:2px solid red; background:yellow')", element);
		Select selectCountry = new Select(element);
		// Thread.sleep(3000);
		selectCountry.selectByIndex(2); // NewYork
		// Thread.sleep(3000);

		selectCountry.selectByValue("London"); // London
		// Thread.sleep(3000);

		selectCountry.selectByVisibleText("Brisbane"); // Brisbane

		String text = selectCountry.getFirstSelectedOption().getText();
		System.out.println("Country:" + text);

		// Select Hotel

		WebElement element2 = driver.findElement(By.name("hotels"));
		driver.executeScript("arguments[0].setAttribute('style', 'border:2px solid red; background:yellow')", element2);

		Select selectHotel = new Select(element2);
		// Thread.sleep(3000);

		selectHotel.selectByIndex(3);
		// Thread.sleep(3000);

		selectHotel.selectByValue("Hotel Cornice");
		// Thread.sleep(3000);

		selectHotel.selectByVisibleText("Hotel Creek");
		String textHotel = selectHotel.getFirstSelectedOption().getText();
		System.out.println("Hotel:" + textHotel);

		// Select RoomType

		WebElement element3 = driver.findElement(By.name("room_type"));
		driver.executeScript("arguments[0].setAttribute('style', 'border:2px solid red; background:yellow')", element3);

		Select selectRoomType = new Select(element3);
		// Thread.sleep(3000);

		selectRoomType.selectByIndex(1);
		// Thread.sleep(3000);

		selectRoomType.selectByValue("Super Deluxe");
		// Thread.sleep(3000);

		selectRoomType.selectByVisibleText("Double");
		String textRoomType = selectRoomType.getFirstSelectedOption().getText();
		System.out.println("RoomType:" + textRoomType);

		// Select RoomNo

		WebElement element4 = driver.findElement(By.name("room_nos"));
		driver.executeScript("arguments[0].setAttribute('style', 'border:2px solid red; background:yellow')", element4);

		Select selectRoomNo = new Select(element4);
		// Thread.sleep(3000);

		selectRoomNo.selectByIndex(8);
		// Thread.sleep(3000);

		selectRoomNo.selectByValue("4");
		// Thread.sleep(3000);

		selectRoomNo.selectByVisibleText("6 - Six");
		String textRoomNo = selectRoomNo.getFirstSelectedOption().getText();
		System.out.println("RoomNo:" + textRoomNo);

		// Date element

		driver.findElement(By.xpath("//input[@name='datepick_in']")).sendKeys("07/08/2024");
		driver.findElement(By.xpath("//input[@name='datepick_out']")).sendKeys("08/08/2024");

		// Select AdultRoom

		WebElement element5 = driver.findElement(By.name("adult_room"));
		driver.executeScript("arguments[0].setAttribute('style', 'border:2px solid red; background:yellow')", element5);

		Select selectAdultRoom = new Select(element5);
		// Thread.sleep(3000);

		selectAdultRoom.selectByIndex(4);
		// Thread.sleep(3000);

		selectAdultRoom.selectByValue("3");
		// Thread.sleep(3000);

		selectAdultRoom.selectByVisibleText("1 - One");
		String textAdultRoom = selectAdultRoom.getFirstSelectedOption().getText();
		System.out.println("AdultRoom:" + textAdultRoom);

		// Select ChildRoom

		WebElement element6 = driver.findElement(By.name("child_room"));
		driver.executeScript("arguments[0].setAttribute('style', 'border:2px solid red; background:yellow')", element6);

		Select selectChildRoom = new Select(element6);
		// Thread.sleep(3000);

		selectChildRoom.selectByIndex(2);
		// Thread.sleep(3000);

		selectChildRoom.selectByValue("4");
		// Thread.sleep(3000);

		selectChildRoom.selectByVisibleText("1 - One");
		String textChildRoom = selectChildRoom.getFirstSelectedOption().getText();
		System.out.println("ChildRoom:" + textChildRoom);

		// search

		WebElement element7 = driver.findElement(By.id("Submit"));
		driver.executeScript("arguments[0].setAttribute('style', 'border:2px solid red; background:yellow')", element7);
		element7.click();

		// select radio-button -->click

		driver.findElement(By.id("radiobutton_0")).click();
		
		// continue
		driver.findElement(By.id("continue")).click();

		// get title
		String windowHandle = driver.getWindowHandle();
		System.out.println(windowHandle + driver.getTitle());

		// Book a hotel
		// first name
		System.out.print("Enter the first name:");
		String firstName = sc.nextLine();
		WebElement element8 = driver.findElement(By.id("first_name"));
		element8.sendKeys(firstName);
		
		// last name
		System.out.print("Enter the last name:");
		String lastName = sc.nextLine();
		WebElement lastName1 = driver.findElement(By.id("last_name"));
		lastName1.sendKeys(lastName);
		
		// Billing Address address
		System.out.print("Enter the Billing Address:");
		String address = sc.nextLine();
		WebElement billingAddress = driver.findElement(By.id("address"));
		billingAddress.sendKeys(address);
		
		// credit card no
		System.out.print("Enter the credit card no -16 digit:");
		String creditCardNo = sc.nextLine();
		WebElement creditCard = driver.findElement(By.id("cc_num"));
		creditCard.sendKeys(creditCardNo);
		
		// Credit Card Type
		WebElement cardType = driver.findElement(By.id("cc_type"));
		Select creditCardType = new Select(cardType);
		creditCardType.selectByValue("VISA");
		String ccType = creditCardType.getFirstSelectedOption().getText();
		System.out.println("Credit Card Type:"+ccType);
		
		//select-month
		WebElement selectMonth = driver.findElement(By.id("cc_exp_month"));
		Select selectMonthToBook =new Select(selectMonth);
		selectMonthToBook.selectByVisibleText("August");
		String selectedMonth = selectMonthToBook.getFirstSelectedOption().getText();
		System.out.println("SelectedMonth:"+selectedMonth);
		
		//select year
		WebElement selectYear = driver.findElement(By.id("cc_exp_year"));
		Select selectYearToBook =new Select(selectYear);
		selectYearToBook.selectByVisibleText("2024");
		String selectedYear = selectYearToBook.getFirstSelectedOption().getText();
		System.out.println("SelectedMonth:"+selectedYear);

		//cvv number
		System.out.print("Enter the cvv number:");
		String cvv = sc.nextLine();
		WebElement cvvNo = driver.findElement(By.id("cc_cvv"));
		cvvNo.sendKeys(cvv);
		//book now
		driver.findElement(By.id("book_now")).click();
		
		String bookedPage = driver.getWindowHandle();
		System.out.println(bookedPage + driver.getTitle());
//		//get order number
//		WebElement orderNo = driver.findElement(By.xpath("//td[contains(text(),'Order No.')]/following::input[@name='order_no']"));
//		String orderNumber = orderNo.getText();
//		System.out.println("Your order No:"+orderNumber);
		Thread.sleep(10000);
		//logout
		driver.findElement(By.id("logout")).click();
		sc.close();
	}

}
