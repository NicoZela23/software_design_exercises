package org.example.observadorExamples.badObserver;

import java.util.List;
import java.util.ArrayList;
public class Main {
    public static void main(String[] args) {

        Numeros n = new Numeros();
        ObservadorSumador sumador = new ObservadorSumador(n);
        n.SetSumador(sumador);
        ObservadorMayor mayor =new ObservadorMayor(n);
        n.SetMayor(mayor);
        ObservadorMenor menor = new ObservadorMenor(n);
        n.SetMenor(menor);
        ObservadorImpar impar = new ObservadorImpar(n);
        n.SetImpar(impar);

        n.Adicionar(10);
        n.Adicionar(20);
        n.Adicionar(60);
        n.Adicionar(28);
        n.Adicionar(11);
        n.Adicionar(23);

    }
}

class Numeros
{
    List<Integer> numeros;
    ObservadorSumador sumador;
    ObservadorMayor mayor;
    ObservadorImpar impar;

    ObservadorMenor menor;
    public Numeros()
    {
        numeros = new ArrayList<>();
    }

    public void SetSumador(ObservadorSumador sumador)
    {this.sumador=sumador;}

    public void SetMayor(ObservadorMayor mayor)
    {this.mayor=mayor;}

    public void SetMenor(ObservadorMenor menor)
    {this.menor=menor;}

    public void SetImpar(ObservadorImpar impar)
    {this.impar=impar;}
    public void Adicionar(int n)
    {
        if (!numeros.contains(n)){
            numeros.add(n);
            Notificar();
        }
    }

    private void Notificar()
    {
        sumador.Actualizar();
        mayor.Actualizar();
        menor.Actualizar();
        impar.Actualizar();
    }

    public List<Integer> GetListaNumeros(){
        return numeros;
    }
}

class ObservadorSumador
{
    private Numeros numeros;

    public ObservadorSumador(Numeros nums)
    {
        numeros = nums;
    }
    public void Actualizar()
    {
        int sumatoria=0;
        for (int n : numeros.GetListaNumeros())
        {
            sumatoria+=n;
        }

        System.out.println("Sumatoria "+sumatoria);
    }
}

class ObservadorMayor
{
    private Numeros numeros;

    public ObservadorMayor(Numeros nums)
    {
        numeros = nums;
    }
    public void Actualizar()
    {
        int mayor = Integer.MIN_VALUE;
        for (int n : numeros.GetListaNumeros())
        {
            if(n>mayor){
                mayor = n;
            }

        }

        System.out.println("El mayor es "+ mayor);
    }
}

class ObservadorMenor
{
    private Numeros numeros;

    public ObservadorMenor(Numeros nums)
    {
        numeros = nums;
    }
    public void Actualizar()
    {
        int menor = Integer.MAX_VALUE;
        for (int n : numeros.GetListaNumeros())
        {
            if(n<menor){
                menor = n;
            }

        }

        System.out.println("El menor es "+ menor);
    }
}

class ObservadorImpar
{
    private Numeros numeros;

    public ObservadorImpar(Numeros nums)
    {
        numeros = nums;
    }
    public void Actualizar()
    {
        for (int n : numeros.GetListaNumeros())
        {
            if(n%2 != 0){
                System.out.println("Numero impar " + n);
            }

        }
    }
}

