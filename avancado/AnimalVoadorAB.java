package avancado;

public abstract class AnimalVoadorAB extends AnimalAB{
    public abstract void voar();
    private int qtdDePatas;
    private int qtdDeAsas;
    private float envergaduraAsa;

    public void setQtdDePatas(int qtdDePatas) {
        this.qtdDePatas = qtdDePatas;
    }

    public void setQtdDeAsas(int qtdDeAsas) {
        this.qtdDeAsas = qtdDeAsas;
    }

    public void setEnvergaduraAsa(float envergaduraAsa) {
        this.envergaduraAsa = envergaduraAsa;
    }

    public int getQtdDePatas() {
        return qtdDePatas;
    }

    public int getQtdDeAsas() {
        return qtdDeAsas;
    }

    public float getEnvergaduraAsa() {
        return envergaduraAsa;
    }
}
