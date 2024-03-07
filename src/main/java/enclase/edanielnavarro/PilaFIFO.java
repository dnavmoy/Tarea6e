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
public class PilaFIFO<T> {

    private final int tamMaximo;
    private ArrayList<T> Pila;

    public PilaFIFO(int tamMaximo) {
        this.tamMaximo = tamMaximo;
        this.Pila = new ArrayList<>(tamMaximo);
    }

    public ArrayList<T> getPila() {
        return Pila;
    }

    public void setPila(ArrayList<T> Pila) {
        this.Pila = Pila;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 73 * hash + this.tamMaximo;
        hash = 73 * hash + Objects.hashCode(this.Pila);
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
        final PilaFIFO<?> other = (PilaFIFO<?>) obj;
        if (this.tamMaximo != other.tamMaximo) {
            return false;
        }
        return Objects.equals(this.Pila, other.Pila);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("PilaFIFO{");
        sb.append("tamMaximo=").append(tamMaximo);
        sb.append(", Pila=").append(Pila);
        sb.append('}');
        return sb.toString();
    }

    public boolean estaVacia() {
        return Pila.isEmpty();

    }

    public boolean estaLlena() {

        if (this.Pila.size() >= tamMaximo) {
            return true;
        }
        return false;
    }

    public int numeroElementos() {
        return this.Pila.size();
    }

    public int numeroMaximo() {
        return tamMaximo;
    }

    public void add(T t) {
        if (this.Pila.size() < tamMaximo) {
            this.Pila.add(t);
        }

    }

    public T pop() {
        if (!estaVacia()) {
            T devolver = this.Pila.get(0);
            this.Pila.remove(0);
            return devolver;

        }
        return null;

    }

}
