package org.example.interface_example;

import java.util.HashMap;

class EjecutorComandos<T> implements IEjecutorComandos<T>
{
    private HashMap<String, IComando> comandos = new HashMap<String, IComando>();
    private IComando comandoInvalido;

    public void Adicionar(String token, IComando cmd)
    {
        comandos.put(token, cmd);
    }

    public HashMap<String, IComando> getComandos()
    {
        return comandos;
    }

    public void Ejecutar(String cmd, IPaginador<T> paginador)
    {
        if(comandos.containsKey(cmd))
        {
            comandos.get(cmd).Ejecutar(paginador);
        }
        else
        {
            comandoInvalido.Ejecutar(paginador);
        }
    }

    public void SetComandoInvalido(IComando cmd)
    {
        comandoInvalido = cmd;
    }
}
