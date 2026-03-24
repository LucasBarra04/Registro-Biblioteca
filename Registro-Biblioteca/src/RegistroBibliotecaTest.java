import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class RegistroBibliotecaTest {

    @Test
    public void deveTestarGarantirInstanciaUnica() {
        RegistroBiblioteca instancia1 = RegistroBiblioteca.getInstancia();
        RegistroBiblioteca instancia2 = RegistroBiblioteca.getInstancia();
        assertSame(instancia1, instancia2, "As instâncias não são as mesmas! O Singleton falhou.");
    }

    @Test
    public void deveTestarCompartilhamentoDeDados() {
        RegistroBiblioteca bibliotecarioA = RegistroBiblioteca.getInstancia();
        RegistroBiblioteca bibliotecarioB = RegistroBiblioteca.getInstancia();

        bibliotecarioA.registrarLivro("O Processo");

        assertTrue(bibliotecarioB.getLivrosRegistrados().contains("O Processo"),
                "O estado não está sendo compartilhado corretamente.");
    }
}