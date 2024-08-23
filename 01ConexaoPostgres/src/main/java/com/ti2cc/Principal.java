package frutas;
import frutas.DAO;
import frutas.tipos;




public class Principal {
	
	public static void main(String[] args) {
		
		DAO dao = new DAO();
		
		dao.conectar();

		
		//Inserir um elemento na tabela
		tipos fruta = new tipos("kiwi", "azedo");
		if(dao.inserirTipos(fruta) == true) {
			System.out.println("Inserção com sucesso -> " + fruta.toString());
		}
		
		//Mostrar frutas doces	
		System.out.println("==== Mostrar frutas doces=== ");
		tipos[] vetTipos = dao.getFrutasDoces();
		for(int i = 0; i < vetTipos.length; i++) {
			System.out.println(vetTipos[i].toString());
		}

		//Atualizar sabor
		fruta.setSabor("novo sabor");
		dao.atualizarTipos(fruta);
		//atualizarTipos(tipos);
	

      
		
		//Excluir fruta
		dao.excluirFruta(fruta.getNome());
		
		//Mostrar frutas		vetTipos = dao.getTipos();
		System.out.println("==== Mostrar usuários === ");		
		for(int i = 0; i < vetTipos.length; i++) {
			System.out.println(vetTipos[i].toString());
		}
		
		dao.close();
	}
}
