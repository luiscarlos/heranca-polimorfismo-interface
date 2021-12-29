package cadastro.pessoa;

import java.util.ArrayList;
import java.util.List;

import cadastro_pessoa_contante.StatusAluno;

public class Aluno extends Pessoa {
	private int matricula;
	private String curso;

	private List<Disciplina> disciplina = new ArrayList<Disciplina>();

	public int getMatricula() {
		return matricula;
	}

	public void setMatricula(int matricula) {
		this.matricula = matricula;
	}

	public String getCurso() {
		return curso;
	}

	public void setCurso(String curso) {
		this.curso = curso;
	}

	public List<Disciplina> getDisciplina() {
		return disciplina;
	}

	public void setDisciplina(List<Disciplina> disciplina) {
		this.disciplina = disciplina;
	}
	
	public double getMedia() {
		double media = 0.0;
		for (Disciplina disciplina2 : disciplina) {
			media = media + disciplina2.getNota();
		}
		return media / disciplina.size();
	}
	
	public String getAprovado() {
		if(getMedia() >= 51) {
			if(getMedia() >70) {
				return StatusAluno.APROVADO;
			}else{
				return StatusAluno.RECUPERACAO;
			}
		}
			return StatusAluno.REPROVADO;
		
		
	}
	
	@Override
	public String toString() {
		return "Aluno [matricula=" + matricula + ", curso=" + curso + ", disciplina=" + disciplina + ", nome=" + nome
				+ ", idade=" + idade + ", sexo=" + sexo + "]";
	}

	@Override // identifica metodo sobrescrito
	public boolean pessoaMaiorIdade() {	
		return idade >= 21; 
	}
	
	public String msMaiorIdade() {
		return this.pessoaMaiorIdade()?"parabens aluno maior idade":"Infelizmente aluno não é de maior";
	}

	@Override
	public double salario() {
		// TODO Auto-generated method stub
		return 1500.90;
	}
}
