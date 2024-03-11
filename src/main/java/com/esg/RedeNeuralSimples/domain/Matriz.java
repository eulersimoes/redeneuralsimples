package com.esg.RedeNeuralSimples.domain;

public class Matriz {

    Double arrayLinhaColuna[][];

    public Integer getNumeroDeLinhas()
    {
        return arrayLinhaColuna.length;
    }

    public Integer getNumeroDeColunas()
    {
        return arrayLinhaColuna[0].length;
    }

    public Matriz(Integer linhas, Integer colunas)
    {
        arrayLinhaColuna = new Double[linhas][colunas];
    }

    public void PreencherMatriz(Integer linha, Integer coluna, Double valor)
    {
        arrayLinhaColuna[linha][coluna]=valor;
    }

    public Double getValor(Integer linha, Integer coluna)
    {
        return arrayLinhaColuna[linha][coluna];
    }
    public String ImprimirMatriz()
    {
        // Usando for
        String matriz = "";
        for (int i = 0; i < arrayLinhaColuna.length; i++) {
            matriz = i >0 ? matriz + "<br/>":matriz;
            for (int j = 0; j < arrayLinhaColuna[i].length; j++) {
                matriz +="A" + i + j +": " + (arrayLinhaColuna[i][j]) + "; ";
            }
        }
        return matriz;
    }
}
