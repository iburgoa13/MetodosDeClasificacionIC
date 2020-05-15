package View;

import Algoritmos.TDatos;
import Controller.Controlador;

import javax.swing.*;
import java.awt.*;

public class GUIMainImp extends GUIMain {


    public GUIMainImp() {
        initComponents();
        this.buttonGroup.add(this.jRadioButtonBayes);
        this.buttonGroup.add(this.jRadioButtonKMedias);
        this.buttonGroup.add(this.jRadioButtonLloyd);
        this.setLocationRelativeTo(null);
    }


    private void initComponents() {

        buttonGroup = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jTextFieldArchivoMuestras = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jTextFieldArchivoInicializacion = new javax.swing.JTextField();
        jTextFieldArchivoTest = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jButtonEnviar = new javax.swing.JButton();
        jButtonSalir = new javax.swing.JButton();
        jRadioButtonBayes = new javax.swing.JRadioButton();
        jRadioButtonLloyd = new javax.swing.JRadioButton();
        jRadioButtonKMedias = new javax.swing.JRadioButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        jPanel1.setBackground(new java.awt.Color(15, 60, 80));

        jLabel1.setFont(new java.awt.Font("Action Man Extended", 1, 15)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("                                     Algoritmos de Clasificación");

        jLabel2.setFont(new java.awt.Font("Action Man Extended", 0, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Iker Burgoa Muñoz - IC - 4ºE");

        jLabel3.setFont(new java.awt.Font("Action Man Extended", 0, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Archivo de las muestras:");

        jTextFieldArchivoMuestras.setFont(new java.awt.Font("Action Man Extended", 0, 14)); // NOI18N
        jTextFieldArchivoMuestras.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        jLabel4.setFont(new java.awt.Font("Action Man Extended", 0, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Archivo de los Centros:");

        jTextFieldArchivoInicializacion.setFont(new java.awt.Font("Action Man Extended", 0, 14)); // NOI18N
        jTextFieldArchivoInicializacion.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        jTextFieldArchivoTest.setFont(new java.awt.Font("Action Man Extended", 0, 14)); // NOI18N
        jTextFieldArchivoTest.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        jLabel5.setFont(new java.awt.Font("Action Man Extended", 0, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Archivo de Test:");

        jLabel6.setFont(new java.awt.Font("Action Man Extended", 0, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Algoritmos:");

        jButtonEnviar.setFont(new java.awt.Font("Action Man Extended", 0, 12)); // NOI18N
        jButtonEnviar.setForeground(new java.awt.Color(255, 255, 255));
        jButtonEnviar.setText("Enviar Datos");
        jButtonEnviar.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        jButtonEnviar.setContentAreaFilled(false);
        jButtonEnviar.setName(""); // NOI18N
        jButtonEnviar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonEnviarActionPerformed(evt);
            }
        });

        jButtonSalir.setFont(new java.awt.Font("Action Man Extended", 0, 14)); // NOI18N
        jButtonSalir.setForeground(new java.awt.Color(255, 255, 255));
        jButtonSalir.setText("Salir");
        jButtonSalir.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        jButtonSalir.setContentAreaFilled(false);
        jButtonSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonSalirActionPerformed(evt);
            }
        });

        jRadioButtonBayes.setFont(new java.awt.Font("Action Man Extended", 0, 14)); // NOI18N
        jRadioButtonBayes.setForeground(new java.awt.Color(255, 255, 255));
        jRadioButtonBayes.setText("Bayes");
        jRadioButtonBayes.setContentAreaFilled(false);

        jRadioButtonLloyd.setFont(new java.awt.Font("Action Man Extended", 0, 14)); // NOI18N
        jRadioButtonLloyd.setForeground(new java.awt.Color(255, 255, 255));
        jRadioButtonLloyd.setText("Lloyd");
        jRadioButtonLloyd.setContentAreaFilled(false);

        jRadioButtonKMedias.setFont(new java.awt.Font("Action Man Extended", 0, 14)); // NOI18N
        jRadioButtonKMedias.setForeground(new java.awt.Color(255, 255, 255));
        jRadioButtonKMedias.setText("KMedias");
        jRadioButtonKMedias.setContentAreaFilled(false);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
                jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addContainerGap()
                                                .addComponent(jLabel2))
                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addGap(29, 29, 29)
                                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                                                .addComponent(jLabel6)
                                                                .addGap(187, 187, 187)
                                                                .addComponent(jRadioButtonBayes))
                                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                                .addComponent(jLabel4)
                                                                .addComponent(jLabel5)
                                                                .addComponent(jLabel3)))
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 57, Short.MAX_VALUE)
                                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                                .addComponent(jTextFieldArchivoInicializacion, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addComponent(jTextFieldArchivoTest, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addComponent(jTextFieldArchivoMuestras, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                                        .addComponent(jButtonEnviar, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                                                                .addComponent(jRadioButtonLloyd)
                                                                                .addGap(14, 14, 14)))
                                                                .addGap(46, 46, 46)
                                                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                                        .addComponent(jButtonSalir, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                        .addComponent(jRadioButtonKMedias, javax.swing.GroupLayout.Alignment.TRAILING))))))
                                .addGap(36, 36, 36))
                        .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(70, 70, 70)
                                .addComponent(jLabel1)
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
                jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                                .addContainerGap(34, Short.MAX_VALUE)
                                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(35, 35, 35)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addComponent(jLabel4)
                                                .addGap(33, 33, 33)
                                                .addComponent(jLabel5)
                                                .addGap(97, 97, 97)
                                                .addComponent(jLabel2))
                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                        .addComponent(jTextFieldArchivoMuestras, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(jLabel3))
                                                .addGap(28, 28, 28)
                                                .addComponent(jTextFieldArchivoInicializacion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(27, 27, 27)
                                                .addComponent(jTextFieldArchivoTest, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(31, 31, 31)
                                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                        .addComponent(jLabel6)
                                                        .addComponent(jRadioButtonBayes)
                                                        .addComponent(jRadioButtonLloyd)
                                                        .addComponent(jRadioButtonKMedias))
                                                .addGap(18, 18, 18)
                                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                        .addComponent(jButtonEnviar, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(jButtonSalir, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                .addContainerGap())))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonSalirActionPerformed
        JLabel label = new JLabel("<html><body>¡Adios!</body></html>");
        label.setFont(new Font("Action Man Extended", Font.BOLD, 20));
        JOptionPane.showMessageDialog(null, label, "¡Hasta pronto!", JOptionPane.INFORMATION_MESSAGE);
        System.exit(0);
    }

    private void jButtonEnviarActionPerformed(java.awt.event.ActionEvent evt) {
        String archivoMuestras = "", archivoInicializacion = "", archivoTest = "";
        int nErrores = 0;
        if(!this.jTextFieldArchivoMuestras.getText().matches("^(?!\\s*$).+")){
            nErrores++;
        }
        else {
            archivoMuestras = this.jTextFieldArchivoMuestras.getText();;
        }
        if(!this.jTextFieldArchivoInicializacion.getText().matches("^(?!\\s*$).+")){
            nErrores++;
        }
        else {
            archivoInicializacion = this.jTextFieldArchivoInicializacion.getText();;
        }
        if(!this.jTextFieldArchivoTest.getText().matches("^(?!\\s*$).+")){
            nErrores++;
        }
        else {
            archivoTest = this.jTextFieldArchivoTest.getText();;
        }

        if(this.jRadioButtonBayes.isSelected() && nErrores == 0) {
            TDatos tDatos = new TDatos(archivoMuestras, archivoInicializacion, archivoTest);
            Controlador.getInstance().accion(new Contexto(Events.BAYES, tDatos));
        }
        else if(this.jRadioButtonKMedias.isSelected() && nErrores == 0) {
            TDatos tDatos = new TDatos(archivoMuestras, archivoInicializacion, archivoTest);
            Controlador.getInstance().accion(new Contexto(Events.KMEDIAS, tDatos));
        }
        else if(this.jRadioButtonLloyd.isSelected() && nErrores == 0) {
            TDatos tDatos = new TDatos(archivoMuestras, archivoInicializacion, archivoTest);
            Controlador.getInstance().accion(new Contexto(Events.LLOYD, tDatos));
        }
        else {
            JLabel label = new JLabel("<html><body>Todos los campos son obligatorios</body></html>");
            label.setFont(new Font("Action Man Extended", Font.BOLD, 25));
            JOptionPane.showMessageDialog(null, label, "¡Aviso!", JOptionPane.INFORMATION_MESSAGE);
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup buttonGroup;
    private javax.swing.JButton jButtonEnviar;
    private javax.swing.JButton jButtonSalir;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JRadioButton jRadioButtonBayes;
    private javax.swing.JRadioButton jRadioButtonKMedias;
    private javax.swing.JRadioButton jRadioButtonLloyd;
    private javax.swing.JTextField jTextFieldArchivoInicializacion;
    private javax.swing.JTextField jTextFieldArchivoMuestras;
    private javax.swing.JTextField jTextFieldArchivoTest;
    // End of variables declaration//GEN-END:variables

    @Override
    public void actualizar(Contexto contexto) {
        int evento = contexto.getEvento();
        switch(evento) {
            case(Events.GUI_MAIN):
                this.setVisible(true);
                break;
            case(Events.LLOYD_OK):
                JLabel label1 = new JLabel((String)contexto.getDato());
                label1.setFont(new Font("Action Man Extended", Font.BOLD, 25));
                JOptionPane.showMessageDialog(null, label1, "¡Resultado!", JOptionPane.INFORMATION_MESSAGE);
                break;
            case(Events.LLOYD_KO):
                if(contexto.getDato() == null) {
                    JLabel label2 = new JLabel("<html><body>No se han podido cargar los archivos</body></html>");
                    label2.setFont(new Font("Action Man Extended", Font.BOLD, 25));
                    JOptionPane.showMessageDialog(null, label2, "¡Aviso!", JOptionPane.INFORMATION_MESSAGE);
                }
                else {
                    int res = (int) contexto.getDato();
                    switch(res){
                        case(-1):
                            JLabel label4 = new JLabel("<html><body>Hay más vectores de inicializacion que clases</body></html>");
                            label4.setFont(new Font("Action Man Extended", Font.BOLD, 25));
                            JOptionPane.showMessageDialog(null, label4, "¡Aviso!", JOptionPane.INFORMATION_MESSAGE);
                            break;
                        case(-2):
                            JLabel label5 = new JLabel("<html><body>Hay menos vectores de inicializacion que clases</body></html>");
                            label5.setFont(new Font("Action Man Extended", Font.BOLD, 25));
                            JOptionPane.showMessageDialog(null, label5, "¡Aviso!", JOptionPane.INFORMATION_MESSAGE);
                            break;
                        case(-3):
                            JLabel label6 = new JLabel("<html><body>Los vectores de inicializacion no contienen numeros</body></html>");
                            label6.setFont(new Font("Action Man Extended", Font.BOLD, 25));
                            JOptionPane.showMessageDialog(null, label6, "¡Aviso!", JOptionPane.INFORMATION_MESSAGE);
                            break;
                        case(-4):
                            JLabel label7 = new JLabel("<html><body>Los vectores de test no contienen numeros</body></html>");
                            label7.setFont(new Font("Action Man Extended", Font.BOLD, 25));
                            JOptionPane.showMessageDialog(null, label7, "¡Aviso!", JOptionPane.INFORMATION_MESSAGE);
                            break;
                    }
                }
                break;
            case(Events.BAYES_OK):
                JLabel label3 = new JLabel((String)contexto.getDato());
                label3.setFont(new Font("Action Man Extended", Font.BOLD, 25));
                JOptionPane.showMessageDialog(null, label3, "¡Resultado!", JOptionPane.INFORMATION_MESSAGE);
                break;
            case(Events.BAYES_KO):
                if(contexto.getDato() == null) {
                    JLabel label4 = new JLabel("<html><body>No se han podido cargar los archivos</body></html>");
                    label4.setFont(new Font("Action Man Extended", Font.BOLD, 25));
                    JOptionPane.showMessageDialog(null, label4, "¡Aviso!", JOptionPane.INFORMATION_MESSAGE);
                }
                else {
                    int res = (int) contexto.getDato();
                    switch(res){
                        case(-1):
                            JLabel label4 = new JLabel("<html><body>Hay más vectores de inicializacion que clases</body></html>");
                            label4.setFont(new Font("Action Man Extended", Font.BOLD, 25));
                            JOptionPane.showMessageDialog(null, label4, "¡Aviso!", JOptionPane.INFORMATION_MESSAGE);
                            break;
                        case(-2):
                            JLabel label5 = new JLabel("<html><body>Hay menos vectores de inicializacion que clases</body></html>");
                            label5.setFont(new Font("Action Man Extended", Font.BOLD, 25));
                            JOptionPane.showMessageDialog(null, label5, "¡Aviso!", JOptionPane.INFORMATION_MESSAGE);
                            break;
                        case(-3):
                            JLabel label6 = new JLabel("<html><body>Los vectores de inicializacion no contienen numeros</body></html>");
                            label6.setFont(new Font("Action Man Extended", Font.BOLD, 25));
                            JOptionPane.showMessageDialog(null, label6, "¡Aviso!", JOptionPane.INFORMATION_MESSAGE);
                            break;
                        case(-4):
                            JLabel label7 = new JLabel("<html><body>Los vectores de test no contienen numeros</body></html>");
                            label7.setFont(new Font("Action Man Extended", Font.BOLD, 25));
                            JOptionPane.showMessageDialog(null, label7, "¡Aviso!", JOptionPane.INFORMATION_MESSAGE);
                            break;
                    }
                }
                break;
            case(Events.KMEDIAS_OK):
                JLabel label5 = new JLabel((String)contexto.getDato());
                label5.setFont(new Font("Action Man Extended", Font.BOLD, 25));
                JOptionPane.showMessageDialog(null, label5, "¡Resultado!", JOptionPane.INFORMATION_MESSAGE);
                break;
            case(Events.KMEDIAS_KO):
                if(contexto.getDato() == null) {
                    JLabel label6 = new JLabel("<html><body>No se han podido cargar los archivos</body></html>");
                    label6.setFont(new Font("Action Man Extended", Font.BOLD, 25));
                    JOptionPane.showMessageDialog(null, label6, "¡Aviso!", JOptionPane.INFORMATION_MESSAGE);
                }
                else {
                    int res = (int) contexto.getDato();
                    switch(res){
                        case(-1):
                            JLabel label4 = new JLabel("<html><body>Hay más vectores de inicializacion que clases</body></html>");
                            label4.setFont(new Font("Action Man Extended", Font.BOLD, 25));
                            JOptionPane.showMessageDialog(null, label4, "¡Aviso!", JOptionPane.INFORMATION_MESSAGE);
                            break;
                        case(-2):
                            JLabel label8 = new JLabel("<html><body>Hay menos vectores de inicializacion que clases</body></html>");
                            label8.setFont(new Font("Copperplate Gothic Bold", Font.BOLD, 25));
                            JOptionPane.showMessageDialog(null, label8, "¡Aviso!", JOptionPane.INFORMATION_MESSAGE);
                            break;
                        case(-3):
                            JLabel label6 = new JLabel("<html><body>Los vectores de inicializacion no contienen numeros</body></html>");
                            label6.setFont(new Font("Action Man Extended", Font.BOLD, 25));
                            JOptionPane.showMessageDialog(null, label6, "¡Aviso!", JOptionPane.INFORMATION_MESSAGE);
                            break;
                        case(-4):
                            JLabel label7 = new JLabel("<html><body>Los vectores de test no contienen numeros</body></html>");
                            label7.setFont(new Font("Action Man Extended", Font.BOLD, 25));
                            JOptionPane.showMessageDialog(null, label7, "¡Aviso!", JOptionPane.INFORMATION_MESSAGE);
                            break;
                    }
                }
                break;
        }
    }
}