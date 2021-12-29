package cadastro.pessoa;

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

	@Override
	public String toString() {
		return "Professor [salario=" + salario + ", especialidade=" + especialidade + ", nome=" + nome + ", idade="
				+ idade + ", sexo=" + sexo + "]";
	}

	@Override
	public double salario() {
		// TODO Auto-generated method stub
		return 1800.80 *0.9;
	}

}
