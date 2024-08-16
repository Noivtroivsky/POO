package aula.ago16;

import javax.swing.JOptionPane;
public class CadastraPessoa {
	public static void main(String[] args) {
		int resp=0;
		do {
			Pessoa p = new Pessoa();		
			p.cadastrarNome(JOptionPane.showInputDialog("Digite o nome:"));
			p.gravarIdade(Integer.parseInt(JOptionPane.showInputDialog("Digite a idade:")));

			int caminhar = JOptionPane.showConfirmDialog(null, "Deseja caminhar?");		
			if(caminhar==0) {
				int continuar=0;
				do {
					p.gravarPassos(Integer.parseInt(JOptionPane.showInputDialog("Digite a qtd passos:")));		
					JOptionPane.showMessageDialog(null, "Caminhando...");
					System.out.println(p.lerDados());
					continuar = JOptionPane.showConfirmDialog(null, "Deseja continuar caminhando?");
				}while(continuar==0);
			}		
			resp = JOptionPane.showConfirmDialog(null, "Cadastrar outra Pessoa?");
		}while(resp==0);
	}
}