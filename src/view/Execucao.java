package view;

import model.Pessoa;

public class Execucao {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Pessoa pessoa = new Pessoa();
		pessoa.setNome("Gabriel Pontes");
		
		System.out.println(pessoa.getNome());
	

		pessoa.setEndereco("Rua Mandassaia");
		
			
		System.out.println(pessoa.getEndereco());
	
		pessoa.setBairro("Cid.A.E.Carvalho");
		
		System.out.println(pessoa.getBairro());
	
		pessoa.setCep(1234567);
		
		System.out.println(pessoa.getCep());
	
		pessoa.setCidade("São Paulo");
		
		System.out.println(pessoa.getCidade());
	
		pessoa.setEstado("São Paulo");
		
		System.out.println(pessoa.getEstado());
	
		
	}	
}
