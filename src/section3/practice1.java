package section3;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

public class practice1 {
	@FindBy(xpath = "//button[text()='✕']")
	private WebElement crossIMG;
	
	public WebElement getCrossIMG() {
		return crossIMG;

	}
	public static void main(String[]args){
		WebDriver dr=new FirefoxDriver();
		dr.get("https://www.flipkart.com/");
		practice1 p=PageFactory.initElements(dr, practice1.class);
		p.crossIMG.click();
	}
}
