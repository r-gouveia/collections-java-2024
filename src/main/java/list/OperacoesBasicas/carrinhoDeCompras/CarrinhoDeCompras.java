package main.java.list.OperacoesBasicas.carrinhoDeCompras;

import java.util.ArrayList;
import java.util.List;
public class CarrinhoDeCompras {
    private List<Item> carrinhoList;

    public CarrinhoDeCompras() {
        this.carrinhoList = new ArrayList<>();
    }

    public void adicionarItem(String nome, int preco, int quantidade){
        carrinhoList.add(new Item(nome, preco, quantidade));
    }

    public void removerItem(String nome){
        List<Item> itemParaRemover = new ArrayList<>();
        for( Item I : carrinhoList){
            if(I.getNome().equalsIgnoreCase(nome)){
                itemParaRemover.add(I);
            }
        }
        carrinhoList.removeAll(itemParaRemover);
    }

    public int calcularValorTotal() {
        int total = 0;
        for(Item item : carrinhoList){
            total += item.getPreco()* item.getQuantidade();
        }
        return total;
    }

    public void exibirItens(){
        System.out.println(carrinhoList);
    }

    public static void main(String[] args) {
        CarrinhoDeCompras carrinhoDeCompras = new CarrinhoDeCompras();

        carrinhoDeCompras.adicionarItem("Celular",100,1);
        carrinhoDeCompras.adicionarItem("Notebook", 560,1);
        carrinhoDeCompras.adicionarItem("Notebook", 560,1);


        carrinhoDeCompras.exibirItens();
        System.out.println("Valor da compra:" + carrinhoDeCompras.calcularValorTotal());
        carrinhoDeCompras.removerItem("Notebook");
        carrinhoDeCompras.exibirItens();
        System.out.println("Valor da compra:" + carrinhoDeCompras.calcularValorTotal());


    }

}



