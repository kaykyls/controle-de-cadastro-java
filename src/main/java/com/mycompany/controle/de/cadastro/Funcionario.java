package com.mycompany.controle.de.cadastro;

abstract public class Funcionario {
    String nome;
    String chefe;
    boolean habilitacaoChefe;
    String funcao;
    
    public Funcionario(String nome, String chefe, boolean habilitacaoChefe, String funcao) {
        this.nome = nome;
        this.chefe = chefe;
        this.habilitacaoChefe = habilitacaoChefe;
        this.funcao = funcao;
    }

    @Override
    public String toString() {
        return "Funcionario{" + "nome=" + nome + ", chefe=" + chefe + ", habilitacao=" + habilitacao + ", funcao=" + funcao + '}';
    }
}
