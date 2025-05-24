public class Bacon extends LancheDecorator {
    public Bacon(Lanche lanche) {
        super(lanche);
    }

    public float getPrecoAdicional() {
        return 3.00f;
    }

    public String getNomeAdicional() {
        return "Bacon";
    }
}
