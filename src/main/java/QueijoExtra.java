public class QueijoExtra extends LancheDecorator {
    public QueijoExtra(Lanche lanche) {
        super(lanche);
    }

    public float getPrecoAdicional() {
        return 2.50f;
    }

    public String getNomeAdicional() {
        return "Queijo Extra";
    }
}
