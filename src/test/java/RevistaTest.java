import com.mycompany.biblioteca.java.Revista;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class RevistaTest {
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
        String valorEsperado = "Titulo: Mondongo\nAño publicacion: 2024\nNombre Revista: Punisher Magazine\nNumero Revista : 10";
        Revista miRevista = new Revista("Mondongo", 2024,10,"Punisher Magazine");
        String valorActual = miRevista.mostrarInfo();
        assertEquals(valorEsperado, valorActual);
    }

    @Test
    public void testMostrarInfoDos() {
        String valorEsperado = "Titulo: Mondongo\nAño publicacion: 2021\nNombre Revista: Rochinok Fest\nNumero Revista : 11";
        Revista miRevista = new Revista("Mondongo", 2021,11,"Rochinok Fest");
        String valorActual = miRevista.mostrarInfo();
        assertEquals(valorEsperado, valorActual);
    }
    
    
    
}
