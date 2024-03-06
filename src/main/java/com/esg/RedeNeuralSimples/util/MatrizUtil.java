package com.esg.RedeNeuralSimples.util;

import com.esg.RedeNeuralSimples.domain.Matriz;

public class MatrizUtil {

    public static Matriz GerarMatriz(Integer linhas, Integer colunas )
    {
        return new Matriz(linhas,colunas);
    }
}
