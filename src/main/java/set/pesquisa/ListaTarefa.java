package main.java.set.pesquisa;


import java.util.HashSet;
import java.util.Set;

public class ListaTarefa {
    Set<Tarefa> tarefaSet;

    public ListaTarefa() {
        this.tarefaSet = new HashSet<>();
    }

    public void adicionarTarefa(String descricao) {
        tarefaSet.add(new Tarefa(descricao));
    }

    public void removerTarefa(String descricao) {
        Tarefa tarefaRemover = null;
        for (Tarefa t : tarefaSet) {
            if (t.getDescricao().equalsIgnoreCase(descricao)) {
                tarefaRemover = t;
                break;
            }
            if (tarefaRemover != null) {
                tarefaSet.remove(tarefaRemover);
            }
        }
        tarefaSet.add(tarefaRemover);
    }

    public void exibirTarefas() {
        for (Tarefa f : tarefaSet){
            System.out.println(f);
        }
    }

    public int contarTarefas() {
        return tarefaSet.size();
    }

    public Set<Tarefa> obterTarefasConcluidas() {
        Set<Tarefa> tarefasConcluidas = new HashSet<>();
        for (Tarefa t : tarefaSet) {
            if (t.isStatusConclusao()){
                tarefasConcluidas.add(t);
            }
        }
        return tarefasConcluidas;
    }
    public Set<Tarefa> obterTarefasPendentes() {
        Set<Tarefa> tarefasPendentes = new HashSet<>();
        for (Tarefa t : tarefaSet) {
            if (!t.isStatusConclusao()) {
                tarefasPendentes.add(t);
            }
        }
        return tarefasPendentes;

    }


    public void marcarTarefaConcluida(String descricao) {
        for (Tarefa t : tarefaSet) {
            if (t.getDescricao().equalsIgnoreCase(descricao)) {
                t.setStatusConclusao(true);
                break;
            }
        }
    }

    public void marcarTarefaPendente(String descricao) {
        for (Tarefa t : tarefaSet) {
            if (t.getDescricao().equalsIgnoreCase(descricao)) {
                t.setStatusConclusao(false);
                break;
            }
        }
    }

    public void limparListaTarefas() {
        tarefaSet.clear();
    }


    public static void main(String[] args) {

        ListaTarefa listaTarefa = new ListaTarefa();


        listaTarefa.adicionarTarefa("Dormir");
        listaTarefa.adicionarTarefa("Comer");
        listaTarefa.adicionarTarefa("Correr");
        listaTarefa.adicionarTarefa("Malhar");
        System.out.println(listaTarefa.contarTarefas());
        listaTarefa.exibirTarefas();
        listaTarefa.marcarTarefaConcluida("Correr");
        listaTarefa.marcarTarefaConcluida("Malhar");
        System.out.println(listaTarefa.obterTarefasConcluidas());
        System.out.println(listaTarefa.obterTarefasPendentes());



    }


}
