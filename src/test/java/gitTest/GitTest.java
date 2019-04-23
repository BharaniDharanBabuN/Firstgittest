package gitTest;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class GitTest {
	public static void main(String[] args) throws InterruptedException, IOException {
		WebDriver wd = new FirefoxDriver();
		wd.manage().window().maximize(); // used to maximise the browser
		wd.get("https://www.google.com");
		File src = ((TakesScreenshot)wd).getScreenshotAs(OutputType.FILE);
		Thread.sleep(2000);
		FileUtils.copyFile(src, new File("D:\\SeleniumWorkspace1\\GitTest\\ScreenShot\\google.jpg"));

	}
}
