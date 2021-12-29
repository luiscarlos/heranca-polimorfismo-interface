package cadastro.classesauxiliares;

import cadastro.pessoa.interfaces.PermitirAcesso;

public class FuncaoAutenticacao {
	
	
	private PermitirAcesso permitirAcesso;
	
	public boolean autenticar() {
		return permitirAcesso.Autenticar();
		
	}public  FuncaoAutenticacao (PermitirAcesso permitirAcesso) {
		this.permitirAcesso = permitirAcesso;
		
	}
}
