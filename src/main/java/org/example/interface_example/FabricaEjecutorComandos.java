package org.example.interface_example;

class FabricaEjecutorComandos
{
    public static IEjecutorComandos<String> get()
    {
        IEjecutorComandos ejecutor = new EjecutorComandos<String>();
        ejecutor.SetComandoInvalido(new ComandoInvalido<String>());
        ejecutor.Adicionar("salir", new ComandoSalir<String>());
        ejecutor.Adicionar("adicionar", new ComandoAdicionar());
        ejecutor.Adicionar("prev", new ComandoPrev<String>());

        ejecutor.Adicionar("help", new ComandoAyuda(ejecutor));

        return ejecutor;
    }

}
