package com.fernandoangeli.modelomockito.service;

import org.junit.Before;
import org.junit.Test;

import static org.junit.jupiter.api.Assertions.*;

public class CalcServiceTest {

    // Declarar a service
    private CalcService service;

    // Lógica que deve ser executada antes de cada teste
    @Before
    public void setup(){
        service = new CalcService();
    }

    @Test
    public void deveRetornarASomaDeDoisValores(){
        int n1 = 10;
        int n2 = 20;

        int resultado = service.soma(n1, n2);

        assertEquals(30, resultado);
    }

    @Test
    public void deveRetornarASubtracaoDeDoisValores(){

        int n1 = 10;
        int n2 = 5;

        int resultado = service.subtracao(n1, n2);

        assertEquals(5, resultado);
    }

    @Test
    public void deveRetornarAsomaDeDoisNumerosMultiplicadoPeloTerceiro(){

        int n1 = 1;
        int n2 = 2;
        int n3 = 3;

        int resultado =  service.somaEMultiplicacao(n1, n2, n3);

        assertEquals(9, resultado);
    }
}