package heranca_polimorfismo;

public class Funcionario {
    private String codigoFuncional;
    private String nome;
    private float rendaBasica = 1000.00F;
    private Comissao comissao;

    public Funcionario(String nome, String codigoFuncional, Comissao comissao) {
        this.nome = nome;
        this.codigoFuncional = codigoFuncional;
        this.comissao = comissao;
    }

    public void setRendaBasica(float rendaBasica) {
        this.rendaBasica = rendaBasica;
    }

    public String getNome() {
        return nome;
    }

    public String getCodigoFuncional() {
        return codigoFuncional;
    }

    public float getRendaBasica() {
        return rendaBasica;
    }

    public float getSalarioTotal() {
        return comissao != null ? rendaBasica + comissao.getComissao() : rendaBasica;
    }

    @Override
    public String toString() {
        return "Nome do funcionario: "+getNome()+", Comissão: R$ "+this.comissao.getComissao()+", Salário total: "+this.getSalarioTotal();
    }
}
