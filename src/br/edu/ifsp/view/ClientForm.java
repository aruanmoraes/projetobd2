/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifsp.view;

import java.util.List;

import javax.swing.table.TableModel;

import br.edu.ifsp.control.ClientControl;
import br.edu.ifsp.control.IControl;
import br.edu.ifsp.model.Client;
import br.edu.ifsp.view.model.ClientModel;

/**
 *
 * @author cg147862
 */
public class ClientForm extends javax.swing.JFrame {

    /**
     * Creates new form ClientForm
     */
    public ClientForm() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    // <editor-fold defaultstate="collapsed" desc="Generated Code">                          
    private void initComponents() {

        acoesPanel = new javax.swing.JPanel();
        incluirButton = new javax.swing.JButton();
        atualizarButton = new javax.swing.JButton();
        excluirButton = new javax.swing.JButton();
        consultarButton = new javax.swing.JButton();
        dadosPanel = new javax.swing.JPanel();
        nomeLabel = new javax.swing.JLabel();
        nomeField = new javax.swing.JTextField();
        nascimentoLabel = new javax.swing.JLabel();
        nascimentoField = new javax.swing.JFormattedTextField();
        confirmacaoPanel = new javax.swing.JPanel();
        salvarButton = new javax.swing.JButton();
        cancelarButton = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        clienteTable = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                onOpen(evt);
            }
        });

        acoesPanel.setBorder(javax.swing.BorderFactory.createTitledBorder("A��es"));
        acoesPanel.setName("acaoPanel"); // NOI18N

        incluirButton.setText("Incluir");
        incluirButton.setName("incluirButton"); // NOI18N
        incluirButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                incluirButtonActionPerformed(evt);
            }
        });

        atualizarButton.setText("Atualizar");
        atualizarButton.setName("atualizarButton"); // NOI18N
        atualizarButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                atualizarButtonActionPerformed(evt);
            }
        });

        excluirButton.setText("Excluir");
        excluirButton.setName("excluirButton"); // NOI18N

        consultarButton.setText("Consultar");
        consultarButton.setName("consultarButton"); // NOI18N

        javax.swing.GroupLayout acoesPanelLayout = new javax.swing.GroupLayout(acoesPanel);
        acoesPanel.setLayout(acoesPanelLayout);
        acoesPanelLayout.setHorizontalGroup(
            acoesPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(acoesPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(acoesPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(incluirButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(consultarButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(excluirButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(atualizarButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        acoesPanelLayout.setVerticalGroup(
            acoesPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(acoesPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(incluirButton, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(consultarButton, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(excluirButton, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(atualizarButton, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        dadosPanel.setBorder(javax.swing.BorderFactory.createTitledBorder("Dados do Cliente"));
        dadosPanel.setEnabled(false);
        dadosPanel.setName("dadosPanel"); // NOI18N

        nomeLabel.setText("Nome Completo");
        nomeLabel.setEnabled(false);
        nomeLabel.setName("nomeLabel"); // NOI18N

        nomeField.setEnabled(false);
        nomeField.setName("nameField"); // NOI18N

        nascimentoLabel.setText("Data Nascimento");
        nascimentoLabel.setEnabled(false);
        nascimentoLabel.setName("nascimentoLabel"); // NOI18N

        nascimentoField.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.DateFormatter()));
        nascimentoField.setEnabled(false);
        nascimentoField.setName("nascimentoField"); // NOI18N

        javax.swing.GroupLayout dadosPanelLayout = new javax.swing.GroupLayout(dadosPanel);
        dadosPanel.setLayout(dadosPanelLayout);
        dadosPanelLayout.setHorizontalGroup(
            dadosPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(dadosPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(dadosPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(nomeField)
                    .addGroup(dadosPanelLayout.createSequentialGroup()
                        .addGroup(dadosPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(nomeLabel)
                            .addComponent(nascimentoLabel)
                            .addComponent(nascimentoField, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        dadosPanelLayout.setVerticalGroup(
            dadosPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(dadosPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(nomeLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(nomeField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(nascimentoLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(nascimentoField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        confirmacaoPanel.setBorder(javax.swing.BorderFactory.createTitledBorder(""));
        confirmacaoPanel.setName("confirmacaoPanel"); // NOI18N

        salvarButton.setText("Salvar");
        salvarButton.setEnabled(false);
        salvarButton.setName("salvaButton"); // NOI18N

        cancelarButton.setText("Cancelar");
        cancelarButton.setEnabled(false);
        cancelarButton.setName("cancelarButton"); // NOI18N
        cancelarButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancelarButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout confirmacaoPanelLayout = new javax.swing.GroupLayout(confirmacaoPanel);
        confirmacaoPanel.setLayout(confirmacaoPanelLayout);
        confirmacaoPanelLayout.setHorizontalGroup(
            confirmacaoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, confirmacaoPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(confirmacaoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(cancelarButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(salvarButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        confirmacaoPanelLayout.setVerticalGroup(
            confirmacaoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(confirmacaoPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(salvarButton, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(cancelarButton, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        clienteTable.setModel(new ClientModel(new String[] {"C�digo Cliente", "Nome Completo", "Data Nascimento"}, new Object[][] {}));
        jScrollPane1.setViewportView(clienteTable);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(dadosPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jScrollPane1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(acoesPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(confirmacaoPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(dadosPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(acoesPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(confirmacaoPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>                        

    private void atualizarButtonActionPerformed(java.awt.event.ActionEvent evt) {                                                
        // TODO add your handling code here:
    }                                               

    private void incluirButtonActionPerformed(java.awt.event.ActionEvent evt) {                                              
        this.enableDataPanel(true);
    }                                             

    private void cancelarButtonActionPerformed(java.awt.event.ActionEvent evt) {                                               
        this.enableDataPanel(false);
    }                                              

    private void onOpen(java.awt.event.WindowEvent evt) {                        
        IControl<Client> control = new ClientControl();
        
        List<Client> clientList = control.list();
        
        TableModel model = this.clienteTable.getModel();

        
        for (int i = 0; i < clientList.size(); i++) {
        	model.setValueAt(clientList.get(i).getIdClient(), i, 0);
        	model.setValueAt(clientList.get(i).getName(), i, 1);
        	model.setValueAt(clientList.get(i).getNascimento().toString(), i, 2);
        }
    }                       
    
    private void enableDataPanel(boolean enabled) {
        this.dadosPanel.setEnabled(enabled);
        this.nomeLabel.setEnabled(enabled);
        this.nomeField.setEnabled(enabled);
        this.nascimentoLabel.setEnabled(enabled);
        this.nascimentoField.setEnabled(enabled);
        
        this.clienteTable.setEnabled(!enabled);
        this.clienteTable.setRowSelectionAllowed(!enabled);
        
        this.acoesPanel.setEnabled(!enabled);
        this.incluirButton.setEnabled(!enabled);
        this.consultarButton.setEnabled(!enabled);
        this.excluirButton.setEnabled(!enabled);
        this.atualizarButton.setEnabled(!enabled);
        
        this.confirmacaoPanel.setEnabled(enabled);
        this.salvarButton.setEnabled(enabled);
        this.cancelarButton.setEnabled(enabled);
    }
    
    // Variables declaration - do not modify                     
    private javax.swing.JPanel acoesPanel;
    private javax.swing.JButton atualizarButton;
    private javax.swing.JButton cancelarButton;
    private javax.swing.JTable clienteTable;
    private javax.swing.JPanel confirmacaoPanel;
    private javax.swing.JButton consultarButton;
    private javax.swing.JPanel dadosPanel;
    private javax.swing.JButton excluirButton;
    private javax.swing.JButton incluirButton;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JFormattedTextField nascimentoField;
    private javax.swing.JLabel nascimentoLabel;
    private javax.swing.JTextField nomeField;
    private javax.swing.JLabel nomeLabel;
    private javax.swing.JButton salvarButton;
    // End of variables declaration                   
}
