/*
Autor: Noá Miglio
Data: 16/08
*/
package aula.ago16;
import java.util.Scanner;

public class Poo_ado_01 {
    public static void main(String[] args) {
       Scanner ler = new Scanner (System.in);
       
       //pra perguntar se o usuario quer cadastrar oura matriz
       boolean continuar = true;
       
       while(continuar){
           
           //tamanho da matriz
           System.out.println("respectivamente quantas colunas e linhas terá a matriz");
           System.out.print("colunas:");
           int qtdColunas = ler.nextInt();
           System.out.print("linhas:");
           int qtdLinhas = ler.nextInt();
           
           int[][] matriz = new int [qtdColunas][qtdLinhas];
           
           //valores da  matriz
           System.out.print("digite os valores da matriz");
           for(int i = 0; i < qtdColunas; i++){
               for(int j = 0; j < qtdLinhas; j++){
                   matriz[i][j] = ler.nextInt();
               }
           }
           
           //variaveis
           int somaTotal = 0;
           int maior = matriz[0][0];
           int menor = matriz[0][0];
           int somaDiagonalPrincipal = 0;
           int somaDiagonalSecundaria = 0;
           
           for(int i = 0; i < qtdColunas; i++){
               for(int j = 0; j < qtdLinhas; j++){
                   
                   int valor = matriz[i][j];
                   //soma total dos valores
                   somaTotal += valor;
                   
                   //maior
                   if(valor > maior){
                       maior = valor;
                   }
                   if(valor < menor){
                       menor = valor;
                   }
                   if(i == j){ // diagonal principal
                       somaDiagonalPrincipal += valor;
                   }
                   if(i + j == matriz.length-1){ //diagonal secundaria
                       somaDiagonalSecundaria += valor;
                   }
                   
               }
           }
           System.out.println("somaTotal: " + somaTotal);
           System.out.println("maior: " + maior);
           System.out.println("menor: " + menor);
           System.out.println("Diagonal principal: " + somaDiagonalPrincipal);
           System.out.println("Diagonal secundaria: " + somaDiagonalSecundaria);
       }
    }
    
}

