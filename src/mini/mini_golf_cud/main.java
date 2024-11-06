/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mini.mini_golf_cud;

/**
 *
 * @author dam2
 */
public class main {
    public static void main(String[] args) {
        System.out.println("Iniciando programa.");
        miniVistaFCA laVentana = new miniVistaFCA();
        laVentana.setVisible(true);
        
        miniModeloFCA modeloFCA = new miniModeloFCA();
        miniVistaFCA vistaFCA = new miniVistaFCA();
        miniControladorFCA controladorFCA = new miniControladorFCA(modeloFCA, vistaFCA);
    }
}
