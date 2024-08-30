package exerciciosala;

import javax.swing.JOptionPane;
public class Pessoa {
	private String nome, corOlhos, telefone;
	static final String olhosCastanhos = "Castanhos";
	static final String olhosVerdes = "Verdes";
	static final String olhosAzuis = "Azuis";
	 public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getCorOlhos() {
		return corOlhos;
	}
	public void setCorOlhos(String corOlhos) {
		this.corOlhos = corOlhos;
	}	
	public String getTelefone() {
		return telefone;
	}
	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}
	public void imprimir() {
		JOptionPane.showMessageDialog(null, "\nNome: " + getNome() 
		+ "\nTelefone" + getTelefone()+ "\nCor dos Olhos: " + getCorOlhos());
	}
}