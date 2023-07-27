package heranca_polimorfismo;

public class FuncionarioComEnsinoMedio extends FuncionarioComEnsinoBasico{
    private String escolaEnsinoMedio;

    public FuncionarioComEnsinoMedio(String nome, String codigoFuncional, Comissao comissao, String escolaEnsinoBasico, String escolaEnsinoMedio) {
        super(nome, codigoFuncional, comissao, escolaEnsinoBasico);
        this.escolaEnsinoMedio = escolaEnsinoMedio;
        this.setRendaBasica(getRendaBasica() * 1.5F);
    }

    public String getEscolaEnsinoMedio() {
        return escolaEnsinoMedio;
    }
}
