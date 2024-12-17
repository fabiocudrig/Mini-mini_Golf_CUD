package vistaMiniGolf;

/**
 * Vista para la pantalla de carga del programa.
 * Muestra un mensaje de "Iniciando miniMiniGolf FCA".
 * 
 * @author Fabio Cudrig Alcocer
 */

public class vistaMiniCarga extends javax.swing.JFrame {

    /**
     * Constructor de la clase vistaMiniCarga.
     * Inicializa los componentes de la interfaz gráfica y centra la ventana.
     */
    
    public vistaMiniCarga() {
        initComponents();
        setLocationRelativeTo(null);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        iniciandoLabel = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Iniciando...");
        setLocation(new java.awt.Point(0, 0));
        setPreferredSize(new java.awt.Dimension(400, 200));
        setResizable(false);
        setSize(new java.awt.Dimension(400, 200));

        iniciandoLabel.setFont(new java.awt.Font("Segoe UI Black", 1, 24)); // NOI18N
        iniciandoLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        iniciandoLabel.setText("Iniciando miniMiniGolf FCA");
        getContentPane().add(iniciandoLabel, java.awt.BorderLayout.CENTER);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel iniciandoLabel;
    // End of variables declaration//GEN-END:variables
}
