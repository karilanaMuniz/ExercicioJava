package jdbc;

//import java.util.List;

import jdbc.antidades.Roupa;
import jdbc.dao.DaoRoupas;
import jdbc.utilidades.Conexao;

public class jdbc{
	
	
	public static void main(String[] args) {
     
		
		System.out.println("Sistema de roupa");
		if(Conexao.conectar()!=null) {
			System.out.println("Conectado");
		}else {
			System.out.println("Erro ao conectar");
		}
		
		
		//Teste de funcionamento de salvar 
		Roupa roup= new Roupa("Conjunto", "Short saia com um croped", "Loja beija flor");
	    DaoRoupas ro= new DaoRoupas();
	     
		
	    	 if( ro.salvar(roup)) {
		    	  System.out.println("Cadastrado com Sucesso");
		      }
		
	     
		
	   
 }
}