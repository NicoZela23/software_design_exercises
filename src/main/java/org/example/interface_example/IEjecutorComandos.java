package org.example.interface_example;

import java.util.HashMap;

interface IEjecutorComandos<T>
{
    void Ejecutar(String comando, IPaginador<T> paginador);
    void Adicionar(String token, IComando cmd);
    void SetComandoInvalido(IComando cmd);
    HashMap<String, IComando> getComandos();
}
