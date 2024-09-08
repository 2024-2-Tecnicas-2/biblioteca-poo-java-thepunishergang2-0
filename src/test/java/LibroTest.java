
import com.mycompany.biblioteca.java.Libro;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class LibroTest {
    // TODO Adiciona tus pruebas unitarias aquí.
    // Los métodos deben estar anotados con la anotación @Test. Por ejemplo:
    //
//    @Test
//    public void testMultiplicarPositivos() {
//        int valorEsperado = 15;
//        CuentaBancaria miCuenta = new CuentaBancaria();
//        int valorActual = miCuenta.multiplicar(3, 5);
//        assertEquals(valorEsperado, valorActual);
//    }

    @Test
    public void testMostrarInfo() {
        String valorEsperado = "Titulo: Mondongo\nAño publicacion: 2024\nautor: Rochinki\nNumero de paginas: 500";
        Libro miLibro = new Libro("Mondongo", 2024, "Rochinki", 500);
        String valorActual = miLibro.mostrarInfo();
        assertEquals(valorEsperado, valorActual);
    }

    @Test
    public void testMostrarInfoDos() {
        String valorEsperado = "Titulo: Changua\nAño publicacion: 2022\nautor: Punisher\nNumero de paginas: 250";
        Libro miLibro = new Libro("Changua", 2022, "Punisher", 250);
        String valorActual = miLibro.mostrarInfo();
        assertEquals(valorEsperado, valorActual);
    }
}
