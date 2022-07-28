package steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import metodos.Metodos;
import pages.CadastrarPage;
import pages.HomePage;

public class CadastrarNovoCustomerTest {

	CadastrarPage cad = new CadastrarPage();
	HomePage hp = new HomePage();
	Metodos metodos = new Metodos();

	@Given("que selecione Bootstrap v4")
	public void queSelecioneBootstrapV4() {

		hp.selecionarVersao("Bootstrap V4 Theme");

	}

	@Given("acessar o formulario")
	public void acessarOFormulario() {
		hp.addCustomer();
	}

	@When("enviar o formulario")
	public void enviarOFormulario() {
		cad.preencherFormulario();
	}

	@Then("valido a mensagem de envio")
	public void validoAMensagemDeEnvio() {
		cad.validarMensagem();
	}

}
