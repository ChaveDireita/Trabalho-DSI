/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package barestoque.view.telas.produto;

import barestoque.DAO.CategoriaDAO;
import barestoque.DAO.FornecedorDAO;
import barestoque.DAO.ProdutoDAO;
import barestoque.controller.ControladorCadastroLista;
import barestoque.model.Categoria;
import barestoque.model.Fornecedor;
import barestoque.model.Produto;
import barestoque.view.InicializadorLookAndFeel;
import barestoque.view.componentes.TabelaModelo;
import java.util.ArrayList;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author nolas
 */
public class ListaProduto extends javax.swing.JPanel {

    private Categoria[] listaCategoria;
    
    public ListaProduto() {
        ArrayList <Categoria> lCategoria = new CategoriaDAO ().listaDeCategorias();
        listaCategoria = new Categoria[lCategoria.size()];
        lCategoria.toArray(listaCategoria);
                
        initComponents();
        setBackground(InicializadorLookAndFeel.COR_FOREGROUND);
        
        comboBoxCategoria.addActionListener(new ControladorCadastroLista(this));
        
        atualizar ();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents()
    {

        jScrollPane1 = new javax.swing.JScrollPane();
        tabelaProduto = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        comboBoxCategoria = new javax.swing.JComboBox<>();

        setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Lista de Produtos", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION));

        tabelaProduto.setBorder(new javax.swing.border.StrokeBorder(new java.awt.BasicStroke (1f), InicializadorLookAndFeel.COR_BACKGROUND));
        tabelaProduto.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][]
            {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String []
            {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        tabelaProduto.setFillsViewportHeight(true);
        tabelaProduto.setRowHeight(28);
        jScrollPane1.setViewportView(tabelaProduto);

        jLabel1.setText("Categoria:");

        comboBoxCategoria.setModel(new javax.swing.DefaultComboBoxModel<Categoria> (listaCategoria));
        comboBoxCategoria.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                comboBoxCategoriaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 508, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(comboBoxCategoria, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(comboBoxCategoria, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void comboBoxCategoriaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comboBoxCategoriaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_comboBoxCategoriaActionPerformed


    public JTable getTabelaProduto() {
        return tabelaProduto;
    }

    public JComboBox<Categoria> getComboBoxCategoria() {
        return comboBoxCategoria;
    }
    
    
    
    public void atualizar ()
    {
        TabelaModelo tabelaModelo = new TabelaModelo();
        tabelaModelo.addColumn("Codigo");
        tabelaModelo.addColumn("Nome");
        tabelaModelo.addColumn("Valor");
        tabelaModelo.addColumn("Unidade");
        tabelaModelo.addColumn("Quantidade");
        tabelaModelo.addColumn("Fornecedor");
        
        
        ProdutoDAO pdao = new ProdutoDAO();
        Categoria c = (Categoria) comboBoxCategoria.getSelectedItem();
        if (c != null)
        {
            ArrayList <Produto> listaProduto = pdao.listaDeProdutosDeCategoria(c);
            for (Produto p : listaProduto)
                tabelaModelo.addRow(pdao.desmontarParaLista(p));

        }
        tabelaProduto.setModel(tabelaModelo);
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<Categoria> comboBoxCategoria;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tabelaProduto;
    // End of variables declaration//GEN-END:variables
}
