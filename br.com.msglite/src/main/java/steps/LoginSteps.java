package steps;

import static utils.Utils.driver;

import io.cucumber.java.pt.Entao;
import io.cucumber.java.pt.Quando;
import pageObjects.LoginPage;

public class LoginSteps {
	LoginPage mlp = new LoginPage(driver);
	
	@Quando("o usuário inserir um {string} cadastrado no sistema")
	public void o_usuário_inserir_um_cadastrado_no_sistema(String string) throws Exception {
		 Thread.sleep(2000);
		 mlp.sendEmailOrPhoneNumber(string);
	}

	@Quando("inserir um {string} cadastrado no sistema")
	public void inserir_um_cadastrado_no_sistema(String string) throws Exception{
		Thread.sleep(2000);
		mlp.sendPassword(string);
	}

	@Quando("clicar no botão Log in")
	public void clicar_no_botão_Log_in() throws Exception{
		Thread.sleep(2000);
		mlp.clickBtnLogin();
		Thread.sleep(2000);
		mlp.clickBtnNaoAcessarCtt();
	}

	@Entao("deve-se apresentar a tela inicial do App")
	public void deve_se_apresentar_a_tela_inicial_do_App() throws Exception{
		Thread.sleep(2000);
		mlp.validaLogin();
	}
	
}	
