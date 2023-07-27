package heranca_polimorfismo;

public class Veterinario {
    private String nome;
    private String crmv;

    public Veterinario(String nome, String crmv) {
        this.nome = nome;
        this.crmv = crmv;
    }

    public void setCRMV(String crmv) {
        this.crmv = crmv;
    }

    public String getCRMV() {
        return crmv;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public void examinar(Animal paciente) {
        paciente.emitirSom();
    }
}
