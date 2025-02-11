package main.java.set.OperacoesBasicas;

import java.util.HashSet;
import java.util.Set;

public class ConjuntoConvidados {
    private Set<Convidado> convidadoSet;

    public ConjuntoConvidados() {
        this.convidadoSet = new HashSet<>();
    }

    public void adicionarConvidado(String nome, int codigoConvite){
        convidadoSet.add(new Convidado(nome, codigoConvite));
    }

    public void  removerConvidadoPorCodigoConvite(int codigoConvite){
        Convidado convidadoParaRemover= null;

        for(Convidado c : convidadoSet){
            if(c.getCodigoConvite() == codigoConvite){
                convidadoParaRemover = c;
                break;
            }
        }
        convidadoSet.remove(convidadoParaRemover);
    }

    public int contarConvidados(){
        return convidadoSet.size();
    }

    public void exibirConvidados(){
        System.out.println(convidadoSet);
    }

    public static void main(String[] args) {
        ConjuntoConvidados conjuntoConvidados = new ConjuntoConvidados();

        System.out.println("Existem " + conjuntoConvidados.contarConvidados() + " elementos dentro do set convidados");

        conjuntoConvidados.adicionarConvidado("Romulo", 3309);
        conjuntoConvidados.adicionarConvidado("Ze", 3309);
        conjuntoConvidados.adicionarConvidado("Mylena", 3304);
        conjuntoConvidados.adicionarConvidado("Mayla ", 3306);

        System.out.println("Existem " + conjuntoConvidados.contarConvidados() + " elementos dentro do set convidados");
        conjuntoConvidados.exibirConvidados();

        conjuntoConvidados.removerConvidadoPorCodigoConvite(3306);

        System.out.println("Existem " + conjuntoConvidados.contarConvidados() + " elementos dentro do set convidados");
        conjuntoConvidados.exibirConvidados();

    }
}
