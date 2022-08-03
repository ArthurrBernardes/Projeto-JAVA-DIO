public class Main {

    public static void main(String[] args) {
        Cliente arthur= new Cliente();
        arthur.setNome("Arthur");

        Conta cc = new ContaCorrente(arthur);
        Conta poupanca = new ContaPoupanca(arthur);

        cc.depositar(200);
        cc.transferir(200, poupanca);

        cc.imprimirExtrato();
        poupanca.imprimirExtrato();
    }

}