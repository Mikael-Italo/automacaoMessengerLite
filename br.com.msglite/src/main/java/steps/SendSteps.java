package steps;

import static utils.Utils.driver;

import io.cucumber.java.pt.Dado;
import io.cucumber.java.pt.Entao;
import io.cucumber.java.pt.Quando;
import pageObjects.LoginPage;
import pageObjects.SendPage;

public class SendSteps {
	SendPage sp = new SendPage(driver);
	LoginPage lp = new LoginPage(driver);
	
	@Dado("que o usuário esteja logado")
	public void que_o_usuário_esteja_logado() throws Exception {
		Thread.sleep(2000);
		System.out.println("Digite nos parâmetros solicitados abaixo,"
				+ " o login e senha da conta que irá usar para enviar as mensagens,"
				+ " após isso: exclua esse print");
	    lp.contextoLogin("login", "senha");
	}

	@Quando("o usuário solicitar ao App uma nova conversa")
	public void o_usuário_solicitar_ao_App_uma_nova_conversa() throws Exception{
		Thread.sleep(2000);
		sp.clickBtnNewChat();
	}

	@Quando("inserir o {string} no campo busca")
	public void inserir_o_no_campo_busca(String string) throws Exception{
		Thread.sleep(2000);
		sp.searchUser(string);
	}

	@Quando("clicar na guia de conversa do usuário digitado")
	public void clicar_na_guia_de_conversa_do_usuário_digitado() throws Exception{
		Thread.sleep(2000);
		sp.clickUser();
	}

	@Quando("digitar a {string} que desejada e enviar")
	public void digitar_a_desejada_e_enviar(String string) throws Exception{
		Thread.sleep(2000);
		sp.sendMsgXvezes(string);
	}

	@Entao("deve-se exibir a mensagem enviada no chat e o campo de envio vazio")
	public void deve_se_exibir_a_mensagem_enviada_no_chat_e_o_campo_de_envio_vazio() throws Exception{
	    Thread.sleep(2000);
	    sp.validateSend();
	}
	
}	
