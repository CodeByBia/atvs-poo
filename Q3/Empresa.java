import java.util.ArrayList;
import java.util.List;

public class Empresa {
    private List<Funcionario> funcionarios;

    public Empresa() {
        this.funcionarios = new ArrayList<>();
    }

    public void adicionarFuncionario(Funcionario funcionario) {
        this.funcionarios.add(funcionario);
    }

    public void calcularFolhaDePagamento() {
        double totalSalariosGerentes = 0;
        double totalSalariosDesenvolvedores = 0;
        double totalSalariosEstagiarios = 0;
        double totalFolhaPagamento = 0;

        System.out.println("--- Folha de Pagamento ---");

        for (Funcionario funcionario : funcionarios) {
            funcionario.exibirInformacoesFunc();
            double salario = funcionario.calcularSalario();
            totalFolhaPagamento += salario;

            if (funcionario instanceof Gerente) {
                totalSalariosGerentes += salario;
            } else if (funcionario instanceof Desenvolvedor) {
                totalSalariosDesenvolvedores += salario;
            } else if (funcionario instanceof Estagiario) {
                totalSalariosEstagiarios += salario;
            }
            System.out.println("*******************************");
        }

        System.out.println("\n--- Resumo ---");
        System.out.println(" Salários Gerentes: " + totalSalariosGerentes);
        System.out.println(" Salários Desenvolvedores: " + totalSalariosDesenvolvedores);
        System.out.println(" Salários Estagiarios: " + totalSalariosEstagiarios);
        System.out.println("\nFolha: " + totalFolhaPagamento);
    }
}