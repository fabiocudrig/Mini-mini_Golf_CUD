package modeloMiniGolf;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import vistaMiniGolf.vistaMiniNivel;
import vistaMiniGolf.vistaMiniPrincipal;

/**
 * Modelo principal para la lógica del programa.
 * Gestiona la carga de datos necesaria para la ejecución del juego.
 * 
 * @author Fabio Cudrig Alcocer
 */

public class modeloMiniModelito {

    vistaMiniPrincipal vistaPrincipalFCA = new vistaMiniPrincipal();    
    vistaMiniNivel vistaNivelFCA = new vistaMiniNivel(vistaPrincipalFCA, true);
    /**
     * Constructor de la clase modeloMiniModelito.
     * Inicializa los recursos necesarios para la lógica del juego.
     */
    
    public modeloMiniModelito(vistaMiniPrincipal vistaPrincipalFCA, vistaMiniNivel vistaNivelFCA) {
        this.vistaPrincipalFCA = vistaPrincipalFCA;
        this.vistaNivelFCA = vistaNivelFCA;
    }

    /**
     * Método que muestra la vista de carga del programa.
     * Simula la carga con una pausa de 2 segundos.
     */
    public void vistaCarga() {
        try {
            System.out.println("Iniciando miniMiniGolf FCA.");
            Thread.sleep(2000); 
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("miniMiniGolf FCA iniciado.");
    }
    
    /**
     * Método para generar el archivo de configuración.
     * 
     * @param vistaNivelFCA Objeto de la vista para obtener los valores de configuración.
     */
    
    public void generarArchivoConfiguracion(vistaMiniNivel vistaNivelFCA) {
        String nombre = vistaNivelFCA.getTxtNombreMG();
        String dificultad = "Medio";

        if (vistaNivelFCA.getBtnFacilMG().isSelected()) {
            dificultad = "Facil";
        } else if (vistaNivelFCA.getBtnDificilMG().isSelected()) {
            dificultad = "Medio";
        } else if (vistaNivelFCA.getBtnMedioMG().isSelected()) {
            dificultad = "Dificil";
        }

        try (BufferedWriter writer = new BufferedWriter(new FileWriter("conf.txt"))) {
            writer.write("Nombre: " + nombre);
            writer.newLine();
            writer.write("Dificultad: " + dificultad);
            writer.newLine();
            System.out.println("Archivo de configuración generado.");
        } catch (IOException e) {
            System.out.println("Error al generar el archivo de configuración.");
        }
    }
    
    /**
     * Método para cargar la configuración desde el archivo "conf.txt".
     * 
     * @param vistaNivel Objeto de la vista donde se mostrará la configuración cargada.
     */
    
    public void cargarConfiguracion(vistaMiniNivel vistaNivel) {
        String nombre = "";
        String dificultad = "";

        try (BufferedReader reader = new BufferedReader(new FileReader("conf.txt"))) {
            String linea;
            while ((linea = reader.readLine()) != null) {
                if (linea.startsWith("Nombre: ")) {
                    nombre = linea.substring(8).trim();
                } else if (linea.startsWith("Dificultad: ")) {
                    dificultad = linea.substring(12).trim();
                }
            }

            vistaNivel.setNombreMG(nombre);

            if (dificultad.equalsIgnoreCase("Facil")) {
                vistaNivel.setDificultadFacil();
            } else if (dificultad.equalsIgnoreCase("Medio")) {
                vistaNivel.setDificultadMedio();
            } else if (dificultad.equalsIgnoreCase("Dificil")) {
                vistaNivel.setDificultadDificil();
            }

            System.out.println("Archivo de configuracion cargado");
        } catch (IOException e) {
            System.err.println("Error al cargar el archivo de configuración");
        }
    }
}
