package cadastro.pessoa.interfaces;

public interface PermitirAcesso {

	public boolean Autenticar(String login, String senha);
	public boolean Autenticar();
}
