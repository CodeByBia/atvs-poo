import java.util.ArrayList;
import java.util.List;

public class Banco {
    private List<Conta> contas;

    public Banco() {
        this.contas = new ArrayList<>();
    }

    public void adicionarConta(Conta conta) {
        contas.add(conta);
    }

    public void gerarRelatorio() {
        double totalCorrente = 0;
        double totalPoupanca = 0;
        double totalSalario = 0;

        System.out.println("=== Relatório de Contas ===");

        for (Conta conta : contas) {
            String tipoConta = conta.getClass().getSimpleName();
            System.out.println("- Titular: " + conta.getTitular() + " | Tipo: " + tipoConta + " | Saldo: R$" + conta.getSaldo());

            if (conta instanceof ContaCorrente) {
                totalCorrente += conta.getSaldo();
            } else if (conta instanceof ContaPoupanca) {
                totalPoupanca += conta.getSaldo();
            } else if (conta instanceof ContaSalario) {
                totalSalario += conta.getSaldo();
            }
        }

        System.out.println("\n=== Saldo Total por Tipo ===");
        System.out.println("Conta Corrente: R$" + totalCorrente);
        System.out.println("Conta Poupança: R$" + totalPoupanca);
        System.out.println("Conta Salário: R$" + totalSalario);
    }
}
