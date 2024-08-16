package aula.ago16;

public class Pessoa {
	private String nome;
	private int idade;
	private int passos;
        private String saude;
	
	public void cadastrarNome(String nome) {
		this.nome = nome;
	}
	public int gravarPassos(int passos) {
		this.passos = passos;
		return this.passos;
	}
	public void gravarIdade(int idade) {
		this.idade = idade;
	}
        public void gravarSaude (String saude) {
            this.saude = saude;
        }
	public String lerDados() {
		return ("Nome: " + nome + "\tidade: " + idade + " andou " + passos + " passos" + "saude: " + saude);
	}
        
        
}
    

