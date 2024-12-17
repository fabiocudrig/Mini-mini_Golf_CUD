package vistaMiniGolf;

import java.awt.event.ActionListener;

/**
 * Clase principal de la vista para la interfaz gráfica del programa.
 * Contiene los componentes de la interfaz.
 * 
 * @author Fabio Cudrig Alcocer
 */

public class vistaMiniPrincipal extends javax.swing.JFrame {

    /**
     * Constructor de la clase vistaMiniPrincipal.
     * Inicializa los componentes de la interfaz gráfica y centra la ventana.
     */
    
    public vistaMiniPrincipal() {
        initComponents();
        setLocationRelativeTo(null);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panelLogoMG = new javax.swing.JPanel();
        labelLogoMG = new javax.swing.JLabel();
        panelBotonesMG = new javax.swing.JPanel();
        btnNPartidaMG = new javax.swing.JButton();
        btnContinuarMG = new javax.swing.JButton();
        btnNivelMG = new javax.swing.JButton();
        btnSalirMG = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("miniMiniGolf FCA");
        setBackground(new java.awt.Color(0, 153, 0));
        setPreferredSize(new java.awt.Dimension(1000, 800));
        setSize(new java.awt.Dimension(1000, 800));

        panelLogoMG.setBackground(new java.awt.Color(0, 255, 0));

        labelLogoMG.setFont(new java.awt.Font("Segoe UI", 0, 48)); // NOI18N
        labelLogoMG.setIcon(new javax.swing.ImageIcon(getClass().getResource("/labelLogo.png"))); // NOI18N
        labelLogoMG.setPreferredSize(new java.awt.Dimension(900, 542));
        panelLogoMG.add(labelLogoMG);

        getContentPane().add(panelLogoMG, java.awt.BorderLayout.PAGE_START);

        panelBotonesMG.setBackground(new java.awt.Color(0, 255, 0));

        btnNPartidaMG.setBackground(new java.awt.Color(255, 153, 0));
        btnNPartidaMG.setFont(new java.awt.Font("Segoe UI Black", 1, 18)); // NOI18N
        btnNPartidaMG.setForeground(new java.awt.Color(255, 255, 255));
        btnNPartidaMG.setText("NUEVA PARTIDA");
        btnNPartidaMG.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255), 3));
        btnNPartidaMG.setHideActionText(true);
        btnNPartidaMG.setPreferredSize(new java.awt.Dimension(190, 50));
        btnNPartidaMG.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNPartidaMGActionPerformed(evt);
            }
        });
        panelBotonesMG.add(btnNPartidaMG);

        btnContinuarMG.setBackground(new java.awt.Color(255, 153, 0));
        btnContinuarMG.setFont(new java.awt.Font("Segoe UI Black", 1, 18)); // NOI18N
        btnContinuarMG.setForeground(new java.awt.Color(255, 255, 255));
        btnContinuarMG.setText("CONTINUAR");
        btnContinuarMG.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255), 3));
        btnContinuarMG.setHideActionText(true);
        btnContinuarMG.setPreferredSize(new java.awt.Dimension(190, 50));
        panelBotonesMG.add(btnContinuarMG);

        btnNivelMG.setBackground(new java.awt.Color(255, 153, 0));
        btnNivelMG.setFont(new java.awt.Font("Segoe UI Black", 1, 18)); // NOI18N
        btnNivelMG.setForeground(new java.awt.Color(255, 255, 255));
        btnNivelMG.setText("NIVEL");
        btnNivelMG.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255), 3));
        btnNivelMG.setHideActionText(true);
        btnNivelMG.setPreferredSize(new java.awt.Dimension(190, 50));
        panelBotonesMG.add(btnNivelMG);

        btnSalirMG.setBackground(new java.awt.Color(255, 153, 0));
        btnSalirMG.setFont(new java.awt.Font("Segoe UI Black", 1, 18)); // NOI18N
        btnSalirMG.setForeground(new java.awt.Color(255, 255, 255));
        btnSalirMG.setText("SALIR");
        btnSalirMG.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255), 3));
        btnSalirMG.setHideActionText(true);
        btnSalirMG.setPreferredSize(new java.awt.Dimension(190, 50));
        panelBotonesMG.add(btnSalirMG);

        getContentPane().add(panelBotonesMG, java.awt.BorderLayout.CENTER);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnNPartidaMGActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNPartidaMGActionPerformed

    }//GEN-LAST:event_btnNPartidaMGActionPerformed
 
    /**
     * Método que añade un ActionListener al botón de nueva partida.
     * 
     * @param l ActionListener que gestiona las acciones del botón.
     */
    public void listenerBtnNPartidaMG(ActionListener l){
        btnNPartidaMG.addActionListener(l);
    }
    
    /**
     * Método que añade un ActionListener al botón de continuar partida.
     * 
     * @param l ActionListener que gestiona las acciones del botón.
     */
    public void listenerBtnContinuarMG(ActionListener l){
        btnContinuarMG.addActionListener(l);
    }
    
    /**
     * Método que añade un ActionListener al botón de selección de nivel.
     * 
     * @param l ActionListener que gestiona las acciones del botón.
     */
    public void listenerBtnNivelMG(ActionListener l){
        btnNivelMG.addActionListener(l);
    }
    
    /**
     * Método que añade un ActionListener al botón de salir del programa.
     * 
     * @param l ActionListener que gestiona las acciones del botón.
     */
    public void listenerBtnSalirMG(ActionListener l){
        btnSalirMG.addActionListener(l);
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnContinuarMG;
    private javax.swing.JButton btnNPartidaMG;
    private javax.swing.JButton btnNivelMG;
    private javax.swing.JButton btnSalirMG;
    private javax.swing.JLabel labelLogoMG;
    private javax.swing.JPanel panelBotonesMG;
    private javax.swing.JPanel panelLogoMG;
    // End of variables declaration//GEN-END:variables
}
