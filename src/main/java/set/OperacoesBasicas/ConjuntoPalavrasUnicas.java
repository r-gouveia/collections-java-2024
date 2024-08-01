package main.java.set.OperacoesBasicas;

import java.util.HashSet;
import java.util.Set;

public class ConjuntoPalavrasUnicas {
    private Set<String> palavrasUnicas;

    public ConjuntoPalavrasUnicas() {
        this.palavrasUnicas = new HashSet<>();
    }

    public void adicionarPalavra(String palavra){
        palavrasUnicas.add(new String(palavra));
    }

    public void removerPalavra(String palavra){
       String palavrasParaRemover = null;
        for(String p : palavrasUnicas){
            if(p.equals(palavra)){
                palavrasParaRemover = p;
                break;
            }
        }
        palavrasUnicas.remove(palavrasParaRemover);
    }

    public void verificarPalavra(String palavra){

        for(String p : palavrasUnicas){
            if(p.equals(palavra)){
                palavra = p;
                System.out.println("Está na lista");
                break;
            }else{
                System.out.println("Não está na lista");
                break;
            }
        }

    }

    public void exibirPalavrasUnicas(){
        System.out.println(palavrasUnicas);
    }

    public static void main(String[] args) {
        ConjuntoPalavrasUnicas conjuntoPalavrasUnicas = new ConjuntoPalavrasUnicas();

        conjuntoPalavrasUnicas.adicionarPalavra("Abacaxi");
        conjuntoPalavrasUnicas.adicionarPalavra("Abacaxi");
        conjuntoPalavrasUnicas.adicionarPalavra("Morango");
        conjuntoPalavrasUnicas.adicionarPalavra("Cebola");
        conjuntoPalavrasUnicas.adicionarPalavra("Tomate");
        conjuntoPalavrasUnicas.adicionarPalavra("Abacate");
        conjuntoPalavrasUnicas.adicionarPalavra("Uva");

        conjuntoPalavrasUnicas.exibirPalavrasUnicas();
        conjuntoPalavrasUnicas.verificarPalavra("Banana");

        conjuntoPalavrasUnicas.removerPalavra("Tomate");
        conjuntoPalavrasUnicas.exibirPalavrasUnicas();
    }


}
