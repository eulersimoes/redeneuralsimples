package com.esg.RedeNeuralSimples.domain;

public class Rede {

    private Matriz matrizEntrada;

    private Camada camada;

    private Double saida=0d;

    private Integer epoca=0;


    public void IniciarReade(Matriz matrizEntrada, Camada camada) {
        this.matrizEntrada = matrizEntrada;
        this.camada = camada;
    }

    public void TreinarRede() {
        saida=0d;
        for (int i = 0; i < matrizEntrada.getNumeroDeLinhas(); i++) {
            for (int j = 0; j < matrizEntrada.getNumeroDeColunas(); j++) {
                saida += matrizEntrada.getValor(i, j) * camada.getValor(i);
            }
        }
        saida+=camada.getBias();
        saida = sigmoid(saida);
        epoca+=1;
        System.out.println("Valor Saída: "+saida + " época: " +epoca) ;
    }

    private static double sigmoid(double x)
    {
        return 1 / (1 + Math.exp(-x));
    }
}
