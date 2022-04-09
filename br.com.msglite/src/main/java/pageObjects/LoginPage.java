package pageObjects;

import static org.junit.Assert.assertTrue;

import org.openqa.selenium.support.PageFactory;

import elementsMap.ElementsMap;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;

public class LoginPage extends ElementsMap{
	
//Inicialização dos elementos
	public LoginPage(AppiumDriver<?> driver) {
		PageFactory.initElements(new AppiumFieldDecorator(driver), this);
	}
	
//Metodos de ação
	public void sendEmailOrPhoneNumber(String string) {
		editTextIndex0First.sendKeys(string);
	}
	
	public void sendPassword(String string) {
		editTextIndex0Last.sendKeys(string);
	}
	
	public void clickBtnLogin() {
		buttonIndex5Single.click();
	}
	
	public void clickBtnNaoAcessarCtt() {
		buttonIndex5Single.click();
	}
	
//Metodo de contexto logado
	public void contextoLogin(String login, String password) {
		sendEmailOrPhoneNumber(login);
		sendPassword(password);
		clickBtnLogin();
		clickBtnNaoAcessarCtt();
	}
	
//Metodos de validação
	public void validaLogin() {
		assertTrue(imageButtonIndex0Single.isDisplayed());
		
		/*
		* Caso necessário e houver content-desc:
		* assertEquals("Texto esperado aqui", validaLogin.getAttribute("content-des"));
		*/
	}
}
