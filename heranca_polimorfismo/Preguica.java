package heranca_polimorfismo;

public class Preguica extends Animal {
    public void subirEmArvores() {
        System.out.println("*Preguiça subindo a arvore*");
    }

    @Override
    public void emitirSom() {
        System.out.println("*Sons de preguiça*");
    }
}
