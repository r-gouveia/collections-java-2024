package main.java.list.Pesquisa;

import java.util.ArrayList;
import java.util.List;

public class SomaNumeros {
    private List<Integer> numeros;

    public SomaNumeros() {
        this.numeros = new ArrayList<>();
    }

    public void adicionarNumero(int numero){
        numeros.add(numero);
    }
    public int calcularSoma(){
        int soma = 0;
        for(int s : numeros){
            soma += s;
        }
        return soma;
    }

    public int encontrarMaiorNumero(){
        int maior = Integer.MIN_VALUE;
        for(int i = 0 ; i<numeros.size(); i++){
            if(numeros.get(i) > maior){
                maior = numeros.get(i);
            }
        }
        return maior ;
    }
    public int encontrarMenorNumero(){
        // integer.Max_value indica que o menor numero ira conter o maior valor possivel
        // se meu i for menor que aquele que contem o maior valor , será ele o menor possivel
        // percorre a lista e será comparado
        int menor = Integer.MAX_VALUE;
        for(int i = 0; i<numeros.size(); i++){
            if (numeros.get(i) < menor){
                menor = numeros.get(i) ;
            }
        }
        return menor;
    }

    public List<Integer> exibirNumeros(){
        return numeros;
    }


    public static void main(String[] args) {
        SomaNumeros somaNumeros = new SomaNumeros();

        somaNumeros.adicionarNumero(10);
        somaNumeros.adicionarNumero(20);
        somaNumeros.adicionarNumero(30);
        somaNumeros.adicionarNumero(40);
        somaNumeros.adicionarNumero(75);
        somaNumeros.adicionarNumero(76);

        System.out.println("Lista : " + somaNumeros.exibirNumeros());
        System.out.println("Soma dos numeros: " + somaNumeros.calcularSoma());
        System.out.println("Menor numero: " + somaNumeros.encontrarMenorNumero());
        System.out.println("Maior numero: " + somaNumeros.encontrarMaiorNumero());
    }

}
