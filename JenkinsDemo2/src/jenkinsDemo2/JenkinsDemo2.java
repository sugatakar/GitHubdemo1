package jenkinsDemo2;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class JenkinsDemo2 {
@Test
public void jrnkinsDemo1() throws Exception
{
	WebDriver driver= new FirefoxDriver();
	driver.get("file:///C:/Users/sugata/Desktop/fileupload.html");
	driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	driver.manage().window().maximize();  
	driver.findElement(By.xpath("//input[@type='file']")).click();
	Runtime.getRuntime().exec("C:\\Users\\sugata\\Desktop\\AutoItexe\\AutoITfileupload.exe");
	Thread.sleep(10000);
	driver.close();
}
}
