


//Noá Miglio

package ado3;

import java.util.Scanner;

import java.util.Scanner;

public class Exibir{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Entrada de dados
        System.out.print("Digite a altura (em metros): ");
        double altura = scanner.nextDouble();

        System.out.print("Digite o peso (em kg): ");
        double peso = scanner.nextDouble();

        scanner.nextLine(); // Consumir a nova linha pendente após nextDouble()

        System.out.print("Digite o sexo (M/F): ");
        String sexo = scanner.nextLine().toUpperCase();

        // Criar uma instância de Pessoa
        Pessoa pessoa = new Pessoa(altura, peso, sexo);

        // Exibir informações
        System.out.println("\nInformações da Pessoa:");
        pessoa.exibirInformacoes();

        // Calcular e exibir o IMC e sua classificação
        double imc = pessoa.calcularImc();
        String classificacao = pessoa.classificarImc();

        System.out.printf("IMC: %.2f\n", imc);
        System.out.println("Classificação: " + classificacao);
    }
}

