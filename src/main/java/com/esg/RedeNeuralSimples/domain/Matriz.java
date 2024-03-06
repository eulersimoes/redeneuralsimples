package com.esg.RedeNeuralSimples.domain;

public class Matriz {

    Integer arrayLinhaColuna[][];

    public Matriz(Integer linhas, Integer colunas)
    {
        arrayLinhaColuna = new Integer[linhas][colunas];
    }

    public void PreencherMatriz(Integer linha, Integer coluna, Integer valor)
    {
        arrayLinhaColuna[linha][coluna]=valor;
    }

    public String ImprimirMatriz()
    {
        // Usando for
        String matriz = "";
        for (int i = 0; i < arrayLinhaColuna.length; i++) {
            matriz = i >0 ? matriz + "<br/>":matriz;
            for (int j = 0; j < arrayLinhaColuna[i].length; j++) {
                matriz +="a" + i + j +" > " + (arrayLinhaColuna[i][j]) + "; ";
            }
        }
        return matriz;
    }


}
