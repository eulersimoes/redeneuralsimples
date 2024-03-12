package com.esg.RedeNeuralSimples.domain;

public class Rede {

    private Matriz matrizEntrada;

    private Camada camadaPeso;

    private Double saida=0d;

    private Double erro=0d;

    private Integer epoca=0;

    private Double taxaAprendisado=0.05;


    public void iniciarReade(Matriz matrizEntrada, Camada camada) {
        this.matrizEntrada = matrizEntrada;
        this.camadaPeso = camada;
    }

    public void treinarRede() {
        saida=0d;
        for (int i = 0; i < matrizEntrada.getNumeroDeLinhas(); i++) {
            for (int j = 0; j < matrizEntrada.getNumeroDeColunas(); j++) {
                saida = getSaida() + matrizEntrada.getValor(i, j) * camadaPeso.getPeso(i);
            }
        }
        saida = getSaida() + camadaPeso.getBias();
        saida = sigmoid(getSaida());
        erro = Math.pow(0.5*(1- getSaida()),2);
        epoca = getEpoca() + 1;
        System.out.println("========================================== Valor Saída: "+ getSaida() + " Valor Erro: " + getErro() + " época: " + getEpoca()) ;
    }

    public void backPropagation()
    {
        for (int i = 0; i < matrizEntrada.getNumeroDeLinhas(); i++) {
            for (int j = 0; j < matrizEntrada.getNumeroDeColunas(); j++) {
                camadaPeso.preencherPeso(i,camadaPeso.getPeso(i)+taxaAprendisado*(1-erro)+matrizEntrada.getValor(i,j));
            }
        }
    }


    private static double sigmoid(double x)
    {
        return 1 / (1 + Math.exp(-x));
    }

    public Double getSaida() {
        return saida;
    }

    public Double getErro() {
        return erro;
    }

    public Integer getEpoca() {
        return epoca;
    }

    public String printStatus(){
        return "Saída: " + this.saida + " <br/>Erro: " + this.erro + "<br/>Época: "+ this.epoca;
    }
}
