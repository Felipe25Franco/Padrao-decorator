import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class LancheTest {

    @Test
    void deveRetornarPrecoLancheSimples() {
        Lanche lanche = new LancheSimples(10.0f);
        assertEquals(10.0f, lanche.getPreco(), 0.01f);
    }

    @Test
    void deveRetornarPrecoLancheComQueijoExtra() {
        Lanche lanche = new QueijoExtra(new LancheSimples(10.0f));
        assertEquals(12.5f, lanche.getPreco(), 0.01f);
    }

    @Test
    void deveRetornarPrecoLancheComBacon() {
        Lanche lanche = new Bacon(new LancheSimples(10.0f));
        assertEquals(13.0f, lanche.getPreco(), 0.01f);
    }

    @Test
    void deveRetornarPrecoLancheComBatata() {
        Lanche lanche = new Batata(new LancheSimples(10.0f));
        assertEquals(14.0f, lanche.getPreco(), 0.01f);
    }

    @Test
    void deveRetornarPrecoLancheComQueijoEBacon() {
        Lanche lanche = new Bacon(new QueijoExtra(new LancheSimples(10.0f)));
        assertEquals(15.5f, lanche.getPreco(), 0.01f);
    }

    @Test
    void deveRetornarPrecoLancheComTodosAdicionais() {
        Lanche lanche = new Batata(new Bacon(new QueijoExtra(new LancheSimples(10.0f))));
        assertEquals(19.5f, lanche.getPreco(), 0.01f);
    }

    @Test
    void deveRetornarDescricaoLancheSimples() {
        Lanche lanche = new LancheSimples(10.0f);
        assertEquals("Lanche", lanche.getDescricao());
    }

    @Test
    void deveRetornarDescricaoLancheComQueijoExtra() {
        Lanche lanche = new QueijoExtra(new LancheSimples(10.0f));
        assertEquals("Lanche + Queijo Extra", lanche.getDescricao());
    }

    @Test
    void deveRetornarDescricaoLancheComBaconEBatata() {
        Lanche lanche = new Batata(new Bacon(new LancheSimples(10.0f)));
        assertEquals("Lanche + Bacon + Batata", lanche.getDescricao());
    }

    @Test
    void deveRetornarDescricaoLancheComTodosAdicionais() {
        Lanche lanche = new Batata(new Bacon(new QueijoExtra(new LancheSimples(10.0f))));
        assertEquals("Lanche + Queijo Extra + Bacon + Batata", lanche.getDescricao());
    }
}
