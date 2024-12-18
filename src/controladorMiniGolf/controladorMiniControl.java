package controladorMiniGolf;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import modeloMiniGolf.modeloMiniModelito;
import vistaMiniGolf.vistaMiniCarga;
import vistaMiniGolf.vistaMiniNivel;
import vistaMiniGolf.vistaMiniPrincipal;

/**
 * Controlador principal del programa.
 * Gestiona la interacción entre el modelo y las vistas.
 * 
 * @author Fabio Cudrig Alcocer
 */

public class controladorMiniControl implements ActionListener {

    private modeloMiniModelito modeloFCA;        
    private vistaMiniPrincipal vistaPrincipalFCA; 
    private vistaMiniCarga vistaCargaFCA;    
    private vistaMiniNivel vistaNivelFCA;

    /**
     * Constructor de la clase controladorMiniControl.
     * Inicia el modelo, las vistas y los escuchadores de eventos.
     * 
     * @param modeloFCA Instancia del modelo que gestiona la lógica.
     * @param vistaPrincipalFCA Instancia de la vista principal.
     * @param vistaCargaFCA Instancia de la vista de carga.
     * @param vistaNivelFCA Instancia de la vista de configuración de nivel.
     */
    
    public controladorMiniControl(modeloMiniModelito modeloFCA, vistaMiniPrincipal vistaPrincipalFCA, vistaMiniCarga vistaCargaFCA, vistaMiniNivel vistaNivelFCA) {
        this.modeloFCA = modeloFCA;
        this.vistaPrincipalFCA = vistaPrincipalFCA;
        this.vistaCargaFCA = vistaCargaFCA;
        this.vistaNivelFCA = vistaNivelFCA;
        iniciarEscuchadores();
    }

    /**
     * Método para inicializar los escuchadores de los botones en la vista principal.
     */
    
    private void iniciarEscuchadores() {
        vistaPrincipalFCA.listenerBtnNPartidaMG(this);
        vistaPrincipalFCA.listenerBtnContinuarMG(this);
        vistaPrincipalFCA.listenerBtnNivelMG(this);
        vistaPrincipalFCA.listenerBtnSalirMG(this);
        vistaNivelFCA.listenerBtnGuardarNivelMG(this);
    }

    /**
     * Inicia el juego programa mostrando la vista de carga y luego la vista principal.
     */
    
    public void iniciarMiniGolf() {
        modeloFCA.cargarConfiguracion(vistaNivelFCA);
        if (vistaCargaFCA != null) {
            vistaCargaFCA.setVisible(true);
            modeloFCA.vistaCarga();
            vistaCargaFCA.setVisible(false);
        }
        vistaPrincipalFCA.setVisible(true);
    }

    /**
     * Maneja las acciones de los botones de la vista principal.
     * 
     * @param e Evento de acción que informa el botón presionado.
     */
    
    @Override
    public void actionPerformed(ActionEvent e) {
        String accion = e.getActionCommand();

        switch (accion) {
            case "NUEVA PARTIDA":
                System.out.println("Boton nueva partida");
                break;
            case "CONTINUAR":
                System.out.println("Boton continuar");
                break;
            case "NIVEL":
                System.out.println("Boton nivel");
                iniciarNivel();
                break;
            case "SALIR":
                System.out.println("Boton salir");
                break;
            case "GUARDAR":
                System.out.println("Boton guardar");
                modeloFCA.generarArchivoConfiguracion(vistaNivelFCA);
                break;
        }
    }

    /**
     * Inicia el dialogo de configuracion del nivel.
     */
    
    private void iniciarNivel() {
        vistaNivelFCA.setVisible(true);
    }
    
    
}


