public class App {
    public static void main(String[] args) throws Exception {
        try {
            Debito debito = new Debito();
            Cliente lucas = new Cliente("Lucas", debito);
            lucas.getDebito().setSaldo(1000);
            lucas.getDebito().pagar(100, 1);

            Credito credito = new Credito(5000);
            Cliente millena = new Cliente("Millena", credito);
            millena.getCredito().setSaldo(1500);
            millena.getCredito().pagar(200, 2);
            millena.getCredito().pagarFatura();

            Debito debito2 = new Debito();
            Credito credito2 = new Credito(1000);
            Cliente bruno = new Cliente("Bruno", debito2, credito2);
            bruno.getDebito().setSaldo(2000);
            bruno.getCredito().setSaldo(500);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
