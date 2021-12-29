package cadastro.pessoa;

import cadastro.pessoa.interfaces.PermitirAcesso;

public class Funcionario extends Pessoa implements PermitirAcesso {
	public String setor;
	private boolean estaTrabalhando;

	private String login;
	private String senha;

	public Funcionario() {

	}

	public Funcionario(String login, String senha) {
		this.login = login;
		this.senha = senha;
	}

	public void trabalhando() {
		this.estaTrabalhando = !this.estaTrabalhando;
	}

	public String getSetor() {
		return setor;
	}

	public void setSetor(String setor) {
		this.setor = setor;
	}

	@Override
	public String toString() {
		return "Funcionario [setor=" + setor + ", estaTrabalhando=" + estaTrabalhando + ", nome=" + nome + ", idade="
				+ idade + ", sexo=" + sexo + "]";
	}

	public boolean getEstaTrabalhando() {
		return estaTrabalhando;
	}

	public void setEstaTrabalhando(boolean estaTrabalhando) {
		this.estaTrabalhando = estaTrabalhando;
	}

	@Override
	public double salario() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public boolean Autenticar(String login, String senha) {
		
		this.login = login;
		this.senha = senha;
		
		 
		return Autenticar();
	}

	@Override
	public boolean Autenticar() {
		// TODO Auto-generated method stub
		return this.login.equalsIgnoreCase("admin") && this.senha.equalsIgnoreCase("admin");
	}

}
