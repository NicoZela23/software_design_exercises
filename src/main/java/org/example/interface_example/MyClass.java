package org.example.interface_example;

import java.util.Scanner;

public class MyClass {
    public static void main(String args[]) {
      
      Scanner s = new Scanner(System.in);
      IEjecutorComandos<String> ejecutor = FabricaEjecutorComandos.<String>get();
      IPaginador<String> paginador=new Paginador<>();
      
      while(true)
      {
          String cmd = s.nextLine();
          ejecutor.Ejecutar(cmd, paginador);
      }
    }
}



