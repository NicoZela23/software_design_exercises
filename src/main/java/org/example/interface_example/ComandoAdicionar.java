package org.example.interface_example;

import java.util.Scanner;

class ComandoAdicionar implements IComando<String>
{
    public void Ejecutar(IPaginador<String> paginador)
    {
        Scanner s = new Scanner(System.in);
        System.out.println("ingrese dato");
        String cadena = s.nextLine();
        paginador.Adicionar(cadena);
    }
}
