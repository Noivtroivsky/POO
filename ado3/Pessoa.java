

//Noá Miglio

package ado3;

public class Pessoa {
    private double altura;
    private double peso;
    private String sexo;

    // Construtor
    public Pessoa(double altura, double peso, String sexo) {
        this.altura = altura;
        this.peso = peso;
        this.sexo = sexo;
    }

    // Getters e Setters
    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    // Método para exibir as informações
    public void exibirInformacoes() {
        System.out.println("Altura: " + altura + " metros");
        System.out.println("Peso: " + peso + " kg");
        System.out.println("Sexo: " + sexo);
    }

    // Método para calcular o IMC
    public double calcularImc() {
        return peso / (altura * altura);
    }

    // Método para obter a classificação do IMC
    public String classificarImc() {
        double imc = calcularImc();
        if (imc < 16) {
            return "Severo emagrecimento";
        } else if (imc < 16.9) {
            return "Emagrecimento moderado";
        } else if (imc < 18.4) {
            return "Emagrecimento leve";
        } else if (imc < 24.9) {
            return "Peso normal";
        } else if (imc < 29.9) {
            return "Sobrepeso";
        } else if (imc < 34.9) {
            return "Obesidade grau 1";
        } else if (imc < 39.9) {
            return "Obesidade grau 2";
        } else {
            return "Obesidade grau 3";
        }
    }
}
