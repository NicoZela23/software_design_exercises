package org.example.exercise1_copy;

import java.util.ArrayList;
import java.util.List;

public class ParserIntervalo {

    public Intervalo parseIntervaloSimple(int[] intervaloSimple){
        return new Intervalo(intervaloSimple[0],intervaloSimple[1]);
    }
    public List<Intervalo> parseIntervaloCompuesto(int[][] intervaloCompuesto){
        List<Intervalo> lista = new ArrayList<>();
        for (int [] i : intervaloCompuesto){
            lista.add(parseIntervaloSimple(i));
        }
        return lista;
    }
}
