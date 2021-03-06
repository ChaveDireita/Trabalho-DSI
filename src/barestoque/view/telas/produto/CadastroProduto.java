package barestoque.view.telas.produto;

import barestoque.DAO.CategoriaDAO;
import barestoque.DAO.FornecedorDAO;
import barestoque.controller.ControladorCadastroLista;
import barestoque.model.Categoria;
import barestoque.model.Fornecedor;
import barestoque.view.InicializadorLookAndFeel;
import java.util.ArrayList;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class CadastroProduto extends javax.swing.JPanel {

    private Categoria[] categoriaLista;
    private Fornecedor[] fornecedorLista;
    
    public CadastroProduto() {
        ArrayList <Categoria> cLista = new CategoriaDAO ().listaDeCategorias();
        categoriaLista = new Categoria[cLista.size()];
        cLista.toArray(categoriaLista);
        ArrayList <Fornecedor> fLista = new FornecedorDAO().listaDeFornecedores();
        fornecedorLista = new Fornecedor[fLista.size()];
        fLista.toArray(fornecedorLista);
        
        initComponents();
        setBackground(InicializadorLookAndFeel.COR_FOREGROUND);
        
        comboBoxCategoria.addActionListener(new ControladorCadastroLista(this));
        botaoAdd.addActionListener(new ControladorCadastroLista(this));
        botaoLimpar.addActionListener(new ControladorCadastroLista(this));
        
        msgErro.setText("");
        
        comboBoxCategoria.addActionListener(new ControladorCadastroLista(this));
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        campoNome = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        campoUnidade = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        campoValor = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        comboBoxFornecedor = new javax.swing.JComboBox<>();
        jLabel5 = new javax.swing.JLabel();
        campoCategoria = new javax.swing.JTextField();
        botaoLimpar = new barestoque.view.componentes.JNegativeButton();
        botaoAdd = new barestoque.view.componentes.JPositiveButton();
        msgErro = new javax.swing.JLabel();
        comboBoxCategoria = new javax.swing.JComboBox<>();

        setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Cadastrar Produto", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION));

        jLabel1.setText("Nome:");

        jLabel2.setText("Valor:");

        jLabel3.setText("Unidade:");

        campoValor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                campoValorActionPerformed(evt);
            }
        });

        jLabel4.setText("Fornecedor:");

        comboBoxFornecedor.setModel(new javax.swing.DefaultComboBoxModel<Fornecedor> (fornecedorLista)
        );

        jLabel5.setText("Categoria: ");

        campoCategoria.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                campoCategoriaActionPerformed(evt);
            }
        });

        botaoLimpar.setText("X");
        botaoLimpar.setPreferredSize(new java.awt.Dimension(40, 40));

        botaoAdd.setText("+");
        botaoAdd.setPreferredSize(new java.awt.Dimension(40, 40));

        msgErro.setText("jLabel6");

        comboBoxCategoria.setModel(new javax.swing.DefaultComboBoxModel<Categoria> (categoriaLista));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(campoNome, javax.swing.GroupLayout.Alignment.TRAILING)
            .addComponent(campoUnidade)
            .addComponent(campoValor)
            .addComponent(comboBoxFornecedor, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(botaoAdd, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(botaoLimpar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4)
                    .addComponent(jLabel3)
                    .addComponent(jLabel2)
                    .addComponent(jLabel5)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(3, 3, 3)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(msgErro)
                            .addComponent(jLabel1))))
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addComponent(comboBoxCategoria, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(campoCategoria, javax.swing.GroupLayout.DEFAULT_SIZE, 407, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(msgErro)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(campoNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(campoUnidade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(campoValor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(campoCategoria, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(comboBoxCategoria, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(comboBoxFornecedor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(botaoLimpar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(botaoAdd, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void campoValorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_campoValorActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_campoValorActionPerformed

    private void campoCategoriaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_campoCategoriaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_campoCategoriaActionPerformed

    public JButton getBotaoAdd() {
        return botaoAdd;
    }

    public JButton getBotaoLimpar() {
        return botaoLimpar;
    }

    public JTextField getCampoCategoria() {
        return campoCategoria;
    }

    public JTextField getCampoNome() {
        return campoNome;
    }

    public JTextField getCampoUnidade() {
        return campoUnidade;
    }

    public JTextField getCampoValor() {
        return campoValor;
    }

    public JComboBox<Fornecedor> getComboBoxFornecedor() {
        return comboBoxFornecedor;
    }

    public JComboBox<Categoria> getComboBoxCategoria() {
        return comboBoxCategoria;
    }
    
    public JLabel getMsgErro() {
        return msgErro;
    }
    
    public void limparDados ()
    {
        campoNome.setText("");
        campoCategoria.setText("");
        campoUnidade.setText("");
        campoValor.setText("");
        msgErro.setText("");
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botaoAdd;
    private javax.swing.JButton botaoLimpar;
    private javax.swing.JTextField campoCategoria;
    private javax.swing.JTextField campoNome;
    private javax.swing.JTextField campoUnidade;
    private javax.swing.JTextField campoValor;
    private javax.swing.JComboBox<Categoria> comboBoxCategoria;
    private javax.swing.JComboBox<Fornecedor> comboBoxFornecedor;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel msgErro;
    // End of variables declaration//GEN-END:variables
}
