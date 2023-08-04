package avancado;

public class Pombo extends AnimalVoadorAB {

    @Override
    public void voar() {
        this.setKmPercorridos(getKmPercorridos() + 12.8F);
    }

    @Override
    public void comer() {
        this.setKgIngeridos(getKgIngeridos() + 0.35F);
    }

    @Override
    public void dormir() {
        this.setHorasDormindo(getHorasDormindo() + 12F);
    }
    
}
