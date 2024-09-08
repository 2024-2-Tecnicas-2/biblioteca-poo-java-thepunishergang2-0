import com.mycompany.biblioteca.java.Publicacion;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class PublicacionTest {
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
        String valorEsperado = "Titulo: Mondongo\nAño publicacion: 2024";
        Publicacion miPublicacion = new Publicacion("Mondongo", 2024);
        String valorActual = miPublicacion.mostrarInfo();
        assertEquals(valorEsperado, valorActual);
    }

    @Test
    public void testMostrarInfoDos() {
        String valorEsperado = "Titulo: Locura\nAño publicacion: 2020";
        Publicacion miPublicacion = new Publicacion("Locura", 2020);
        String valorActual = miPublicacion.mostrarInfo();
        assertEquals(valorEsperado, valorActual);
    }
    
    
}
