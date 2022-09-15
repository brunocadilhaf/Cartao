public class Credito extends Cartao {
    private double limite;
    private double fatura;
    private double milhas;

    private final double valorMilha = 1.5;

    public Credito(double limite) {
        this.limite = limite;
        this.fatura = 0;
        this.milhas = 0;
    }

    @Override
    protected double pagar(double valor, int nrParcelas) {
        if (nrParcelas < 1 || nrParcelas > 12) {
            throw new IllegalArgumentException("Número de parcela inválida!");
        }

        this.limite = this.limite - valor;
        this.fatura = this.fatura + (valor / nrParcelas);
        this.milhas = this.milhas + (this.valorMilha * valor);
        return this.limite;
    }

    public double pagarFatura() {
        if (this.saldo < this.fatura) {
            throw new ArithmeticException("Saldo insuficiente!");
        }

        this.saldo = this.saldo - this.fatura;
        return this.saldo;
    }
}
