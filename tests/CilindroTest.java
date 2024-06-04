package tests;
import org.junit.jupiter.api.*;
import classes.Cilindro;

public class CilindroTest 
{
    
    private Cilindro cilindro;
    final double pi = 3.14;
    final double raio = 6;
    final double altura = 5;

    /* Este método é executado antes de cada teste */
    @BeforeEach
    public void setUp() {
        cilindro = new Cilindro();
    }

}   