package org.example.interface_example;

class ComandoSalir<T> implements IComando<T>
{
    public void Ejecutar(IPaginador<T> paginador)
    {
        System.exit(0);
    }
}
