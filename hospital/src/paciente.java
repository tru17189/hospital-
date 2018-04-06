
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Comparator;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ottoalexander
 */
public class paciente {
     public static void main(String[] args) throws IOException{
      String out="";
      BufferedReader text = new BufferedReader(new FileReader("pacientes.txt"));
      String str;
      while ((str = text.readLine()) != null){
          out+=str+"\n";
      }
       text.close();
       System.out.print(out); 
     }
     pacientes_orden[] pacientes_orden = new pacientes_orden[100];
    VectorHeap<pacientes_orden> priorityQueue = new VectorHeap<pacientes_orden>();
            }