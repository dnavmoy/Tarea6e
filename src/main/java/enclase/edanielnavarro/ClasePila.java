/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package enclase.edanielnavarro;

import java.util.ArrayList;
import java.util.Objects;

/**
 *
 * @author daniel
 */
public class ClasePila<T> {

    private final int tamMaximo;
    private final ArrayList<T> Pila;

    public ClasePila(int tamMaximo) {
        this.tamMaximo=tamMaximo;
        this.Pila = new ArrayList<>(tamMaximo);
    }

    public ArrayList<T> getPila() {
        return Pila;
    }


    @Override
    public int hashCode() {
        int hash = 5;
        hash = 59 * hash + this.tamMaximo;
        hash = 59 * hash + Objects.hashCode(this.Pila);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final ClasePila other = (ClasePila) obj;
        if (this.tamMaximo != other.tamMaximo) {
            return false;
        }
        return Objects.equals(this.Pila, other.Pila);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("ClasePila{\n");
         for(T p : this.Pila){
            System.out.println(p);
            sb.append("objeto ").append(p+ "\n"); 
        }
        sb.append('}');
        return sb.toString();
    }

    public boolean add(T objeto) {
        if (this.Pila.size() < tamMaximo) {
            this.Pila.add(objeto);
            return true;
        }
        return false;
    }

    public void push(T objeto) {
        if (this.Pila.size() < tamMaximo) {
            this.Pila.add(objeto);
        }

    }

    public T pop() {
        if(!estaVacia()){
        //String devolver = this.Pila.get(this.Pila.size() - 1);
        return this.Pila.remove(this.Pila.size() - 1);
        
        //return devolver;
        }
        return null;

    }

    public boolean estaVacia() {

        
        return Pila.isEmpty();
        
        
    }
    
    public boolean estaLlena() {
        
        if (this.Pila.size()>=tamMaximo) {
            return true;
        }
        return false;
    }

    
    public int numeroElementos(){
        return this.Pila.size();
    }
    
    public int numeroMaximo(){
        return tamMaximo;
    }
}
