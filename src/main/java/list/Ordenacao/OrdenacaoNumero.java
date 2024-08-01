package main.java.list.Ordenacao;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class OrdenacaoNumero  {
    private List<Integer> numeros;

    public OrdenacaoNumero() {
        this.numeros = new ArrayList<>();
    }

    public void adicionarNumero(int numero){
        numeros.add(numero);
    }
     public List<Integer>ordenarAscendente(){
        List<Integer> ordenarAscendente = new ArrayList<>(numeros);
         Collections.sort(ordenarAscendente);
         return  ordenarAscendente;
     }

     public List<Integer > ordenarDescendente(){
         List<Integer> ordenarDescentende = new ArrayList<>(numeros);
         ordenarDescentende.sort(Comparator.reverseOrder());
         return ordenarDescentende;
     }


    public static void main(String[] args) {
        OrdenacaoNumero ordenacaoNumero = new OrdenacaoNumero();

        ordenacaoNumero.adicionarNumero(12);
        ordenacaoNumero.adicionarNumero(13);
        ordenacaoNumero.adicionarNumero(15);
        ordenacaoNumero.adicionarNumero(20);
        ordenacaoNumero.adicionarNumero(16);
        ordenacaoNumero.adicionarNumero(17);
        ordenacaoNumero.adicionarNumero(21);
        ordenacaoNumero.adicionarNumero(18);
        ordenacaoNumero.adicionarNumero(19);
        ordenacaoNumero.adicionarNumero(22);
        ordenacaoNumero.adicionarNumero(23);

        System.out.println("Crescente : "  + ordenacaoNumero.ordenarAscendente());
        System.out.println("Decrescente : " + ordenacaoNumero.ordenarDescendente());
    }

}
