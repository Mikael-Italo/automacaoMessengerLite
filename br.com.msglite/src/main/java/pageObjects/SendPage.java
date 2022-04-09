package pageObjects;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import org.openqa.selenium.support.PageFactory;

import elementsMap.ElementsMap;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;

public class SendPage extends ElementsMap{
	
//Inicialização dos elementos
	public SendPage(AppiumDriver<?> driver) {
		PageFactory.initElements(new AppiumFieldDecorator(driver), this);
	}
//variável para validação da msg enviada	
	private static String msg = null;	
	
//Metodos de ação
	public void clickBtnNewChat() {
		imageButtonIndex0Single.click();
	}
	
	public void searchUser(String string) {
		editTextIndex0First.sendKeys(string);
	}
	
	public void clickUser() {
		relativeLayoutIndex0First.click();
	}
//Para enviar uma mensagem=========================	
	public void sendMsg1x(String string) {
		msg = string;
		editTextIndex0First.click();
		editTextIndex0First.sendKeys(string);	
		imageButtonIndex2Single.click();
	}

	
//==========Para enviar quantas mensagens quiser, repetidamente===== altere o valor do i;
			public void sendMsgXvezes(String string) throws Exception{
			msg = string;
				
				for (int i = 0; i < 50; i++) {
				Thread.sleep(1000);
					editTextIndex0First.click();
					editTextIndex0First.sendKeys(string);
					imageButtonIndex2Single.click();
				}
			}
//=====================================================	

	
			
//Metodos de validação
	public void validateSend() {
	//validação da mensagem enviada
		assertTrue(textViewIndex0Last.isDisplayed());
		assertEquals(msg, textViewIndex0Last.getText());
	//validação do campo de envio vazio
		assertTrue(editTextIndex0First.isDisplayed());
		assertEquals("Aa", editTextIndex0First.getText());
	}
	
}
