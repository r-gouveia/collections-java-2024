package main.java.list.Pesquisa;

import java.util.ArrayList;
import java.util.List;

public class CatalogoLivros {
    private List<Livro> livrolist;

    public CatalogoLivros() {
        this.livrolist = new ArrayList<>();
    }

    public void adicionarLivro(String titulo, String autor, int anoPublicacao){
        livrolist.add(new Livro(titulo,autor,anoPublicacao));
    }

    public List<Livro> pesquisarPorAutor(String autor){
        List<Livro> livrosPorAutor = new ArrayList<>();
        if(!livrolist.isEmpty()){
            for(Livro l : livrolist){
                if(l.getAutor().equalsIgnoreCase(autor)){
                    livrosPorAutor.add(l);
                }
            }
        }
        return livrosPorAutor;
    }

    public List<Livro>pesquisarPorIntervaloAnos(int anoInicial, int anoFinal){
        List<Livro> livrosPorIntervaldoAnos = new ArrayList<>();
        if(!livrolist.isEmpty()){
            for(Livro l : livrolist){
                if(l.getAnoPublicacao() >= anoInicial && l.getAnoPublicacao() <= anoFinal){
                    livrosPorIntervaldoAnos.add(l);
                }
            }
        }
        return livrosPorIntervaldoAnos;
    }

    public Livro pesquisarPorTitulo(String titulo){
        Livro livrosPorTitulo = null;
        if(!livrolist.isEmpty()){
            for(Livro l : livrolist){
                if(l.getTitulo().equalsIgnoreCase(titulo)){
                    livrosPorTitulo = l;
                    break;
                }
            }
        }
        return livrosPorTitulo;
    }

    public static void main(String[] args) {
        CatalogoLivros catalogoLivros = new CatalogoLivros();

        catalogoLivros.adicionarLivro("Amor cego","autor 1",2020);
        catalogoLivros.adicionarLivro("Poseidon","autor 2",2005);
        catalogoLivros.adicionarLivro("Ego","autor 1",2021);
        catalogoLivros.adicionarLivro("Brasil","autor 3",2023);
        catalogoLivros.adicionarLivro("Paraiso","autor 4",1998);

        System.out.println(catalogoLivros.pesquisarPorIntervaloAnos(1900,2006));
        System.out.println(catalogoLivros.pesquisarPorAutor("autor 1"));
        System.out.println(catalogoLivros.pesquisarPorTitulo("Amor cego"));
        System.out.println(catalogoLivros.livrolist);
    }
}
