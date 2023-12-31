/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JInternalFrame.java to edit this template
 */
package br.com.telas;

import br.com.model.ModelPessoa;
import br.com.controller.ControllerPessoa;
import br.com.controller.ControllerCidade;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Vector;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import br.com.util.Uteis;
import java.awt.HeadlessException;

/**
 *
 * @author catuai
 */
public final class CadPessoa extends javax.swing.JInternalFrame {

    Uteis uteis = new Uteis();
    int i = 0;

    /**
     * Creates new form CadCliente
     */
    public CadPessoa() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Pessoa = new javax.swing.JPanel();
        id = new javax.swing.JLabel();
        txtId = new javax.swing.JTextField();
        nome = new javax.swing.JLabel();
        txtNome = new javax.swing.JTextField();
        cpf = new javax.swing.JLabel();
        txtTelefone = new javax.swing.JFormattedTextField();
        telefone = new javax.swing.JLabel();
        txtEmail = new javax.swing.JTextField();
        txtCpf = new javax.swing.JFormattedTextField();
        email = new javax.swing.JLabel();
        Endereco = new javax.swing.JPanel();
        endereco = new javax.swing.JLabel();
        txtEndereco = new javax.swing.JTextField();
        num = new javax.swing.JLabel();
        txtNum = new javax.swing.JTextField();
        bairro = new javax.swing.JLabel();
        cidade = new javax.swing.JLabel();
        txtBairro = new javax.swing.JTextField();
        uf = new javax.swing.JLabel();
        txtUF = new javax.swing.JTextField();
        txtCep = new javax.swing.JFormattedTextField();
        cep = new javax.swing.JLabel();
        CbxCidade = new javax.swing.JComboBox<>();
        BtnSalvar = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();

        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        setTitle("Cadastro Pessoa");
        addInternalFrameListener(new javax.swing.event.InternalFrameListener() {
            public void internalFrameActivated(javax.swing.event.InternalFrameEvent evt) {
                formInternalFrameActivated(evt);
            }
            public void internalFrameClosed(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameClosing(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameDeactivated(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameDeiconified(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameIconified(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameOpened(javax.swing.event.InternalFrameEvent evt) {
            }
        });

        Pessoa.setBorder(javax.swing.BorderFactory.createTitledBorder("Pessoa"));

        id.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        id.setText("ID");

        txtId.setEditable(false);

        nome.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        nome.setText("Nome");

        cpf.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        cpf.setText("CPF");

        try {
            txtTelefone.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("(##)#####-####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        telefone.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        telefone.setText("Telefone");

        try {
            txtCpf.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("###.###.###-##")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        email.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        email.setText("Email");

        javax.swing.GroupLayout PessoaLayout = new javax.swing.GroupLayout(Pessoa);
        Pessoa.setLayout(PessoaLayout);
        PessoaLayout.setHorizontalGroup(
            PessoaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PessoaLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(PessoaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(PessoaLayout.createSequentialGroup()
                        .addGroup(PessoaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(email)
                            .addComponent(txtEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 364, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(PessoaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(PessoaLayout.createSequentialGroup()
                                .addComponent(telefone)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(PessoaLayout.createSequentialGroup()
                                .addComponent(txtTelefone)
                                .addContainerGap())))
                    .addGroup(PessoaLayout.createSequentialGroup()
                        .addGroup(PessoaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(id)
                            .addComponent(txtId, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(PessoaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtNome, javax.swing.GroupLayout.PREFERRED_SIZE, 330, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(nome))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(PessoaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(PessoaLayout.createSequentialGroup()
                                .addComponent(cpf)
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(PessoaLayout.createSequentialGroup()
                                .addComponent(txtCpf, javax.swing.GroupLayout.DEFAULT_SIZE, 101, Short.MAX_VALUE)
                                .addContainerGap())))))
        );
        PessoaLayout.setVerticalGroup(
            PessoaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PessoaLayout.createSequentialGroup()
                .addGroup(PessoaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(id)
                    .addComponent(nome)
                    .addComponent(cpf))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(PessoaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtCpf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(PessoaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(email)
                    .addComponent(telefone))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(PessoaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtTelefone, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        Endereco.setBorder(javax.swing.BorderFactory.createTitledBorder("Endereço"));

        endereco.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        endereco.setText("Endereço");

        num.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        num.setText("Número");

        bairro.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        bairro.setText("Bairro");

        cidade.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        cidade.setText("Cidade");

        uf.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        uf.setText("UF");

        txtUF.setEditable(false);

        try {
            txtCep.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("####-####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        cep.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        cep.setText("CEP");

        CbxCidade.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Selecione" }));
        CbxCidade.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CbxCidadeActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout EnderecoLayout = new javax.swing.GroupLayout(Endereco);
        Endereco.setLayout(EnderecoLayout);
        EnderecoLayout.setHorizontalGroup(
            EnderecoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(EnderecoLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(EnderecoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(EnderecoLayout.createSequentialGroup()
                        .addGroup(EnderecoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtBairro, javax.swing.GroupLayout.PREFERRED_SIZE, 214, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(bairro))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(EnderecoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtUF, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(uf))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(EnderecoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtCep, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cep))
                        .addGap(18, 18, 18)
                        .addGroup(EnderecoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(EnderecoLayout.createSequentialGroup()
                                .addComponent(num)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addComponent(txtNum, javax.swing.GroupLayout.DEFAULT_SIZE, 82, Short.MAX_VALUE)))
                    .addGroup(EnderecoLayout.createSequentialGroup()
                        .addGroup(EnderecoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtEndereco, javax.swing.GroupLayout.PREFERRED_SIZE, 359, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(endereco))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(EnderecoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(EnderecoLayout.createSequentialGroup()
                                .addComponent(cidade)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addComponent(CbxCidade, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addContainerGap())
        );
        EnderecoLayout.setVerticalGroup(
            EnderecoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(EnderecoLayout.createSequentialGroup()
                .addGroup(EnderecoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(endereco)
                    .addComponent(cidade))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(EnderecoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtEndereco, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(CbxCidade, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(EnderecoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(bairro)
                    .addComponent(uf)
                    .addComponent(cep)
                    .addComponent(num))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(EnderecoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtBairro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtUF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtCep, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtNum, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        BtnSalvar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/images/Apply.png"))); // NOI18N
        BtnSalvar.setText("Salvar");
        BtnSalvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnSalvarActionPerformed(evt);
            }
        });

        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/images/Trash.png"))); // NOI18N
        jButton1.setText("Limpar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Endereco, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(Pessoa, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(BtnSalvar, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(14, 14, 14))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(Pessoa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Endereco, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(BtnSalvar, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(15, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void CbxCidadeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CbxCidadeActionPerformed
        // TODO add your handling code here:
        try {
            ControllerCidade cidad = new ControllerCidade();
            ResultSet rs = cidad.listarCidades();

            while (rs.next()) {
                String city = rs.getString(2);
                if (city.equals(CbxCidade.getSelectedItem())) {
                    txtUF.setText(rs.getString(3));
                    i = rs.getInt(1);
                }
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e);
        }
    }//GEN-LAST:event_CbxCidadeActionPerformed

    private void formInternalFrameActivated(javax.swing.event.InternalFrameEvent evt) {//GEN-FIRST:event_formInternalFrameActivated
        // TODO add your handling code here:
        DadosCbx();
        Ultimo();
        this.txtNome.requestFocus();
    }//GEN-LAST:event_formInternalFrameActivated

    private void BtnSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnSalvarActionPerformed
        try {
            // TODO add your handling code here:
            if (JOptionPane.showConfirmDialog(this,
                    "Deseja Realmente Salvar?",
                    "Salvar",
                    JOptionPane.YES_NO_OPTION)
                    == JOptionPane.YES_OPTION) {
                adicionar();
            }
        } catch (HeadlessException | SQLException ex) {
            Logger.getLogger(CadPessoa.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_BtnSalvarActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        uteis.limparCampos(Pessoa);
        uteis.limparCampos(Endereco);
        Ultimo();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void adicionar() throws SQLException {
        ModelPessoa pessoa = new ModelPessoa();

        ControllerPessoa contPessoa = new ControllerPessoa(this);

        pessoa.setPessoanome(txtNome.getText());
        pessoa.setPessoaCPF(txtCpf.getText());
        pessoa.setPessoaEmail(txtEmail.getText());
        pessoa.setPessoaTele(txtTelefone.getText());
        pessoa.setRua(txtEndereco.getText());
        pessoa.setNumero(txtNum.getText());
        pessoa.setBairro(txtBairro.getText());
        pessoa.setCep(txtCep.getText());
        pessoa.setIdCidade(i);

        contPessoa.adicionar(pessoa);
    }

    Vector<Integer> IdCidade = new Vector<>();

    public void DadosCbx() {
        try {
            ControllerCidade cidade1 = new ControllerCidade();
            ResultSet rs = cidade1.listarCidades();

            while (rs.next()) {
                IdCidade.addElement(rs.getInt(1));
                CbxCidade.addItem(rs.getString(2));
            }
        } catch (SQLException e) {

        }
    }

    public void Ultimo() {
        try {
            ControllerPessoa person = new ControllerPessoa(this);
            ResultSet rs = person.ultimoElemento();
            while (rs.next()) {
                int n = rs.getInt(1);
                String str = Integer.toString(n);
                txtId.setText(str);
            }

        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e);
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BtnSalvar;
    private javax.swing.JComboBox<String> CbxCidade;
    public javax.swing.JPanel Endereco;
    public javax.swing.JPanel Pessoa;
    private javax.swing.JLabel bairro;
    private javax.swing.JLabel cep;
    private javax.swing.JLabel cidade;
    private javax.swing.JLabel cpf;
    private javax.swing.JLabel email;
    private javax.swing.JLabel endereco;
    private javax.swing.JLabel id;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel nome;
    private javax.swing.JLabel num;
    private javax.swing.JLabel telefone;
    private javax.swing.JTextField txtBairro;
    private javax.swing.JFormattedTextField txtCep;
    private javax.swing.JFormattedTextField txtCpf;
    private javax.swing.JTextField txtEmail;
    private javax.swing.JTextField txtEndereco;
    private javax.swing.JTextField txtId;
    private javax.swing.JTextField txtNome;
    private javax.swing.JTextField txtNum;
    private javax.swing.JFormattedTextField txtTelefone;
    private javax.swing.JTextField txtUF;
    private javax.swing.JLabel uf;
    // End of variables declaration//GEN-END:variables
}
