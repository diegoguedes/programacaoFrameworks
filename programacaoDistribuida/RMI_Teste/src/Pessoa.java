import java.io.Serializable;

public class Pessoa implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = -8575268870478382496L;
	private String nome;
	private Integer idade;
	
	public Pessoa(String nome, Integer idade){
		this.nome = nome;
		this.idade = idade;				
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Integer getIdade() {
		return idade;
	}

	public void setIdade(Integer idade) {
		this.idade = idade;
	}

	
}
