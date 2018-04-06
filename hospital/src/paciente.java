
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
     pacientes_orden[] orders1 = new pacientes_orden[100];
      PriorityQueue<pacientes_orden> priorityQueue = new PriorityQueue<pacientes_orden>(){
      public int compare(pacientes_orden orderA, pacientrs_orden orderB){
                if(orderA.getPriority() < orderB.getPriority())
                return -1;
                else if(orderA.getPriority() > orderB.getPriority())
                return 1;
                else
                return 0;
            }
      }
}