package pages;

import elementos.Elementos;
import metodos.Metodos;

public class CadastrarPage  {
     Metodos metodos = new Metodos();
	 Elementos el = new Elementos();
	
	public void preencherFormulario() {
		
		metodos.escrever(el.name, "Danilo");
		metodos.escrever(el.lastName, "Benicio");
		metodos.escrever(el.ContactFirstName, "Nilo");
		metodos.escrever(el.fone, "11 91212-1212");
		metodos.escrever(el.AddressLine1, "sp");
		metodos.escrever(el.AddressLine2, "sp2");
		metodos.escrever(el.city, "el merrico");
		metodos.escrever(el.state, "abalado");
		metodos.escrever(el.postalCode, "5551212");
		metodos.escrever(el.country, "Brazuca");
		metodos.escrever(el.creditLimit, "1.000.000,00");
		metodos.escrever(el.deleted, "Brazuca");

		
	
		metodos.clicar(el.save);
		
	
		
	}
public void validarMensagem() {
	String resultSucess = "Your data has been successfully stored into the database. ";
	metodos.aguardar(el.resultValidacao);
	metodos.validarTexto(el.resultValidacao, resultSucess);
   metodos.screenShot(resultSucess);
}
}
