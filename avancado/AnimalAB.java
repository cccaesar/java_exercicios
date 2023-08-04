package avancado;

public abstract class AnimalAB implements AnimalIF {
    public abstract void comer();
    public abstract void dormir();

    private float kgIngeridos;
    private float kmPercorridos;
    private float horasDormindo;
    private int idade;
    private float peso;
    private String habitat;
    private float altura;
    private String tipo;
    private String nome;

    public void setHorasDormindo(float horasDormindo) {
        this.horasDormindo = horasDormindo;
    }
    
    public void setKgIngeridos(float kgIngeridos) {
        this.kgIngeridos = kgIngeridos;
    }

    public void setKmPercorridos(float kmPercorridos) {
        this.kmPercorridos = kmPercorridos;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public void setPeso(float peso) {
        this.peso = peso;
    }

    public void setHabitat(String habitat) {
        this.habitat = habitat;
    }

    public void setAltura(float altura) {
        this.altura = altura;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public float getKmPercorridos() {
        return kmPercorridos;
    }

    public float getKgIngeridos() {
        return kgIngeridos;
    }

    public float getHorasDormindo() {
        return horasDormindo;
    }

    public int getIdade() {
        return idade;
    }

    public float getPeso() {
        return peso;
    }

    public String getHabitat() {
        return habitat;
    }

    public float getAltura() {
        return altura;
    }

    public String getTipo() {
        return tipo;
    }

    public String getNome() {
        return nome;
    }
}
