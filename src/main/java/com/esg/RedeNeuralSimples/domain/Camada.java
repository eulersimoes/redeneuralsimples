package com.esg.RedeNeuralSimples.domain;

public class Camada {

    private Double arrayLinhaColuna[];
    private Double bias = 0d;

    private String nomeCamada;


    public Camada() {

    }

    public Camada(Integer quantidadePesos) {
        iniciarCamada(quantidadePesos);
        bias = 0d;
    }

    public Integer getNumeroValores()
    {
        return this.arrayLinhaColuna.length;
    }

    public void iniciarCamada(Integer quantidadePesos) {
        arrayLinhaColuna = new Double[quantidadePesos];
    }

    public void preencherPeso(Integer posicao, Double valorPeso) {
        arrayLinhaColuna[posicao] = valorPeso;
    }

    public Double getPeso(Integer posicao) {
        return arrayLinhaColuna[posicao];
    }

    public Double getBias() {
        return bias;
    }

    public void setBias(Double bias) {
        this.bias = bias;
    }

    public String getNomeCamada() {
        return nomeCamada;
    }

    public void setNomeCamada(String nomeCamada) {
        this.nomeCamada = nomeCamada;
    }
}
