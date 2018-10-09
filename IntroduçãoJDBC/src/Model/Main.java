package Model;

import DAO.PessoaDAO;

/**
 * 
 * @author cleefsouza
 *
 */
public class Main {
	public static void main(String[] args) {
				
		Pessoa ps1 = new Pessoa("Meu nome é Um", "111.111.111-11", "111.111-1", 11);
		Pessoa ps2 = new Pessoa("Meu nome é Dois", "222.222.222-22", "222.222-2", 22);
		Pessoa ps3 = new Pessoa("Meu nome é Três", "333.333.333-33", "333.333-3", 33);
		Pessoa ps4 = new Pessoa("Meu nome é Quatro", "444.444.444-44", "444.444-4", 44);
		Pessoa ps5 = new Pessoa("Meu nome é Cinco", "555.555.555-55", "555.555-5", 55);
		Pessoa ps6 = new Pessoa("Meu nome é Seis", "666.666.666-66", "666.666-66", 66);
		
		System.out.println("\n----------------- INSERINDO");
		List<Pessoa> listps = new ArrayList<>();		
		listps.add(ps1);
		listps.add(ps2);
		listps.add(ps3);
		listps.add(ps4);
		listps.add(ps5);
		listps.add(ps6);
		
		inserirPessoas(listps); // Método para inserir pessoas
		
		PessoaDAO pd = new PessoaDAO();
		
		System.out.println("\n----------------- REMOVENDO");
		pd.remover("666.666.666-66"); // Removendo pessoa	
		
		// Listando pessoa
		System.out.println("\n");
		for (Pessoa p : pd.listar()) {
			System.out.println("----------------- LISTANDO\n" + "Nome: " + p.getNome() + "\n" + "CPF: " + p.getCpf() + "\n"
					+ "RG: " + p.getRg() + "\n" + "Idade: " + p.getIdade());
		}
		
		System.out.println("\n----------------- BUSCANDO");
		Pessoa  psAux = null;
		
		// Buscando pessoa por CPF
		psAux = new Pessoa();
		psAux = pd.buscarPorCpf("333.333.333-33");
		System.out.println("Pessoa Encontrada: "+psAux.getNome());
		
		// Buscando pessoa por CPF
		psAux = new Pessoa();
		psAux = pd.buscarPorRg("222.222-2");
		System.out.println("Pessoa Encontrada: "+psAux.getNome());
		
		// Buscando pessoa por CPF
		psAux = new Pessoa();
		psAux = pd.buscarPorNome("Meu nome é Cinco");
		System.out.println("Pessoa Encontrada: "+psAux.getNome());
		
		
	}
	
	static void inserirPessoas(List<Pessoa> listps) {
		PessoaDAO pd = new PessoaDAO();		
		for(int i=0; i<listps.size();i++) {
			pd.inserir(listps.get(i));
		}
	}
}