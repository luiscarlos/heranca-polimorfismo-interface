package cadastro_pessoa;

public class Pessoa {

	protected String nome;
	protected int idade;
	protected String sexo;

	public void fazerAniversario() {
		this.idade++;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}

	public String getSexo() {
		return sexo;
	}

	public void setSexo(String sexo) {
		this.sexo = sexo;
	}

	@Override
	public String toString() {
		return "Pessoa [nome=" + nome + ", idade=" + idade + ", sexo=" + sexo + "]";
	}

	public boolean pessoaMaiorIdade() {
		if (idade > 18) {
			return true;
		} else {
			return false;
		}

	}

}
