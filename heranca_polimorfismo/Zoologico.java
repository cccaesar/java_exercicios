package heranca_polimorfismo;

public class Zoologico {
    private Animal[] jaulas = { null, null, null, null, null, null, null, null, null, null};
    private int pivo = 0;

    public void pushAnimal(Animal animal) {
        if( jaulas.length > pivo ) {
            jaulas[pivo] = animal;
            pivo++;
        }
        else {
            System.out.println("As jaulas estão cheias");
        }
    }

    public Animal popAnimal() {
        return jaulas[pivo--];
    }

    public Animal peekAnimal() {
        return jaulas[pivo];
    }

    public Animal[] getJaulas() {
        return jaulas;
    }
}
