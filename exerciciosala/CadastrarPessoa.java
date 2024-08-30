package exerciciosala;

// Importa a classe JOptionPane para exibição de caixas de diálogo
import javax.swing.JOptionPane;

/**
 * Classe que demonstra o cadastro de uma pessoa com informações básicas.
 * 
 * @author noa.smiglio
 */
public class CadastrarPessoa {
    public static void main(String[] args) {
        // Cria uma nova instância da classe Pessoa
        Pessoa pessoa = new Pessoa();
        
        // Array com as opções de cores de olhos disponíveis
        String[] valores = {"Castanhos", "Azuis", "Verdes"};
        
        // Exibe uma caixa de diálogo para selecionar a cor dos olhos
        Object escolha = JOptionPane.showInputDialog(
            null,  // Component pai
            "Selecione a cor dos Olhos:",  // Mensagem
            "Cadastro Pessoa",  // Título da janela
            JOptionPane.QUESTION_MESSAGE,  // Tipo de mensagem
            null,  // Ícone (null para não usar nenhum ícone específico)
            valores,  // Opções de escolha
            valores[0]  // Valor padrão (primeira opção)
        );
        
        // Define a cor dos olhos com base na escolha do usuário
        if (escolha.equals("Castanhos")) {
            pessoa.setCorOlhos(Pessoa.olhosCastanhos);
        } else if (escolha.equals("Azuis")) {
            pessoa.setCorOlhos(Pessoa.olhosAzuis);
        } else if (escolha.equals("Verdes")) {
            pessoa.setCorOlhos(Pessoa.olhosVerdes);
        }
        
        // Solicita e define o nome da pessoa
        pessoa.setNome(JOptionPane.showInputDialog("Digite o Nome:", "Marcos"));
        
        // Solicita e define o telefone da pessoa
        pessoa.setTelefone(JOptionPane.showInputDialog("Digite o telefone:", "(11)98139-8893"));
        
        // Imprime as informações da pessoa cadastrada
        pessoa.imprimir();
    }
}
