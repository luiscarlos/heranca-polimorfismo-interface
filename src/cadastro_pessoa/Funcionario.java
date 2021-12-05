package cadastro_pessoa;

public class Funcionario extends Pessoa{
	public String setor;
	private boolean estaTrabalhando;
	
	public void trabalhando() {
		this.estaTrabalhando = !this.estaTrabalhando;
	}

	public String getSetor() {
		return setor;
	}

	public void setSetor(String setor) {
		this.setor = setor;
	}

	public boolean isEstaTrabalhando() {
		return estaTrabalhando;
	}

	public void setEstaTrabalhando(boolean estaTrabalhando) {
		this.estaTrabalhando = estaTrabalhando;
	}
	
	
}
