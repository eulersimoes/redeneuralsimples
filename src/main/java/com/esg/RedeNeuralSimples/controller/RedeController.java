package com.esg.RedeNeuralSimples.controller;

import com.esg.RedeNeuralSimples.domain.Camada;
import com.esg.RedeNeuralSimples.domain.Matriz;
import com.esg.RedeNeuralSimples.domain.Rede;
import com.esg.RedeNeuralSimples.util.MatrizUtil;
import jakarta.annotation.PostConstruct;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RedeController {

    Matriz entrada;
    Camada camada;

    Rede rede;
    @PostConstruct
    public  void IniciarMatriz()
    {
        entrada = entrada ==null ? MatrizUtil.GerarMatriz(2, 2) : entrada;
        camada = new Camada(2);
        entrada.PreencherMatriz(0,0,0.33d);
        entrada.PreencherMatriz(0,1,0.5d);

        entrada.PreencherMatriz(1,0,0.27d);
        entrada.PreencherMatriz(1,1,0.15d);

        camada.PreencherValores(0,0.35);
        camada.PreencherValores(1,0.75);
        camada.setBias(0d);

        rede = new Rede();
        rede.IniciarReade(entrada,camada);
        System.out.println("IniciarMatriz");
    }


    @GetMapping("/teste")
    public String Teste() {
        return "Teste Ok";
    }

    @GetMapping("/matrizteste")
    public String MatrizTeste()
    {
        rede.TreinarRede();
        return entrada.ImprimirMatriz();
    }
}
