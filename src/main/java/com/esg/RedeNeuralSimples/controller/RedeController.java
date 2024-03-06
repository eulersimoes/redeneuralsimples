package com.esg.RedeNeuralSimples.controller;

import com.esg.RedeNeuralSimples.domain.Matriz;
import com.esg.RedeNeuralSimples.util.MatrizUtil;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RedeController {
    @GetMapping("/teste")
    public String Teste() {
        return "Teste Ok";
    }

    @GetMapping("/matrizteste")
    public String MatrizTeste()
    {
        Matriz m = MatrizUtil.GerarMatriz(2, 2);
        m.PreencherMatriz(0, 0, 5);
        m.PreencherMatriz(0, 1, 10);
        m.PreencherMatriz(1, 0, 2);
        m.PreencherMatriz(1, 1, 7);
        return m.ImprimirMatriz();
    }
}
