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
        entrada.preencherMatriz(0,0,0.33d);
        entrada.preencherMatriz(0,1,0.5d);

        entrada.preencherMatriz(1,0,0.27d);
        entrada.preencherMatriz(1,1,0.15d);

        camada.preencherPeso(0,0.35);
        camada.preencherPeso(1,0.75);
        camada.setBias(0d);

        rede = new Rede();
        rede.iniciarReade(entrada,camada);
        System.out.println("IniciarMatriz");
    }


    @GetMapping("/teste")
    public String Teste() {
        return "Teste Ok";
    }

    @GetMapping("/matrizteste")
    public String MatrizTeste()
    {
        rede.treinarRede();
        if(rede.getErro() < 0.8)
        {
            rede.backPropagation();
        }
        return rede.printStatus();
    }
}

