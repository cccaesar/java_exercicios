package heranca_polimorfismo;

public class Respostas {
    public static void main(String[] args) {
        //Questão 2
        Animal cavalo = new Cavalo();
        Animal cao = new Cachorro();
        Animal preguica = new Preguica();
        //Questão 3
        Veterinario vet = new Veterinario("Pedro", "PD14");
        vet.examinar(cavalo);
        vet.examinar(cao);
        vet.examinar(preguica);
        //Questão 4
        Zoologico zoo = new Zoologico();
        zoo.pushAnimal(cavalo);
        zoo.pushAnimal(cao);
        zoo.pushAnimal(preguica);
        zoo.pushAnimal(new Animal());
        zoo.pushAnimal(new Cavalo());
        zoo.pushAnimal(new Preguica());
        zoo.pushAnimal(new Animal());
        zoo.pushAnimal(new Preguica());
        zoo.pushAnimal(new Preguica());
        zoo.pushAnimal(new Preguica());
        for (Animal animal : zoo.getJaulas()) {
            animal.emitirSom();
            if(animal instanceof Cachorro) {
                ((Cachorro) animal).correr();
            } else if (animal instanceof Cavalo) {
                ((Cavalo) animal).correr();
            } else if(animal instanceof Preguica) {
                ((Preguica) animal).subirEmArvores();
            }
        }
        //Questão 7
        /*
        Funcionario[] funcionarios = { 
            new FuncionarioComEnsinoBasico("Paulo", "1", "COMUJA"), 
            new FuncionarioComEnsinoBasico("Paula", "2", "COMUJA"), 
            new FuncionarioComEnsinoBasico("Adriano", "3", "COMUJA"),
            new FuncionarioComEnsinoBasico("Adriana", "4", "COMUJA"),
            new FuncionarioComEnsinoMedio("Maria", "5", "COMUJA", "MODELO"),
            new FuncionarioComEnsinoMedio("Mariana", "6", "COMUJA", "MODELO"),
            new FuncionarioComEnsinoMedio("Marina", "7", "COMUJA", "MODELO"),
            new FuncionarioComEnsinoMedio("Ana Maria", "8", "COMUJA", "MODELO"),
            new FuncionarioComGraduacao("Julia", "9", "MODELO", "MODELO", "UEFS"),
            new FuncionarioComGraduacao("Sabrina", "10", "MODELO", "MODELO", "UFBA")
        };
        Empresa empresa = new Empresa(funcionarios);
        System.out.println("Custo total da empresa: "+empresa.getCustosDaEmpresa());
        */
        //Questão 10
        Funcionario[] funcionarios = { 
            new FuncionarioComEnsinoBasico("Paulo", "1", new Vendedor(), "COMUJA"), 
            new FuncionarioComEnsinoBasico("Paula", "2", new Vendedor(), "COMUJA"), 
            new FuncionarioComEnsinoBasico("Adriano", "3", new Vendedor(), "COMUJA"),
            new FuncionarioComEnsinoBasico("Adriana", "4", new Vendedor(), "COMUJA"),
            new FuncionarioComEnsinoMedio("Maria", "5", new Vendedor(), "COMUJA", "MODELO"),
            new FuncionarioComEnsinoMedio("Mariana", "6", new Vendedor(), "COMUJA", "MODELO"),
            new FuncionarioComEnsinoMedio("Marina", "7", new Vendedor(), "COMUJA", "MODELO"),
            new FuncionarioComEnsinoMedio("Ana Maria", "8", new Supervisor(), "COMUJA", "MODELO"),
            new FuncionarioComGraduacao("Julia", "9", new Supervisor(), "MODELO", "MODELO", "UEFS"),
            new FuncionarioComGraduacao("Sabrina", "10", new Gerente(), "MODELO", "MODELO", "UFBA")
        };
        Empresa empresa = new Empresa(funcionarios);
        System.out.println("Custo total da empresa: "+empresa.getCustosDaEmpresa());
        System.out.println(empresa.getFuncionariosInfoString());
    }
}
