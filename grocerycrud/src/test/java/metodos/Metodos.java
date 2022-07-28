package metodos;

import static org.junit.Assert.assertTrue;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import conexoes.Drivers;

public class Metodos extends Drivers {
	public void clicar(By elemento) {
		driver.findElement(elemento).click();
	}

	public void escrever(By elemento, String texto)  {
		driver.findElement(elemento).sendKeys(texto);
	}
public void submit(By elemnto) {
	driver.findElement(elemnto).submit();
}
public void scrooll(int n1, int n2) {
	JavascriptExecutor js = (JavascriptExecutor) driver;
	js.executeScript("window.scrollBy("+n1+","+n2+")");
}
public void validarTexto(By elemento, String textoEsperado) {
	String textoCapturado = driver.findElement(elemento).getText();
	assertTrue(textoCapturado.contains(textoEsperado));
}
public void aguardar(By elemento) {
	WebElement element = new WebDriverWait(driver,Duration.ofSeconds(10)).until(ExpectedConditions.elementToBeClickable(elemento));
}
public void screenShot(String nomeEvidencia) {
	TakesScreenshot srcShot =  (TakesScreenshot) driver;
	File srcFile = srcShot.getScreenshotAs(OutputType.FILE);
	File destFile = new File("./evidencias/" + nomeEvidencia + ".png");
	try {
		FileUtils.copyFile(srcFile, destFile);
	} catch (IOException e) {
		e.printStackTrace();
	}
	
	
}
}