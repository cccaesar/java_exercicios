package avancado;

public class Peixe extends AnimalMarinhoAB {

    @Override
    public void nadar() {
        this.setKmPercorridos(getKmPercorridos() + 24F);
    }

    @Override
    public void comer() {
        this.setKgIngeridos(getKgIngeridos() + 4F);
    }

    @Override
    public void dormir() {
        this.setHorasDormindo(getHorasDormindo() + 8F);
    }
    
}
