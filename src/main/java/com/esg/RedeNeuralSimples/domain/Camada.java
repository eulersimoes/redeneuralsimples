package com.esg.RedeNeuralSimples.domain;

import java.util.ArrayList;

public class Camada {

    Double arrayLinhaColuna[];
    private Double bias = 0d;

    public Camada() {

    }

    public Camada(Integer quantidadePesos) {
        IniciarCamada(quantidadePesos);
        bias = 0d;
    }

    public void IniciarCamada(Integer quantidadePesos) {
        arrayLinhaColuna = new Double[quantidadePesos];
    }

    public void PreencherValores(Integer posicao, Double valor) {
        arrayLinhaColuna[posicao] = valor;
    }

    public Double getValor(Integer posicao) {
        return arrayLinhaColuna[posicao];
    }

    public Double getBias() {
        return bias;
    }

    public void setBias(Double bias) {
        this.bias = bias;
    }
}
