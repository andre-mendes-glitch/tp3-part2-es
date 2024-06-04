package tests;

import org.junit.jupiter.api.*;
import classes.Cilindro;

public class CilindroTest {

    // Declaração das variáveis utilizadas nos testes
    private Cilindro cilindro;
    private double raio = 5.0;
    private double altura = 10.0;
    final double pi = 3.14;


    @BeforeEach
    public void setUp() {
        cilindro = new Cilindro(raio, altura);
    }

    @Test
    public void testGetRaio() {
        Assertions.assertEquals(raio, cilindro.getRaio());
    }

    @Test
    public void testSetRaio() {
        cilindro.setRaio(raio);
        Assertions.assertEquals(raio, cilindro.getRaio());
    }

    @Test
    public void testGetAltura() {
        Assertions.assertEquals(altura, cilindro.getAltura());
    }

    @Test
    public void testSetAltura() {
        cilindro.setAltura(altura);
        Assertions.assertEquals(altura, cilindro.getAltura());
    }

    @Test
    public void testGetPi() {
        Assertions.assertEquals(pi, cilindro.getPi());
    }

    @Test
    public void testToString() {
        String expectedString = "Cilindro{raio='5.0', altura='10.0', pi='3.14'}";
        Assertions.assertEquals(expectedString, cilindro.toString());
    }

    @Test
    public void testCalculateArea() {
        double expectedArea = 2 * pi * raio * (raio + altura);
        Assertions.assertEquals(expectedArea, cilindro.calcularArea());
    }

    @Test
    public void testCalculateVolume() {
        double expectedVolume = pi * raio * raio * altura;
        Assertions.assertEquals(expectedVolume, cilindro.calcularVolume());
    }

    @Test
    public void testClone() throws CloneNotSupportedException {
        Cilindro cilindroClone = (Cilindro) cilindro.clone();

        Assertions.assertEquals(cilindro.getRaio(), cilindroClone.getRaio());
        Assertions.assertEquals(cilindro.getAltura(), cilindroClone.getAltura());

        Assertions.assertNotSame(cilindro, cilindroClone);
    }

}