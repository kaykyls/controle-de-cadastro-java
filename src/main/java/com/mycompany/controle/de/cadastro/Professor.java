package com.mycompany.controle.de.cadastro;

public class Professor extends Funcionario {
    public Professor(int id, String nome, int chefeID, boolean habilitacaoChefe, Habilitacao funcao) {
        super(id, nome, chefeID, habilitacaoChefe, funcao);
    }
}
