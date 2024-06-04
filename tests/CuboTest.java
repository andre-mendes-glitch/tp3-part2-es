package tests;

import org.junit.jupiter.api.*;
import classes.Cubo;

public class CuboTest {

    // Declaração das variáveis utilizadas nos testes
    private Cubo cubo;
    private double aresta = 5.0;

    // Esta função é executada antes de cada teste
    @BeforeEach
    public void setup() {
        cubo = new Cubo(aresta);
    }

    @Test
    public void testGetAresta() {
        Assertions.assertEquals(aresta, cubo.getAresta());
    }

    @Test
    public void testSetAresta() {
        cubo.setAresta(aresta);
        Assertions.assertEquals(aresta, cubo.getAresta());
    }

    @Test
    public void testToString() {
        String expectedString = "Cubo{aresta='5.0'}";
        Assertions.assertEquals(expectedString, cubo.toString());
    }

    @Test
    public void testCalcularArea() {
        double expectedArea = (aresta * aresta) * 6;
        Assertions.assertEquals(expectedArea, cubo.calcularArea());
    }

    @Test
    public void testCalcularVolume() {
        double expectedVolume = aresta * aresta * aresta;
        Assertions.assertEquals(expectedVolume, cubo.calcularVolume());
    }

    @Test
    public void testClone() throws CloneNotSupportedException {
        Cubo cuboClone = (Cubo) cubo.clone();

        Assertions.assertEquals(cubo.getAresta(), cuboClone.getAresta());

        Assertions.assertNotSame(cubo, cuboClone);
    }

}
