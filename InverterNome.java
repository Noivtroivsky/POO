
package aula.ago16;

/**
 *
 * Noá Miglio
 */
import java.util.Scanner;
public class InverterNome {
    public static void main (String[] args) {
        Scanner ler = new Scanner(System.in);
        
        System.out.print("Digite o nome: ");
        String nome = ler.nextLine();
        
        for(int i = nome.length()-1; i > -1; i--){
            System.out.print(nome.charAt(i));
        }
        
    }
}
