package org.cts.data;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Google {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Poo\\Desktop\\project\\projeect\\driver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.google.com/");
		}
	public void najubhai() {
		// TODO Auto-generated method stub
   System.out.println("najju");
	}
}
