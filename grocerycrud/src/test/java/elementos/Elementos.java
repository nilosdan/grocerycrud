package elementos;

import org.openqa.selenium.By;

public class Elementos {

	public By name = By.xpath("//input[@name='customerName']");
	public By lastName = By.xpath("//input[@name='contactLastName']");
	public By ContactFirstName = By.xpath("//input[@name='contactFirstName']");
	public By fone = By.xpath("//input[@name='phone']");
	public By AddressLine1 = By.xpath("//input[@name='addressLine1']");	
	public By AddressLine2= By.xpath("//input[@name='addressLine2']");
	public By city = By.xpath("//input[@name='city']");
	public By state = By.xpath("//input[@name='state']");
	public By postalCode = By.xpath("//input[@name='postalCode']");
	public By country = By.xpath("//input[@name='country']");
	public By fromEmployeer = By.xpath("//div[@class='form-group salesRepEmployeeNumber_form_group row']//select[@id='field-salesRepEmployeeNumber']//option[@value='1501']");
	public By bot = By.xpath("//div[@class='chosen-search']//input[@type='text']");
	public By creditLimit = By.xpath("//input[@name='creditLimit']");
	public By deleted = By.xpath("//input[@name='deleted']");
	public By save = By.xpath("//button[@type='submit']");
	public By enterBut = By.xpath("//option[@value='1501']");
	public By resultValidacao = By.xpath("//div[@class='form-group gcrud-form-group']//p[text()='Your data has been successfully stored into the database. ']");
}
