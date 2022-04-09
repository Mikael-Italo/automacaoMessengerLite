package utils;

import java.time.Duration;

import org.openqa.selenium.WebElement;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.TouchAction;
import io.appium.java_client.touch.WaitOptions;
import io.appium.java_client.touch.offset.PointOption;

public class Utils {
	
	public static AppiumDriver<WebElement> driver;	
	  
	  
//Metodos para deslizar a tela em direções	  
	  public static void deslizarAteFimDaTela() throws Exception{
		  	//Recebendo tamanho da tela: Altura X Largura
		  	int height = driver.manage().window().getSize().getHeight();
		    int width = driver.manage().window().getSize().getWidth();        
		    //Dividindo por 2, para se ter o meio da tela
		    int metadeWidht = width/2;
		    int metadeHeight = height/2;
		    //considerando a tela de 1776 X 1080 (caso for 1920 alterar os valores de y)
		    //meio da tela x = 540 e y= abaixo do meio da tela (888)
		    //ponto final de rolagem x= 540 e y= proximo ao topo (+1000)  
	        TouchAction swipe = new TouchAction(driver)
	                .press(PointOption.point(metadeWidht,metadeHeight+300))//1088
	                .waitAction(WaitOptions.waitOptions(Duration.ofMillis(800)))
	                .moveTo(PointOption.point(metadeWidht,metadeHeight-500))//388
	                .release()
	                .perform();
	  }
	  
	  public static void deslizarAteTopoDaTela() {
		//Recebendo tamanho da tela: Altura X Largura
		  	int height = driver.manage().window().getSize().getHeight();
		    int width = driver.manage().window().getSize().getWidth();        
		    //Dividindo por 2, para se ter o meio da tela
		    int metadeWidht = width/2; //x = 540
		    int metadeHeight = height/2; //y= 888
		    //considerando a tela de 1776 X 1080 (caso for 1920 alterar os valores de y)
		    //meio da tela x = 540 e y= abaixo do meio da tela (888)
		    //ponto final de rolagem x= 540 e y= proximo ao topo (+1000)  
	        TouchAction swipe = new TouchAction(driver)
	                .press(PointOption.point(metadeWidht,metadeHeight-500))//388
	                .waitAction(WaitOptions.waitOptions(Duration.ofMillis(800)))
	                .moveTo(PointOption.point(metadeWidht,metadeHeight+300))//1088
	                .release()
	                .perform();
	  }
	  
	  public static void swipeParaDireita() {
		//Recebendo tamanho da tela: Altura X Largura
		  	int height = driver.manage().window().getSize().getHeight();
		    int width = driver.manage().window().getSize().getWidth();        
		    //Dividindo por 2, para se ter o meio da tela
		    int metadeWidht = width/2; //x = 540
		    int metadeHeight = height/2; //y= 888
		    //considerando a tela de 1776 X 1080 (caso for 1920 alterar os valores de y)
		    //meio da tela x = 540 e y= abaixo do meio da tela (888)
		    //ponto final de rolagem x= 540 e y= proximo ao topo (+1000)  
	        TouchAction swipe = new TouchAction(driver)
	                .press(PointOption.point(metadeWidht+300, metadeHeight+400))
	                .waitAction(WaitOptions.waitOptions(Duration.ofMillis(500)))
	                .moveTo(PointOption.point(metadeWidht-380, metadeHeight+400))
	                .release()
	                .perform();
	  }
	  
}

