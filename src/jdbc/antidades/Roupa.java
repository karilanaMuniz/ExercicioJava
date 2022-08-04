package jdbc.antidades;

public class Roupa{
	  private int id;
	  private String modelo;
	  private String discricao;
	  private String loja;
	  
	  public Roupa( String modelo, String discricao, String loja) {
		this.modelo = modelo;
		this.discricao = discricao;
		this.loja = loja;
	}

	  
	  public Roupa( ) {
		
		}
	public String getLoja() {
		return loja;
	}

	public void setLoja(String loja) {
		this.loja = loja;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public String getDiscricao() {
		return discricao;
	}

	public void setDiscricao(String discricao) {
		this.discricao = discricao;
	}

	


	public void add(Roupa roupinhas) {
		
	}
	  
	  
	  
	  
	  
	  
	  
	  
}





