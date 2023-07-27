package heranca_polimorfismo;

public class Empresa {
    private Funcionario[] funcionarios;
    
    public Empresa(Funcionario funcionarios[]) {
        this.funcionarios = funcionarios;
    }

    public Funcionario[] getFuncionarios() {
        return funcionarios;
    }

    public float getCustosDaEmpresa() {
        float custoTotal = 0F;
        for (Funcionario funcionario : funcionarios) {
            custoTotal += funcionario.getSalarioTotal();
        }
        return custoTotal;
    }

    public String getFuncionariosInfoString() {
        String info = new String();
        for (Funcionario funcionario : funcionarios) {
            info += funcionario.toString()+"\n";
        }
        return info;
    }
}
