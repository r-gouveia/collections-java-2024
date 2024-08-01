package main.java.list.Ordenacao;

import java.security.PublicKey;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class OrdenacaoPessoa{
    private List<Pessoa> pessoaList;

    public OrdenacaoPessoa() {
        this.pessoaList = new ArrayList<>();
    }

    public void adicionarPessoa(String nome, int idade, double altura){
        pessoaList.add(new Pessoa( nome,  idade,  altura));
    }

    public List<Pessoa> ordenarIdade(){
        List<Pessoa> pessoasPorIdade = new ArrayList<>(pessoaList);
        Collections.sort(pessoasPorIdade);
        return pessoasPorIdade;

    }
    public List<Pessoa> ordenarAltura(){
        List<Pessoa> pessoasPorAltura = new ArrayList<>(pessoaList);
        Collections.sort(pessoasPorAltura, new ComparatorPorAltura());
        return pessoasPorAltura;
    }

    public static void main(String[] args) {
        OrdenacaoPessoa ordenacaoPessoa = new OrdenacaoPessoa();

        ordenacaoPessoa.adicionarPessoa("pessoa 1", 25,1.78);
        ordenacaoPessoa.adicionarPessoa("pessoa 2", 23,1.68);
        ordenacaoPessoa.adicionarPessoa("pessoa 3", 18,1.58);
        ordenacaoPessoa.adicionarPessoa("pessoa 4", 29,1.98);
        ordenacaoPessoa.adicionarPessoa("pessoa 5", 17,1.88);

        System.out.println("Por altura: " + ordenacaoPessoa.ordenarAltura());
        System.out.println("Por idade: " + ordenacaoPessoa.ordenarIdade());
        System.out.println();
        System.out.println("lista : " + ordenacaoPessoa.pessoaList);
    }



}
