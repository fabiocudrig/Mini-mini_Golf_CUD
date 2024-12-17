package vistaMiniGolf;

import java.awt.event.ActionListener;

/**
 * Vista para la configuración de los niveles del programa.
 * Permite seleccionar la dificultad y el nombre del jugador.
 * 
 * @author Fabio Cudrig Alcocer
 */
public class vistaMiniNivel extends javax.swing.JDialog {
    
    /**
     * Constructor de la clase vistaMiniNivel.
     * Inicializa los componentes de la interfaz gráfica y centra la ventana.
     * 
     * @param parent Ventana principal que lanza el diálogo.
     * @param modal Indica si el diálogo debe ser modal.
     */
    
    public vistaMiniNivel(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        setLocationRelativeTo(null);
    }

    /**
     * Método que añade un ActionListener al botón de guardar nivel.
     * 
     * @param l ActionListener que gestiona las acciones del botón.
     */
    
    public void listenerBtnGuardarNivelMG(ActionListener l) {
        btnGuardarNivelMG.addActionListener(l);
    }

    public String getTxtNombreMG() {
        return txtNombreMG.getText();
    }

    public javax.swing.JRadioButton getBtnFacilMG() {
        return btnFacilMG;
    }

    public javax.swing.JRadioButton getBtnMedioMG() {
        return btnMedioMG;
    }

    public javax.swing.JRadioButton getBtnDificilMG() {
        return btnDificilMG;
    }

    public void setNombreMG(String nombre) {
    txtNombreMG.setText(nombre);
    }

    public void setDificultadFacil() {
        btnFacilMG.setSelected(true);
    }

    public void setDificultadMedio() {
        btnMedioMG.setSelected(true);
    }

    public void setDificultadDificil() {
        btnDificilMG.setSelected(true);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {
        java.awt.GridBagConstraints gridBagConstraints;

        btnGroupDificultadMG = new javax.swing.ButtonGroup();
        jPanel2 = new javax.swing.JPanel();
        labelNivelMG = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        labelNombreMG = new javax.swing.JLabel();
        txtNombreMG = new javax.swing.JTextField();
        btnGuardarNivelMG = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        btnFacilMG = new javax.swing.JRadioButton();
        btnMedioMG = new javax.swing.JRadioButton();
        btnDificilMG = new javax.swing.JRadioButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setResizable(false);
        setSize(new java.awt.Dimension(300, 200));

        jPanel2.setBackground(new java.awt.Color(255, 153, 0));

        labelNivelMG.setBackground(new java.awt.Color(255, 153, 0));
        labelNivelMG.setFont(new java.awt.Font("Segoe UI Black", 1, 24)); // NOI18N
        labelNivelMG.setForeground(new java.awt.Color(255, 255, 255));
        labelNivelMG.setText("CONFIGURA LOS NIVELES");
        jPanel2.add(labelNivelMG);

        getContentPane().add(jPanel2, java.awt.BorderLayout.PAGE_START);

        jPanel4.setBackground(new java.awt.Color(51, 255, 0));

        labelNombreMG.setFont(new java.awt.Font("Segoe UI Black", 1, 18)); // NOI18N
        labelNombreMG.setText("NOMBRE DEL JUGADOR:");

        txtNombreMG.setBackground(new java.awt.Color(255, 255, 255));
        txtNombreMG.setPreferredSize(new java.awt.Dimension(152, 22));

        btnGuardarNivelMG.setBackground(new java.awt.Color(255, 153, 0));
        btnGuardarNivelMG.setFont(new java.awt.Font("Segoe UI Black", 1, 18)); // NOI18N
        btnGuardarNivelMG.setForeground(new java.awt.Color(255, 255, 255));
        btnGuardarNivelMG.setText("GUARDAR");

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(11, 11, 11)
                .addComponent(labelNombreMG)
                .addGap(5, 5, 5)
                .addComponent(txtNombreMG, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(142, 142, 142)
                .addComponent(btnGuardarNivelMG))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(labelNombreMG)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(2, 2, 2)
                        .addComponent(txtNombreMG, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(5, 5, 5)
                .addComponent(btnGuardarNivelMG))
        );

        getContentPane().add(jPanel4, java.awt.BorderLayout.PAGE_END);

        jPanel1.setBackground(new java.awt.Color(0, 255, 0));
        jPanel1.setLayout(new java.awt.GridBagLayout());

        jPanel3.setBackground(new java.awt.Color(0, 255, 0));

        btnFacilMG.setBackground(new java.awt.Color(255, 153, 0));
        btnGroupDificultadMG.add(btnFacilMG);
        btnFacilMG.setFont(new java.awt.Font("Segoe UI Black", 1, 14)); // NOI18N
        btnFacilMG.setForeground(new java.awt.Color(255, 255, 255));
        btnFacilMG.setText("FACIL");
        jPanel3.add(btnFacilMG);

        btnMedioMG.setBackground(new java.awt.Color(255, 153, 0));
        btnGroupDificultadMG.add(btnMedioMG);
        btnMedioMG.setFont(new java.awt.Font("Segoe UI Black", 1, 14)); // NOI18N
        btnMedioMG.setForeground(new java.awt.Color(255, 255, 255));
        btnMedioMG.setText("MEDIO");
        jPanel3.add(btnMedioMG);

        btnDificilMG.setBackground(new java.awt.Color(255, 153, 0));
        btnGroupDificultadMG.add(btnDificilMG);
        btnDificilMG.setFont(new java.awt.Font("Segoe UI Black", 1, 14)); // NOI18N
        btnDificilMG.setForeground(new java.awt.Color(255, 255, 255));
        btnDificilMG.setText("DIFICIL");
        jPanel3.add(btnDificilMG);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        jPanel1.add(jPanel3, gridBagConstraints);

        getContentPane().add(jPanel1, java.awt.BorderLayout.CENTER);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JRadioButton btnDificilMG;
    private javax.swing.JRadioButton btnFacilMG;
    private javax.swing.ButtonGroup btnGroupDificultadMG;
    private javax.swing.JButton btnGuardarNivelMG;
    private javax.swing.JRadioButton btnMedioMG;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JLabel labelNivelMG;
    private javax.swing.JLabel labelNombreMG;
    private javax.swing.JTextField txtNombreMG;
    // End of variables declaration//GEN-END:variables
}
