public class Batata extends LancheDecorator {
    public Batata(Lanche lanche) {
        super(lanche);
    }

    public float getPrecoAdicional() {
        return 4.00f;
    }

    public String getNomeAdicional() {
        return "Batata";
    }
}
