package controleDeCadastro;

public class Subordinado implements Habilitacao{
    @Override
    public boolean isChefe() {
        return false;
    }
}
