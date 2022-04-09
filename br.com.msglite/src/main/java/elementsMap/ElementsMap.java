package elementsMap;

import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;

public class ElementsMap {

//Usados no @Login
	@AndroidFindBy(xpath = "(//android.widget.EditText[@index='0'])[1]")
	protected MobileElement editTextIndex0First;
	
	@AndroidFindBy(xpath = "(//android.widget.EditText[@index='0'])[last()]")
	protected MobileElement editTextIndex0Last;
	
	@AndroidFindBy(xpath = "//android.widget.Button[@index='5']")
	protected MobileElement buttonIndex5Single;
	
	@AndroidFindBy(xpath = "//android.widget.ImageButton[@index='0']")
	protected MobileElement imageButtonIndex0Single;
	
//Usados no @Send
	@AndroidFindBy(xpath = "(//android.widget.RelativeLayout[@index='0'])[1]")
	protected MobileElement relativeLayoutIndex0First;
	
	@AndroidFindBy(xpath = "//android.widget.ImageButton[@index='2']")
	protected MobileElement imageButtonIndex2Single;
	
	@AndroidFindBy(xpath = "(//android.widget.TextView[@index='0'])[last()]")
	protected MobileElement textViewIndex0Last;		
}
