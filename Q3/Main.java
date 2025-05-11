public class Main {
    public static void main(String[] args) {
        Empresa minhaEmpresa = new Empresa();
        Gerente gerente1 = new Gerente("Bia", 6000.0, 2200.0);
        Desenvolvedor dev1 = new Desenvolvedor("Olivia", 7000.0, 1.7);
        Estagiario est1 = new Estagiario("Mario", 4000.0);
        Desenvolvedor dev2 = new Desenvolvedor("Joao", 5500.0, 4.4);
        Gerente gerente2 = new Gerente("Joana", 6000.0, 6000.0);

    
        minhaEmpresa.adicionarFuncionario(gerente1);
        minhaEmpresa.adicionarFuncionario(dev1);
        minhaEmpresa.adicionarFuncionario(est1);
        minhaEmpresa.adicionarFuncionario(dev2);
        minhaEmpresa.adicionarFuncionario(gerente2);

      
        minhaEmpresa.calcularFolhaDePagamento();
    }
}