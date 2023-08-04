package avancado;

public class Elefante extends AnimalTerrestreAB {

    @Override
    public void comer() {
        this.setKgIngeridos(getKgIngeridos() + 200F);
    }

    @Override
    public void moverse() {
        this.setKmPercorridos(getKmPercorridos() + 50F);
    }

    @Override
    public void dormir() {
        this.setHorasDormindo(getHorasDormindo() + 2F);
    }
    
}
