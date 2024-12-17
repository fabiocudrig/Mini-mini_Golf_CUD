package miniGolf;

import controladorMiniGolf.controladorMiniControl;
import modeloMiniGolf.modeloMiniModelito;
import vistaMiniGolf.vistaMiniCarga;
import vistaMiniGolf.vistaMiniNivel;
import vistaMiniGolf.vistaMiniPrincipal;

/**
 * Clase principal que inicia el programa.
 * Contiene el método principal para la ejecución del programa.
 * 
 * @author Fabio Cudrig Alcocer
 */

public class main {
    
    /**
     * Método principal que inicia la aplicación.
     * Se crean el modelo, las vistas y el controlador.
     */
    
    public static void main(String[] args) {

        vistaMiniCarga vistaCargaFCA = new vistaMiniCarga();
        vistaMiniPrincipal vistaPrincipalFCA = new vistaMiniPrincipal();
        vistaMiniNivel vistaNivelFCA = new vistaMiniNivel(vistaPrincipalFCA, true);
        modeloMiniModelito modeloFCA = new modeloMiniModelito(vistaPrincipalFCA, vistaNivelFCA);
        controladorMiniControl controladorFCA = new controladorMiniControl(modeloFCA, vistaPrincipalFCA, vistaCargaFCA, vistaNivelFCA);
        
        controladorFCA.iniciarMiniGolf();
    }
}
