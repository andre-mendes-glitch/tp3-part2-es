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

    /*
     * Este teste serve para verificar o que acontece quando o nome do objeto é definido corretamente.
     */
    @Test
    public void testCorrectNameObject() 
    {
        
        // Atribui o nome esperado a uma variável
        String nomeEsperado = "Cilindro";

        // Atribui o nome obtido a uma variável a partir do método getNome()
        String nomeObtido = cilindro.getNome();

        // Verifica se o nome obtido é igual ao nome esperado
        Assertions.assertEquals(nomeEsperado, nomeObtido);

    }
    
    /*
     * Este teste serve para verificar o que acontece quando o nome do objeto é definido incorretamente.
     */
    @Test
    public void testIncorrectNameObject() 
    {

        // Atribui o nome esperado a uma variável
        String nomeEsperado = "Cilindro";

        // Atribui um nome incorreto à variável nomeObtido
        String nomeObtido = "Esfera";

        // Verifica se o nome obtido é igual ao nome esperado
        Assertions.assertEquals(nomeEsperado, nomeObtido, "O nome do objeto tem que ser 'Cilindro'");

    }

}   