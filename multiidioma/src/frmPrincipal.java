public class frmPrincipal extends javax.swing.JFrame {

    public frmPrincipal() {
        initComponents();
        cambiarIdioma("Espanol");
    }
    
    public void cambiarIdioma(String nombreIdioma){
        
        idioma=new Idioma(nombreIdioma);
        
        btnCambio.setText(idioma.getProperty("cambio"));
        this.setTitle(idioma.getProperty("titulo"));
        lblSaludo.setText(idioma.getProperty("saludo"));
        
        cmbIdiomas.removeAllItems();
        
        String idiomas[]={
                          idioma.getProperty("espanol"),
                          idioma.getProperty("ingles")
                          };
        //        
        //Se rellena el combo con los idiomas disponibles
        //
        for(int i=0;i<idiomas.length;i++){
            cmbIdiomas.addItem(idiomas[i]);
        }
        
    }
    @SuppressWarnings("unchecked")
    private void initComponents() {

        btnCambio = new javax.swing.JButton();
        lblSaludo = new javax.swing.JLabel();
        cmbIdiomas = new javax.swing.JComboBox();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        btnCambio.setText("jButton1");
        btnCambio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCambioActionPerformed(evt);
            }
        });

        lblSaludo.setText("jLabel1");
        cmbIdiomas.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Español", "Inglés" }));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(145, 145, 145)
                .addComponent(btnCambio)
                .addContainerGap(120, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(lblSaludo, javax.swing.GroupLayout.DEFAULT_SIZE, 166, Short.MAX_VALUE)
                    .addComponent(cmbIdiomas, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(75, 75, 75))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addComponent(lblSaludo, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(44, 44, 44)
                .addComponent(cmbIdiomas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(35, 35, 35)
                .addComponent(btnCambio)
                .addContainerGap(67, Short.MAX_VALUE))
        );

        pack();
    }

    private void btnCambioActionPerformed(java.awt.event.ActionEvent evt) {
        switch(cmbIdiomas.getSelectedIndex()){
            case 0:
                cambiarIdioma("Español");
                break;
            case 1:
                cambiarIdioma("Inglés");
                break;
        } 
    }

    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(frmPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(frmPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(frmPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(frmPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }


        //Se crea y se presenta el formulario
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new frmPrincipal().setVisible(true);
            }
        });
    }
    private javax.swing.JButton btnCambio;
    private javax.swing.JComboBox cmbIdiomas;
    private javax.swing.JLabel lblSaludo;
    private Idioma idioma;
}
