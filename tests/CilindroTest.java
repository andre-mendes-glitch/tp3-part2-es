package tests;
import org.junit.jupiter.api.*;
import classes.Cilindro;

public class CilindroTest {

    // Declaração das variáveis utilizadas nos testes
    private Cilindro cilindro;
    private double raio;
    private double altura;
    final double pi = 3.1416;

    @BeforeEach
    public void setUp() {
        cilindro = new Cilindro(5, 10);
    }

}