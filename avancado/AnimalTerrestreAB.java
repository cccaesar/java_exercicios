package avancado;

public abstract class AnimalTerrestreAB extends AnimalAB{
    public abstract void moverse();
    private int qtdDePatas;

    public void setQtdDePatas(int qtdDePatas) {
        this.qtdDePatas = qtdDePatas;
    }

    public int getQtdDePatas() {
        return qtdDePatas;
    }
}
