package heranca_polimorfismo;

public class FuncionarioComGraduacao extends FuncionarioComEnsinoMedio {
    private String universidade;

    public FuncionarioComGraduacao(String nome, String codigoFuncional, Comissao comissao, String escolaEnsinoBasico, String escolaEnsinoMedio, String universidade) {
        super(nome, codigoFuncional, comissao, escolaEnsinoBasico, escolaEnsinoMedio);
        this.universidade = universidade;
        this.setRendaBasica(getRendaBasica() * 2F);
    }

    public String getUniversidade() {
        return universidade;
    }
}
