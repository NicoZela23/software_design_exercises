package org.example.interface_example;

class ComandoPrev<T> implements IComando<T>
{
    public void Ejecutar(IPaginador<T> paginador)
    {
        paginador.Prev();

    }
}
