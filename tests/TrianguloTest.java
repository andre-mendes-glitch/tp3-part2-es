package tests;

import org.junit.jupiter.api.*;
import classes.Triangulo;

public class TrianguloTest {

    // Declaração das variáveis utilizadas nos testes
    private Triangulo triangulo;
    private double base = 5.0;
    private double altura = 10.0;

    // Esta função é executada antes de cada teste.
    @BeforeEach
    public void setup() {
        triangulo = new Triangulo(base, altura);
    }

    @Test
    public void testGetBase() {
        Assertions.assertEquals(base, triangulo.getBase());
    }

    @Test
    public void testSetBase() {
        triangulo.setBase(base);
        Assertions.assertEquals(base, triangulo.getBase());
    }

    @Test
    public void testGetAltura() {
        Assertions.assertEquals(altura, triangulo.getAltura());
    }

    @Test
    public void testSetAltura() {
        triangulo.setAltura(altura);
        Assertions.assertEquals(altura, triangulo.getAltura());
    }

    @Test
    public void testToString() {
        String stringEsperada = "Triangulo{base='5.0', altura='10.0'}";
        Assertions.assertEquals(stringEsperada, triangulo.toString());
    }

    @Test
    public void testCalcularArea() {
        double areaEsperada = (base * altura) / 2;
        Assertions.assertEquals(areaEsperada, triangulo.calcularArea(), 0.001);
    }

    @Test
    public void testClone() throws CloneNotSupportedException {
        Triangulo trianguloClone = (Triangulo) triangulo.clone();

        Assertions.assertEquals(triangulo.getBase(), trianguloClone.getBase());
        Assertions.assertEquals(triangulo.getAltura(), trianguloClone.getAltura());
        
        Assertions.assertNotSame(triangulo, trianguloClone);
    }

}
