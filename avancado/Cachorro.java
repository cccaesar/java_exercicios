package avancado;

public class Cachorro extends AnimalTerrestreAB {

    @Override
    public void comer() {
        this.setKgIngeridos(getKgIngeridos() + 20F); //Depende da raça, 20kg é o suficiente para cachorros de porte médio e grande. Para os de menor porte isso é um exagero. 
    }

    @Override
    public void moverse() {
        this.setKmPercorridos(getKmPercorridos() + 10F);
    }

    @Override
    public void dormir() {
        this.setHorasDormindo(getHorasDormindo() + 12F);
    }
}
