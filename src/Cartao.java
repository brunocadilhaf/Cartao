public class Cartao {
    protected double saldo;

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public Cartao() {
        this.saldo = 0;
    }

    protected double pagar(double valor, int nrParcelas) {
        return 0;
    }
}
