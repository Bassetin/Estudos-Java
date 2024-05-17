package edu.lucas.collections.exerciciosList.list.exemplos.tarefa;

import java.util.ArrayList;
import java.util.List;

public class ListaTarefas {

    //atributos

    private List<Tarefa> tarefaList;


    public ListaTarefas() {
        this.tarefaList = new ArrayList<>();
    }

    public void adicionarNovasTarefas(String descricao){
        tarefaList.add(new Tarefa(descricao));
    }

    public void removerTarefas(String descricao){
        List<Tarefa> tarefasParaRemover = new ArrayList<>();
        for (Tarefa t : tarefaList){
            if(t.getDescricao().equalsIgnoreCase(descricao)){
                tarefasParaRemover.add(t);
            }

        }
        tarefaList.removeAll(tarefasParaRemover);
    }

    public int obterNumeroTotalTarefas (){
        return  tarefaList.size();
    }

    public void obterDescricoesTarefas(){
        System.out.println(tarefaList);
    }

    public static void main(String[] args) {
        ListaTarefas listatarefa = new ListaTarefas();
        System.out.println("O número atual de tarefas é : " + listatarefa.obterNumeroTotalTarefas());
        listatarefa.adicionarNovasTarefas("Lucas é gostoso");
        listatarefa.adicionarNovasTarefas("Lucas é lindo");
        listatarefa.adicionarNovasTarefas("Lucas é gostoso");
        System.out.println("O número atual de tarefas é : " + listatarefa.obterNumeroTotalTarefas());
        listatarefa.removerTarefas("Lucas é gostoso");
        System.out.println("O número atual de tarefas é : " + listatarefa.obterNumeroTotalTarefas());

        listatarefa.obterDescricoesTarefas();

    }

}
