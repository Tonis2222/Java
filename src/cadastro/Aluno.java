package cadastro;

public class Aluno {
	private String nome;
	private int idade;
	private float mensalidade;
	private boolean masculino;

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

	public float getMensalidade() {
		return mensalidade;
	}

	public void setMensalidade(float mensalidade) {
		this.mensalidade = mensalidade;
	}

	public boolean isMasculino() {
		return masculino;
	}

	public void setMasculino(boolean masculino) {
		this.masculino = masculino;
	}

}
