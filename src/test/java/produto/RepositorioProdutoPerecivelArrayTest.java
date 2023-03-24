package produto;

import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;


public class RepositorioProdutoPerecivelArrayTest {

    private RepositorioProdutoPerecivelArray repositorio;

    @Before
    public void setUp() {
        this.repositorio = new RepositorioProdutoPerecivelArray(10);
    }

    @Test
    public void testExiste() {
        repositorio.inserir(new ProdutoPerecivel(1, "Leite", 10, "Leite fresco", null));
        assertTrue(repositorio.existe(1));
    }

    @Test
    public void testInserir() {
        repositorio.inserir(new ProdutoPerecivel(1, "Leite", 10, "Leite fresco", null));
        assertTrue(repositorio.existe(1));
    }

    @Test
    public void testAtualizar() {
    }

    @Test
    public void testRemover() {
        repositorio.inserir(new ProdutoPerecivel(1, "Leite", 10, "Leite fresco", null));
        repositorio.remover(1);
        assertEquals(-1, repositorio.procurarIndice(1));
    }

    @Test
    public void testProcurar() {
        repositorio.inserir(new ProdutoPerecivel(1, "Leite", 10, "Leite fresco", null));
        ProdutoPerecivel retorno = repositorio.procurar(1);
        assertTrue(retorno instanceof ProdutoPerecivel);
    }

}