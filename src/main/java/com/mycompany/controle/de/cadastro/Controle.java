package com.mycompany.controle.de.cadastro;

import java.util.ArrayList;
import javax.swing.DefaultComboBoxModel;

public class Controle extends javax.swing.JFrame {
    public Controle() {
        initComponents();
        funcionarios.add(new TecnicoAdministrativo(0, "Jener de Souza Novais", 0, true, new Chefe()));
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        chefeComboBox = new javax.swing.JComboBox<>();
        funcTextField = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        tecAdmRadio = new javax.swing.JRadioButton();
        profRadio = new javax.swing.JRadioButton();
        jLabel4 = new javax.swing.JLabel();
        habComboBox = new javax.swing.JComboBox<>();
        cadastroButton = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        nomeComboBox = new javax.swing.JComboBox<>();
        jLabel7 = new javax.swing.JLabel();
        consultarButton = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        textArea = new javax.swing.JTextArea();
        jComboBox1 = new javax.swing.JComboBox<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("Chefe Imediato:");

        chefeComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Jener de Souza Novais" }));

        jLabel2.setText("Nome do Funcionário:");

        jLabel3.setText("Função:");

        buttonGroup1.add(tecAdmRadio);
        tecAdmRadio.setText("Técnico Administrativo");

        buttonGroup1.add(profRadio);
        profRadio.setText("Professor");

        jLabel4.setText("Habilitação:");

        habComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Subordinado", "Chefe" }));

        cadastroButton.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        cadastroButton.setText("Cadastrar");
        cadastroButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cadastroButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3)
                    .addComponent(jLabel4))
                .addGap(27, 27, 27)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(cadastroButton)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addComponent(tecAdmRadio)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 21, Short.MAX_VALUE)
                            .addComponent(profRadio))
                        .addComponent(funcTextField, javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(chefeComboBox, javax.swing.GroupLayout.Alignment.LEADING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(habComboBox, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap(388, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(chefeComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(52, 52, 52)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(funcTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addGap(40, 40, 40)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel3)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(tecAdmRadio)
                        .addComponent(profRadio)))
                .addGap(47, 47, 47)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(habComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(72, 72, 72)
                .addComponent(cadastroButton)
                .addContainerGap(78, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Entrada de Funcionário Público", jPanel1);

        jLabel5.setText("Buscar por:");

        jLabel6.setText("Nome Funcionário Público:");

        jLabel7.setText("Visualização do Resultado:");

        consultarButton.setText("Consultar");
        consultarButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                consultarButtonActionPerformed(evt);
            }
        });

        textArea.setColumns(20);
        textArea.setRows(5);
        jScrollPane1.setViewportView(textArea);

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Chefes", "Subordinados" }));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(44, 44, 44)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 283, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel5)
                            .addComponent(jLabel6)
                            .addComponent(jLabel7))
                        .addGap(28, 28, 28)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(nomeComboBox, 0, 213, Short.MAX_VALUE)
                            .addComponent(consultarButton, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jComboBox1, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addContainerGap(392, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(57, 57, 57)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(nomeComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(42, 42, 42)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(109, 109, 109)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel7)
                    .addComponent(consultarButton))
                .addGap(34, 34, 34)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(35, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Relatórios", jPanel2);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane1)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane1)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    ArrayList<String> chefes = new ArrayList<String>();
    ArrayList<Funcionario> funcionarios = new ArrayList<Funcionario>();
    
    ArrayList<Professor> professores = new ArrayList<Professor>();
    ArrayList<TecnicoAdministrativo> tecAdms = new ArrayList<TecnicoAdministrativo>();
  
    public void atualizarComboBoxes() {
        chefeComboBox.removeAllItems();
        chefeComboBox.addItem("Jener de Souza Novais");
        for(int i = 0; i < chefes.size(); i++) {
            chefeComboBox.addItem(chefes.get(i));
        }
        
        nomeComboBox.removeAllItems();
        for(int i = 0; i < funcionarios.size(); i++) {
            nomeComboBox.addItem(funcionarios.get(i).nome);
        }
    }
    
    private void cadastroButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cadastroButtonActionPerformed
        int id = funcionarios.size();
        String nome = funcTextField.getText();;
        int chefeID = chefeComboBox.getSelectedIndex();
        boolean habilitacaoChefe;
        int idDoChefeDoChefe = 0;

        if(habComboBox.getSelectedIndex() == 1) {
            habilitacaoChefe = true;
        } else {
            habilitacaoChefe = false;
        }
        
        if(funcTextField.getText() == ""){
            return;
        }
        
        if(!(tecAdmRadio.isSelected() || profRadio.isSelected())) {
            return;
        }
        
        if(tecAdmRadio.isSelected()) {
            TecnicoAdministrativo tecAdm;
            
            if(habilitacaoChefe) {
                tecAdm = new TecnicoAdministrativo(id, nome, chefeID, habilitacaoChefe, new Chefe());
            } else {
                tecAdm = new TecnicoAdministrativo(id, nome, chefeID, habilitacaoChefe, new Subordinado());
            }
            
            tecAdm.chefesIDs.add(chefeComboBox.getSelectedIndex());
            
            if(habilitacaoChefe) {
                chefes.add(nome);
                tecAdm.setIdDeChefe(chefes.size());

                atualizarComboBoxes();
            }
            
            funcionarios.add(tecAdm);
            
            int verificarID = chefeID;
            while(true) {
                for(int i = 0; i < funcionarios.size(); i++) {
                    if(funcionarios.get(i).isHabilitacaoChefe() && funcionarios.get(i).getIdDeChefe() == verificarID){
                        idDoChefeDoChefe = funcionarios.get(i).getChefeID();
                    }
                }
                
                if(!(tecAdm.chefesIDs.contains(idDoChefeDoChefe))) {
                    tecAdm.chefesIDs.add(idDoChefeDoChefe);
                }
                 
                verificarID = idDoChefeDoChefe;
                
                if(idDoChefeDoChefe == 0) {    
                    break;
                } 
            }
            
            
            System.out.println("aaaaaaa: " + tecAdm.chefesIDs);
            atualizarComboBoxes();
        }
        
        if(profRadio.isSelected()) {
            Professor prof;
            
            if(habilitacaoChefe) {
                prof = new Professor(id, nome, chefeID, habilitacaoChefe, new Chefe());
            } else {
                prof = new Professor(id, nome, chefeID, habilitacaoChefe, new Subordinado());
            }
            
            prof.chefesIDs.add(chefeComboBox.getSelectedIndex());
            
            if(habilitacaoChefe) {
                chefes.add(nome);
                prof.setIdDeChefe(chefes.size());

                atualizarComboBoxes();
            }
            
            funcionarios.add(prof);
            
            int verificarID = chefeID;
            while(true) {
                for(int i = 0; i < funcionarios.size(); i++) {
                    if(funcionarios.get(i).isHabilitacaoChefe() && funcionarios.get(i).getIdDeChefe() == verificarID){
                        idDoChefeDoChefe = funcionarios.get(i).getChefeID();
                    }
                }
                
                if(!(prof.chefesIDs.contains(idDoChefeDoChefe))) {
                    prof.chefesIDs.add(idDoChefeDoChefe);
                }
                 
                verificarID = idDoChefeDoChefe;
                
                if(idDoChefeDoChefe == 0) {    
                    break;
                } 
            }
            
            atualizarComboBoxes();
        }
        
        
        System.out.println(funcionarios.toString());
    }//GEN-LAST:event_cadastroButtonActionPerformed

    private void consultarButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_consultarButtonActionPerformed
        int index = nomeComboBox.getSelectedIndex();  
    }//GEN-LAST:event_consultarButtonActionPerformed

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
            java.util.logging.Logger.getLogger(Controle.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Controle.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Controle.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Controle.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Controle().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JButton cadastroButton;
    private javax.swing.JComboBox<String> chefeComboBox;
    private javax.swing.JButton consultarButton;
    private javax.swing.JTextField funcTextField;
    private javax.swing.JComboBox<String> habComboBox;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JComboBox<String> nomeComboBox;
    private javax.swing.JRadioButton profRadio;
    private javax.swing.JRadioButton tecAdmRadio;
    private javax.swing.JTextArea textArea;
    // End of variables declaration//GEN-END:variables
}
