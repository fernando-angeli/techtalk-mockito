package com.fernandoangeli.modelomockito.service;

import org.springframework.stereotype.Service;

@Service
public class CalcService {

    public int soma(int n1, int n2){
        return n1 + n2;
    }

    public int subtracao(int n1, int n2){
        return n1 - n2;
    }

    public int somaEMultiplicacao(int n1, int n2, int n3){
        int soma = soma(n1, n2);
        return soma * n3;
    }

}
