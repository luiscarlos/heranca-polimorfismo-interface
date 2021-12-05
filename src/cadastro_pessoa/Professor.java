package cadastro_pessoa;

public class Professor extends Pessoa {

	private double salario;
	private String especialidade;

	public void receberAumento(double aumento) {
		salario = salario + aumento;
	}

	public double getSalario() {
		return salario;
	}

	public void setSalario(double salario) {
		this.salario = salario;
	}

	public String getEspecialidade() {
		return especialidade;
	}

	public void setEspecialidade(String especialidade) {
		this.especialidade = especialidade;
	}

}
