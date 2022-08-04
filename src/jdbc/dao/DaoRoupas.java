package jdbc.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;


import jbbc.interfaces.ICrud;
import jdbc.antidades.Roupa;
import jdbc.utilidades.Conexao;

public class  DaoRoupas implements ICrud<Roupa>{


	@Override
	public boolean salvar(Roupa obj) {
		String sql="insert into roupas(modelo,discricao,loja)values(?,?,?)";
		Connection con=Conexao.conectar(); //variavel con
		
		try {
			PreparedStatement stm=con.prepareStatement(sql);//stm também é variavel
			  stm.setString(1, obj.getModelo());
			  stm.setString(2,obj.getDiscricao());
			  stm.setString(3, obj.getLoja());
			  stm.execute();
		} catch (Exception e) {
			System.out.println(e.getMessage());
			return false;
		}
		finally {
			Conexao.fechar();
		}
		return true;
		
	}
	
	
	
	
	@Override
	public boolean alterar(Roupa obj) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public void excluir(int id) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Roupa consultar(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Roupa> consultar() {
		List<Roupa> roupinha=new ArrayList<>();
		String sql ="selec *from roupas";
		Connection con =Conexao.conectar();
		try {
		 PreparedStatement stm=con.prepareStatement(sql);
			
		    ResultSet rs=stm.executeQuery();
		     while (rs.next()) {
		    	Roupa roupinhas= new Roupa();
		    	roupinhas.setId(rs.getInt("id"));
		    	roupinhas.setModelo(rs.getString("modelo"));
		    	roupinhas.setDiscricao(rs.getString("discricao"));
		    	roupinhas.setLoja(rs.getString("loja"));
                roupinha.add(roupinhas); 
		     }
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		return roupinha;
	}

	@Override
	public boolean salvar() {
		// TODO Auto-generated method stub
		return false;
	}
}

