public class Debito extends Cartao {

    @Override
    protected double pagar(double valor, int nrParcelas) {
        if (nrParcelas != 1) {
            throw new IllegalArgumentException("Número de parcela inválida!");
        }

        if (this.saldo < valor) {
            throw new ArithmeticException("Saldo insuficiente!");
        }

        this.saldo = this.saldo - valor;
        return this.saldo;
    }
}
