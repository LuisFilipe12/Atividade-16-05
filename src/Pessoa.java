
public class Pessoa {

	public String nome;
	public int idade;
	public long cpf;
	
	
	public Pessoa() {
		
	}
	
	public Pessoa(String nome, int idade, long cpf) {
		this.nome = nome;
		this.idade = idade;
		this.cpf = cpf;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}

	public long getCpf() {
		return cpf;
	}

	public void setCpf(long cpf) {
		this.cpf = cpf;
	}
	@Override
	public String toString() {
		return "Nome: " + nome
				+"\ncpf: " + cpf
				+"nidade: " + idade;
				
	}
	
	
	
}
