public class Main {
    public static void main(String[] args) {
        Banco banco = new Banco();


        ContaCorrente cc = new ContaCorrente("Lucas", 1000);
        ContaPoupanca cp = new ContaPoupanca("Fernanda", 1500);
        ContaSalario cs = new ContaSalario("Marcos", 800, 2);


        cc.depositar(200);
        cc.sacar(500);

        cp.adicionarRendimento(5);
        cp.sacar(200);

        cs.sacar(100);
        cs.sacar(100);
        cs.sacar(100); 

       banco.adicionarConta(cc);
        banco.adicionarConta(cp);
        banco.adicionarConta(cs);

  
        banco.gerarRelatorio();
    }
}
