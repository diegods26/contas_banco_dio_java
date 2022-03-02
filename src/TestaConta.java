public class TestaConta {

    public static void main(String[] args) {

        Cliente cl = new Cliente();
        cl.setNome("Diego");


        Conta cc = new ContaCorrente(cl);
        cc.deposita(100);

        Conta cp = new ContaPoupanca(cl);
        cc.transfere(50,cp);

       cc.imprimirExtrato();
       cp.imprimirExtrato();
    }
}
