package avancado;

public class Leao extends AnimalTerrestreAB {

    @Override
    public void comer() {
        this.setKgIngeridos(getKgIngeridos() + 6F);
    }

    @Override
    public void moverse() {
        this.setKmPercorridos(getKmPercorridos() + 69F);
    }

    @Override
    public void dormir() {
        this.setHorasDormindo(getHorasDormindo() + 14);
    }
    
}
