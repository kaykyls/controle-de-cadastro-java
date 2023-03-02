package controleDeCadastro;
import java.util.ArrayList;

abstract public class Funcionario {
    private int id;
    private String nome;
    private int chefeID;
    private Habilitacao funcao;
    
    private int idDeChefe;
    
    ArrayList<String> subordinados = new ArrayList<String>();
    ArrayList<Integer> chefesIDs = new ArrayList<Integer>();

    public Funcionario(int id, String nome, int chefeID, Habilitacao funcao) {
        this.id = id;
        this.nome = nome;
        this.chefeID = chefeID;
        this.funcao = funcao;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getChefeID() {
        return chefeID;
    }

    public void setChefeID(int chefeID) {
        this.chefeID = chefeID;
    }

    public Habilitacao getFuncao() {
        return funcao;
    }

    public void setFuncao(Habilitacao funcao) {
        this.funcao = funcao;
    }

    public int getIdDeChefe() {
        return idDeChefe;
    }

    public void setIdDeChefe(int idDeChefe) {
        this.idDeChefe = idDeChefe;
    }

    public ArrayList<String> getSubordinados() {
        return subordinados;
    }

    public void setSubordinados(ArrayList<String> subordinados) {
        this.subordinados = subordinados;
    }

    public ArrayList<Integer> getChefesIDs() {
        return chefesIDs;
    }

    public void setChefesIDs(ArrayList<Integer> chefesIDs) {
        this.chefesIDs = chefesIDs;
    }

    @Override
    public String toString() {
        return "Funcionario{" + "id=" + id + ", nome=" + nome + ", chefeID=" + chefeID + ", funcao=" + funcao + ", idDeChefe=" + idDeChefe + ", subordinados=" + subordinados + ", chefesIDs=" + chefesIDs + '}';
    }
}
