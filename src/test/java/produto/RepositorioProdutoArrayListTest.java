package produto;

import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;

public class RepositorioProdutoArrayListTest{

    private RepositorioProdutoArrayList repositorio;
    Produto testProduto;

    @Before
    public void setUp() {
        this.repositorio = new RepositorioProdutoArrayList(10);
        this.testProduto = new Produto(1, "Cerveja", 3.0, "Itaipava");
    }

    @Test
    public void testProcurar() {
        repositorio.inserir(testProduto);
        Produto produto = repositorio.procurar(1);
        assertTrue(produto instanceof Produto);
    }
}