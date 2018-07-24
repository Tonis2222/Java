package testes;

import java.time.LocalDateTime;

import cadastro.Aluno;

public class TesteAluno {
	public static void main(String[] args) {
		String nome = "Pedro";
		int idade = 30;
		float mensalidade = 500;
		boolean masculino = true;

		Aluno a = new Aluno();
		a.setIdade(idade);
		a.setMensalidade(mensalidade);
		a.setNome(nome);
		a.setMasculino(masculino);

		System.out.printf("%s %s tem %d anos e paga R$ %.2f", a.isMasculino() ? "O aluno" : "A aluna", a.getNome(),
				a.getIdade(), a.getMensalidade());

		System.out.println("");
		System.out.printf("Ano de nascimento %d", LocalDateTime.now().getYear() - a.getIdade());

	}
}
