package cadastro.pessoa;

import javax.swing.JOptionPane;

import cadastro.classesauxiliares.FuncaoAutenticacao;
import cadastro.pessoa.interfaces.PermitirAcesso;

public class TestandoClassesFilhas {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Aluno aluno = new Aluno();
		Professor professor = new Professor();
		
		String login = JOptionPane.showInputDialog("Digite seu login");
		String senha = JOptionPane.showInputDialog("Digite seu login");
		
		
		//PermitirAcesso funcionario = new Funcionario();
		//FuncaoAutenticacao funcaoAutenticacao = new FuncaoAutenticacao();
		PermitirAcesso permitirAcesso = new Funcionario(login, senha);
	
		
		//if(permitirAcesso.Autenticar()) {
		
		//if(funcaoAutenticacao.auteticarEntrada(permitirAcesso)) {
		if(new FuncaoAutenticacao(permitirAcesso).autenticar()) {
		
		for(int qtd = 0; qtd <1; qtd++ ) {
			
			String nomeAlno = JOptionPane.showInputDialog("Digite o nome do aluno");	
			String idadeAlno = JOptionPane.showInputDialog("Digite o idade do aluno");	
			String sexoAlno = JOptionPane.showInputDialog("Digite o sexo do aluno");
			String cursoAlno = JOptionPane.showInputDialog("Digite o curso do aluno");
			
			aluno.setNome(nomeAlno);
			aluno.setIdade(Integer.valueOf(idadeAlno));
			aluno.setSexo(sexoAlno);
			aluno.setCurso(cursoAlno);
			
			String nomeProfesso = JOptionPane.showInputDialog("Digite o nome do professor");
			String salarioProfesso = JOptionPane.showInputDialog("Digite o salario do professor");
			String especialidadeProfesso = JOptionPane.showInputDialog("Digite o especialidade do professor");
			String idadeProfesso = JOptionPane.showInputDialog("Digite o idade do professor");
			
			professor.setNome(nomeProfesso);
			professor.setSalario(Double.valueOf(salarioProfesso));
			professor.setEspecialidade(especialidadeProfesso);
			professor.setIdade(Integer.valueOf(idadeProfesso));
		
			String nomeFunconario = JOptionPane.showInputDialog("Digite o nome do funcionario");
			String estaTrabalhandoFuncionario = JOptionPane.showInputDialog("Funcionario esta trabalhando 1-SIM, 2- N~]AO");
			String idadeFuncionario = JOptionPane.showInputDialog("Digite o idade do funcionario");
			
			/*funcionario.setNome(nomeFunconario);
			funcionario.setEstaTrabalhando(Boolean.valueOf(estaTrabalhandoFuncionario));
			funcionario.setIdade(Integer.valueOf(idadeFuncionario));*/
			
		}
		
		
	
		System.out.println(aluno.toString());
		System.out.println("------------------");
		//System.out.println(funcionario);
		System.out.println("------------------");
		System.out.println(professor);
		System.out.println("------------------");
		System.out.println("Maior idade " + aluno.pessoaMaiorIdade() + " - " + aluno.msMaiorIdade());
		System.out.println("Maior idade " + aluno.salario());
		System.out.println("------------------");
		System.out.println("Maior idade " +  professor.pessoaMaiorIdade());
		System.out.println("Maior idade " +  professor.salario());
		System.out.println("------------------");
		/*System.out.println("Maior idade " +  funcionario.pessoaMaiorIdade());
		System.out.println("Maior idade " +  funcionario.salario());*/
		
		
		//Pessoa pessoa = new Aluno();
	
		teste(aluno);
		teste(professor);
		//teste(funcionario);
		}else {
			JOptionPane.showMessageDialog(null, "acesso negado");
		}
	}
	
	
	public static void teste(Pessoa pessoa) {
		System.out.println("Essa pessoa e d + :" + pessoa.getNome() + " e o salario e:" + pessoa.salario());
	}
	
}
