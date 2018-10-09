package Model;

import DAO.PessoaDAO;

/**
 * 
 * @author cleefsouza
 *
 */
public class Main {
	public static void main(String[] args) {
		Pessoa ps = new Pessoa();
		/*ps.setCpf("55555555555");
		ps.setNome("Meu nome é Cinco");
		ps.setRg("5555555");
		ps.setIdade(55);*/

		PessoaDAO pd = new PessoaDAO();
		//pd.inserir(ps); // Inserindo pessoa
		//pd.remover("10487855485"); // Removendo pessoa		
		// Listando pessoa
		for (Pessoa p : pd.listar()) {
			System.out.println("----------------- LISTANDO\n" + "Nome: " + p.getNome() + "\n" + "CPF: " + p.getCpf() + "\n"
					+ "RG: " + p.getRg() + "\n" + "Idade: " + p.getIdade());
		}
		
		// Buscando pessoa por CPF
		ps = pd.buscarPorCpf("2");
	}
}
