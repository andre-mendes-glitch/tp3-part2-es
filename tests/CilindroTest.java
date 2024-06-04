package tests;

import org.junit.jupiter.api.*;
import classes.Cilindro;

public class CilindroTest {

    // Declaração das variáveis utilizadas nos testes
    private Cilindro cilindro;
    private double raio = 5;
    private double altura = 10;
    final double pi = 3.1416;

    @BeforeEach
    public void setUp() {
        cilindro = new Cilindro(raio, altura);
    }

}