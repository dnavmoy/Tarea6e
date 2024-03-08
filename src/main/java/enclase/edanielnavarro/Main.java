/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package enclase.edanielnavarro;





/**
 *
 * @author daniel
 */
public class Main {
    
    //constructor con tamaño maximo
    //añadir elementos
    //sacar elementos
    //saber si esta vacia
    //saber si esta llena
    // to string
    //saber nº de elementos
    //saber nº max de elementos
    
  
   
    public static void main(String[] args) {
        
        
        ClasePila<String> pila = new ClasePila(6);
        
        pila.add("hola");
        pila.add("hole");
        pila.add("holi");
        pila.add("holo");
        pila.add("holu");
        pila.add("holaa");
        pila.add("holae");
        pila.add("holai");
        pila.add("holao");
        
        
        for(String p : pila.getPila()){
            System.out.println(p);
                    
        }
        
        
         System.out.println("pila esta llena?:" + pila.estaLlena());
        
        String devuelto = pila.pop();
        System.out.println("Devuelto: " +devuelto);
        
        for(String p : pila.getPila()){
            System.out.println(p);
                    
        }
        
        System.out.println("pila esta vacia?:" + pila.estaVacia());
        System.out.println("pila esta llena?:" + pila.estaLlena());
        
        System.out.println("to string: ");
        System.out.println(pila);
     
        
        System.out.println("numero maximo de elementos : " + pila.numeroMaximo());
        System.out.println("numero de eleentos : " + pila.numeroElementos());
        
        System.out.println("ahora con lista FIFO\n\n");
        
        PilaFIFO<String> pilaFIFO = new PilaFIFO<>(6);
        
        
        System.out.println(pilaFIFO.add("hola"));
        pilaFIFO.add("hole");
        pilaFIFO.add("holi");
        pilaFIFO.add("holo");
        pilaFIFO.add("holu");
        pilaFIFO.add("holaa");
        pilaFIFO.add("holae");
        pilaFIFO.add("holai");
        pilaFIFO.add("holao");
        
        for(String p : pilaFIFO.getPila()){
            System.out.println(p);
                    
        }
        
        
         System.out.println("pilaFIFO esta llena?:" + pilaFIFO.estaLlena());
        
        String devuelto2 = pilaFIFO.pop();
        System.out.println("devuelto 2 : " + devuelto2);
        
        for(String p : pilaFIFO.getPila()){
            System.out.println(p);
                    
        }
        
        System.out.println("pilaFIFO esta vacia?:" + pilaFIFO.estaVacia());
        System.out.println("pilaFIFO esta llena?:" + pilaFIFO.estaLlena());
        
        System.out.println("to string: ");
        System.out.println(pilaFIFO);
     
        
        System.out.println("numero maximo de elementos : " + pilaFIFO.numeroMaximo());
        System.out.println("numero de elementos : " + pilaFIFO.numeroElementos());
        
        
    }
   
    
    
}
