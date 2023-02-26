package com.mycompany.controle.de.cadastro;

public class TecnicoAdministrativo extends Funcionario{
    public TecnicoAdministrativo(int id, String nome, int chefeID, boolean habilitacaoChefe, Habilitacao funcao) {
        super(id, nome, chefeID, habilitacaoChefe, funcao);
    }
}