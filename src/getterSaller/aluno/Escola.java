package getterSaller.aluno;

public class Escola {
	public static void main(String[] args) {
		Aluno felipe = new Aluno();
		felipe.setNome("Phillipe"); // aqui ele esta sentando os nomes na classe aluno.
		felipe.setIdade(8);
		
		System.out.println("O aluno " + felipe.getNome() + " tem " + felipe.getIdade() + " anos ");	// aqui esta pegando os valores da classe.
	}
}