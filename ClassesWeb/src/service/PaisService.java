package service;
import dao.PaisDAO;

import model.PaisTo;

public class PaisService {
	
		PaisDAO dao;
		
		public PaisService() {
			dao = new PaisDAO();
		}
		public void criar(PaisTo paisTo) {
			dao.criar(paisTo);
		}
		public void atualizar(PaisTo paisTo) {
			dao.atualizar(paisTo);
		}
		public void excluir(PaisTo paisTo) {
			dao.excluir(paisTo);
		}
		public PaisTo carregar(int id) {
			PaisTo to = dao.carregar(id);
			return to;
		}
		
		

}
