import java.util.ArrayList;
import java.util.List;

public class RegistroBiblioteca {

    private static RegistroBiblioteca instancia;
    private List<String> livrosRegistrados;
    private RegistroBiblioteca() {
        this.livrosRegistrados = new ArrayList<>();
        System.out.println("Catálogo oficial criado pela primeira vez!");
    }

    public static RegistroBiblioteca getInstancia() {
        if (instancia == null) {
            instancia = new RegistroBiblioteca();
        }
        return instancia;
    }

    public void registrarLivro(String nomeLivro) {
        this.livrosRegistrados.add(nomeLivro);
        System.out.println("Livro '" + nomeLivro + "' registrado com sucesso!");
    }

    public void mostrarAcervo() {
        System.out.println("Acervo atual: " + this.livrosRegistrados);
    }
}