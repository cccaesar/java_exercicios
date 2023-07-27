package heranca_polimorfismo;

public class FuncionarioComEnsinoBasico extends Funcionario {
    private String escolaEnsinoBasico;
    

    public FuncionarioComEnsinoBasico(String nome, String codigoFuncional, Comissao comissao, String escolaEnsinoBasico) {
        super(nome, codigoFuncional, comissao);
        this.escolaEnsinoBasico = escolaEnsinoBasico;
        this.setRendaBasica(getRendaBasica() * 1.1F);
    }

    public String getEscolaEnsinoBasico() {
        return escolaEnsinoBasico;
    }
}
