package pages;

import org.openqa.selenium.By;

import conexoes.Drivers;

public class HomePage extends Drivers {

	public void selecionarVersao(String versao) {
		driver.findElement(By.xpath("//select[@id='switch-version-select']//option[text()='" + versao + "']")).click();

	}

	public void addCustomer() {
		
driver.findElement(By.xpath("//div[@class='floatL t5']//a[@class='btn btn-default btn-outline-dark']")).click();
	}

}
