package com.engage.autoqa.core.actions;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.io.IOException;
import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import com.engage.autoqa.core.base.TestContext;
import io.cucumber.java.Scenario;

public class CommonActions extends TestContext  {

	Actions action;
	String name;
	String pass;

	By Userannotheraccount = By.xpath("//div[text()='Use another account']");
	By EnterSignin = By.xpath("//input[@type='email']");
	By Next = By.xpath("//input[@type='submit']");
	By EnterPassword = By.xpath("//input[@type='password']");
	By Signin = By.xpath("//input[@type='submit']");
	By Login = By.xpath("//input[@id='idSIButton9']");
	By No = By.xpath("(//div[@class='inline-block button-item ext-button-item'])[1]//input");
	// By DisplayName = By.xpath("//div//input[@name='DisplayName'] [1]");

	public void launchUrl(String url) {
		driver.get(url);
	}

	public void maxWindow() {
		driver.manage().window().maximize();
	}

	public void waitAction() {
		try {
			Thread.sleep(10000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

	public void waitMore() {
		try {
			Thread.sleep(15000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

	public void enterSignin(String username) throws IOException {
		action = new Actions(driver);
		action.sendKeys(username).perform();
	}

	public void clickNext() {
		WebElement element = driver.findElement(Next);
		JavascriptExecutor executor = (JavascriptExecutor) driver;
		executor.executeScript("arguments[0].click();", element);
	}

	public void enterPassword(String Password) throws InterruptedException {

		WebElement element = driver.findElement(EnterPassword);
		action.sendKeys(Password).perform();
		waitAction();
	}

	public void loginClick() throws InterruptedException {
		WebElement login = driver.findElement(Login);
		JavascriptExecutor executor = (JavascriptExecutor) driver;
		executor.executeScript("arguments[0].click();", login);
	}

	public void clickNo() {
		WebElement clickNo = driver.findElement(No);
		JavascriptExecutor executor = (JavascriptExecutor) driver;
		executor.executeScript("arguments[0].click();", clickNo);
	}

	public void useAnotherAccount() {
		WebElement clickanotheracc = driver.findElement(Userannotheraccount);
		JavascriptExecutor executor = (JavascriptExecutor) driver;
		executor.executeScript("arguments[0].click();", clickanotheracc);
	}

	public void click(WebElement Webelement) {
		action.doubleClick(Webelement).perform();
	}

	public void eraseText() {
		
		Robot r;
		try {
			r = new Robot();
			r.keyPress(KeyEvent.VK_CONTROL);
			r.keyPress(KeyEvent.VK_A);
			r.keyRelease(KeyEvent.VK_A);
			r.keyRelease(KeyEvent.VK_CONTROL);
			r.keyPress(KeyEvent.VK_DELETE);
			r.keyRelease(KeyEvent.VK_DELETE);
		} catch (AWTException e) {
			e.printStackTrace();
		}
	}

	public void clearText(By element) {
		WebElement textClear = driver.findElement(element);
		textClear.clear();
	}

	public void scrollDown() {
		action = new Actions(driver);
		action.sendKeys(Keys.PAGE_DOWN).build().perform();
		action.sendKeys(Keys.END).build().perform();
	}

	public void scrollUp() {
		action = new Actions(driver);
		action.sendKeys(Keys.PAGE_UP).build().perform();
		waitAction();
	}

	public void fileUpload() throws AWTException, InterruptedException {

		String filelocation = "C:\\Users\\sasidaran.s\\Downloads\\Uploadattachment.pdf";

		StringSelection selection = new StringSelection(filelocation);
		Thread.sleep(2000);
		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(selection, null);

		Thread.sleep(4000);
		Robot r = new Robot();
		r.keyPress(KeyEvent.VK_CONTROL);
		r.keyPress(KeyEvent.VK_V);
		r.keyRelease(KeyEvent.VK_V);
		r.keyRelease(KeyEvent.VK_CONTROL);
		// Thread.sleep(2000);
		r.keyPress(KeyEvent.VK_ENTER);
		r.keyRelease(KeyEvent.VK_ENTER);
		Thread.sleep(5000);
	}

	public void reloadBrowser() throws AWTException {
		Robot r = new Robot();
		r.keyPress(KeyEvent.VK_CONTROL);
		r.keyPress(KeyEvent.VK_F5);
		r.keyRelease(KeyEvent.VK_CONTROL);
		r.keyRelease(KeyEvent.VK_F5);
	}

	public void waitImp() {
		Duration timeout = Duration.ofSeconds(30);
		driver.manage().timeouts().implicitlyWait(timeout);
	}

	public void closeBrowser() {
		driver.quit();
	}

	public void fileUploadInvalid() throws AWTException, InterruptedException {
		String filelocation = "C:\\Users\\sasidaran.s\\Downloads\\Overall_Issues.xlsx";
		StringSelection selection = new StringSelection(filelocation);
		Thread.sleep(2000);
		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(selection, null);

		Thread.sleep(8000);
		Robot r = new Robot();
		r.keyPress(KeyEvent.VK_CONTROL);
		r.keyPress(KeyEvent.VK_V);
		r.keyRelease(KeyEvent.VK_V);
		r.keyRelease(KeyEvent.VK_CONTROL);
		Thread.sleep(2000);
		r.keyPress(KeyEvent.VK_ENTER);
		r.keyRelease(KeyEvent.VK_ENTER);
		Thread.sleep(5000);
	}

	public void clear(WebElement ref) {
		ref.clear();
	}

	public void waitForElementVisibility(By element) {
		wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		wait.until(ExpectedConditions.visibilityOfElementLocated((By) element));
	}

	public void waitForElementTobeClickable(By element) {
		wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		wait.until(ExpectedConditions.elementToBeClickable(element));
	}

	public void scrollDown(By element) {
		WebElement ls = driver.findElement(element);
		ls.sendKeys(Keys.PAGE_DOWN);
		try {
			Thread.sleep(500);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

	public void scrollUp(By element) {
		WebElement ls = driver.findElement(element);
		ls.sendKeys(Keys.PAGE_UP);
		try {
			Thread.sleep(500);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

	public void takeScreenshot(Scenario scenario) {
		if (scenario.isFailed()) {
			byte[] screenshot = ((TakesScreenshot)driver).getScreenshotAs(OutputType.BYTES);
			scenario.attach(screenshot, "D:\\Project\\Engage-3.0\\ScreenShot.png", "Failed Scenario");
		}
	}

	public void downloadLetter(By element) {
		WebElement download = driver.findElement(element);
	}

	
}
