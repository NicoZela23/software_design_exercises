package org.example.interface_example;

class ComandoInvalido<T> implements IComando<T> {
    public void Ejecutar(IPaginador<T> paginador) {
        System.out.println("Comando invalido");
    }
}
