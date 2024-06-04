package tests;

import org.junit.jupiter.api.*;
import classes.Circulo;

public class CirculoTest {

    // Declaração das variáveis utilizadas nos testes
    private Circulo circulo;
    private double raio = 5.0;
    final double pi = 3.14;

    // Esta função é executada antes de cada teste
    @BeforeEach
    public void setUp() {
        circulo = new Circulo(raio);
    }

    @Test
    public void testGetRaio() {
        Assertions.assertEquals(raio, circulo.getRaio());
    }

    @Test
    public void testSetRaio() {
        circulo.setRaio(raio);
        Assertions.assertEquals(raio, circulo.getRaio());
    }

    @Test
    public void testGetPi() {
        Assertions.assertEquals(pi, circulo.getPi());
    }

    @Test
    public void testToString() {
        String expectedString = "Circulo{raio='5.0', pi='3.14'}";
        Assertions.assertEquals(expectedString, circulo.toString());
    }

    @Test
    public void testCalcularArea() {
        double expectedArea = pi * (raio * raio);
        Assertions.assertEquals(expectedArea, circulo.calcularArea());
    }

    @Test
    public void testClone() throws CloneNotSupportedException {
        Circulo circuloClone = (Circulo) circulo.clone();

        Assertions.assertEquals(circulo.getRaio(), circuloClone.getRaio());

        Assertions.assertNotSame(circulo, circuloClone);
    }

}