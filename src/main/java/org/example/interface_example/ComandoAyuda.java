package org.example.interface_example;

import java.util.HashMap;
import java.util.Map;

class ComandoAyuda<T> implements IComando<T> {
    IEjecutorComandos<T> ejecutor;

    public ComandoAyuda(IEjecutorComandos<T> e) {
        ejecutor = e;
    }

    public void Ejecutar(IPaginador<T> paginador) {
        HashMap<String, IComando> comandos = ejecutor.getComandos();

        for (Map.Entry<String, IComando> entry : comandos.entrySet()) {
            System.out.println(entry.getKey());
        }
    }

}